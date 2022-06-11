package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.banco.modelo.Transferencia;

public interface ITransferenciaService {
	public void realizarTransferencia(String cuentaOrigen, String cuentaDestino, BigDecimal monto);

	public Transferencia buscarTransferencia(String numeroCuentaOrigen, String numeroCuentaDestino);

	public void actualizarTransferencia(Transferencia t);

	public void eliminartransferencia(String numeroCuentaOrigen, String numeroCuentaDestino);

	public List<Transferencia> consultar(String cuente, LocalDateTime fechainicio, LocalDateTime fechafin);

}
