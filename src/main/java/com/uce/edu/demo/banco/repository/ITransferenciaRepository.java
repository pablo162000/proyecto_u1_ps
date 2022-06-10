package com.uce.edu.demo.banco.repository;

import com.uce.edu.demo.banco.modelo.Transferencia;

public interface ITransferenciaRepository {
	// CRUD
	public void insertar(Transferencia t);

	public Transferencia buscarTransferencia(String numeroCuentaOrigen, String numeroCuentaDestino);

	public void actualizarTransferencia(Transferencia t);

	public void eliminartransferencia(String numeroCuentaOrigen, String numeroCuentaDestino);

}
