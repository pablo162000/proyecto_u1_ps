package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import com.uce.edu.demo.banco.modelo.Transferencia;

public interface ITransferenciaService {
	public void realizarTransferencia(String cuentaOrigen, String cuentaDestino, BigDecimal monto);

	public Transferencia buscarTransferencia(String numeroCuentaOrigen, String numeroCuentaDestino);

	public void actualizarTransferencia(Transferencia t);

	public void eliminartransferencia(String numeroCuentaOrigen, String numeroCuentaDestino);

}
