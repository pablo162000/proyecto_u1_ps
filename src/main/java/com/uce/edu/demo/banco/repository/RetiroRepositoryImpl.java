package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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

	@Override
	public List<Retiro> consultar(String cuenta, LocalDateTime fechainicio, LocalDateTime fechafin) {
		// TODO Auto-generated method stub
		List<Retiro> listaRetiro = new ArrayList<>();
		Retiro retiro1 = new Retiro();
		retiro1.setFecha(LocalDateTime.of(2022, 12,20,13,34,10));
		retiro1.setMonto(new BigDecimal(25));
		retiro1.setNumeroCuentaorigen("1239");
		
		listaRetiro.add(retiro1);
		return listaRetiro;
	}

}
