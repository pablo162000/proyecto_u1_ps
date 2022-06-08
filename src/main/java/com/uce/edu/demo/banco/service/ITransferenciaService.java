package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

public interface ITransferenciaService {
	public void realizarTransferencia(String cuentaOrigen, String cuentaDestino, BigDecimal monto);

}
