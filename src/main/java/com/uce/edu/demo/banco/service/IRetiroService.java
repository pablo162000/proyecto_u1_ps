package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import com.uce.edu.demo.banco.modelo.Retiro;

public interface IRetiroService {

	public void realizarRetiro(String numeroCtaOrigen, BigDecimal monto);

	public Retiro buscarRetiro(String numeroCuentaOrigen);

	public void actualizarRetiro(Retiro o);

	public void eliminarRetiro(String numeroCuentarigen);

}
