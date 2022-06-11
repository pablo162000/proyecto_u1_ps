package com.uce.edu.demo.banco.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.banco.modelo.Deposito;
import com.uce.edu.demo.banco.modelo.Transferencia;

public interface IDepositoRepository {
	//CRUD
	public void insertarDeposito(Deposito o);
	public Deposito buscarDeposito(String numeroCuentaDestino);
	public void actualizarDeposito(Deposito o);
	public void eliminar(String numeroCuentaDestino);
	public List<Deposito> consultar(String cuente, LocalDateTime fechainicio, LocalDateTime fechafin);


}