package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.banco.to.TransaccionTo;

public interface ITransaccionService {

	public void transferencia(String origen,String destino, BigDecimal monto);

	public void deposito(String destino, BigDecimal monto);

	public void retiro(String ctaRetiro, BigDecimal monto);
	
	public List<TransaccionTo> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin);

	
	
}
