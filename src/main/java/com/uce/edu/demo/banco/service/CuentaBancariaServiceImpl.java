package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.repository.ICuentaBancariaRepository;

@Service
public class CuentaBancariaServiceImpl implements ICuentaBancariaService {

	@Autowired
	private ICuentaBancariaRepository bancariaRepository;

	@Override
	public void actualizar(CuentaBancaria c) {
		// TODO Auto-generated method stub
		this.bancariaRepository.actualizar(c);
	}

	@Override
	public CuentaBancaria buscar(String numero) {
		// TODO Auto-generated method stub
		//Se puede llamar al repository porque no hay logica nueva de negocio, sin embargo debe haber logica qque es la linea de abajo 
		return this.bancariaRepository.buscar(numero);
	}

	@Override
	public void insertar(CuentaBancaria c) {

		this.bancariaRepository.insertarCuentaBancaria(c);
	}

	@Override
	public void eliminar(String numero) {

		this.bancariaRepository.eliminar(numero);
	}

	@Override
	public BigDecimal calcularInteres(String numeroCta, BigDecimal saldo) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
