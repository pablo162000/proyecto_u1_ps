package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.banco.modelo.Deposito;

public interface IDepositoService {

	public void realizarDeposito(String numeroCtaDestino, BigDecimal monto);

	public Deposito buscarDeposito(String numeroCuentaDestino);

	public void actualizarDeposito(Deposito d);

	public void eliminarDeposito(String numeroCuentaDestino);

	public List<Deposito> consultar(String cuente, LocalDateTime fechainicio, LocalDateTime fechafin);

}
