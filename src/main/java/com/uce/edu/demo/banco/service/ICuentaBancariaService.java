package com.uce.edu.demo.banco.service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;

public interface ICuentaBancariaService {

	public void insertar(CuentaBancaria c);

	public CuentaBancaria buscar(String numero);

	public void actualizar(CuentaBancaria c);

	public void eliminar(String numero);

}
