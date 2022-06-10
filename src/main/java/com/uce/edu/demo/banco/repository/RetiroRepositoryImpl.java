package com.uce.edu.demo.banco.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Retiro;
@Repository
public class RetiroRepositoryImpl implements IRetiroRepository {

	@Override
	public void insertarRetiro(Retiro r) {
		// TODO Auto-generated method stub
		System.out.println("Se ha realizado el retiro "+ r);
	}

	@Override
	public Retiro buscarRetiro(String numeroCuentaOrigen) {
		// TODO Auto-generated method stub
		System.out.println("Se ha buscado el retiro de:" + numeroCuentaOrigen );
		Retiro retiro=new Retiro();
		retiro.setNumeroCuentaorigen(numeroCuentaOrigen);
		
		return retiro;
	}

	@Override
	public void actualizarRetiro(Retiro o) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado el retiro: "+ o);
	}

	@Override
	public void eliminarRetiro(String numeroCuentarigen) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado el retiro: " + numeroCuentarigen);
	}

}
