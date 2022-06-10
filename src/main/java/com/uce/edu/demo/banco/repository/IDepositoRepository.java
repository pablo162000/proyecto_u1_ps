package com.uce.edu.demo.banco.repository;

import com.uce.edu.demo.banco.modelo.Deposito;

public interface IDepositoRepository {
	//CRUD
	public void insertarDeposito(Deposito o);
	public Deposito buscarDeposito(String numeroCuentaDestino);
	public void actualizarDeposito(Deposito o);
	public void eliminar(String numeroCuentaDestino);


}