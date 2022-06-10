package com.uce.edu.demo.banco.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Deposito;

@Repository
public class DepositoRepositoryImpl implements IDepositoRepository {

	@Override
	public void insertarDeposito(Deposito d) {
		// TODO Auto-generated method stub
		System.out.println("Se creo el deposito: " + d);
	}

	@Override
	public Deposito buscarDeposito(String numeroCuentaDestino) {
		// TODO Auto-generated method stub
		System.out.println("Se ha buscado en la base el deposito: " + numeroCuentaDestino);
		Deposito deposito = new Deposito();
		deposito.setNumeroCuentaDestino(numeroCuentaDestino);
		return deposito;
	}

	@Override
	public void actualizarDeposito(Deposito o) {

		System.out.println("Se ha actualizado el deposito: " + o);
	}

	@Override
	public void eliminar(String numeroCuentaDestino) {
		System.out.println("Se ha eliminado el deposito: " + numeroCuentaDestino);

	}

}