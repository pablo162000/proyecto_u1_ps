package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;

@Repository
public class CuentaBancariaRepositoryImpl implements ICuentaBancariaRepository {

	@Override
	public void actualizar(CuentaBancaria c) {

		// Aqui hay que construir los sql
		System.out.println("Cuenta bancaria actualizada a " + c);
	}

	@Override
	public CuentaBancaria buscar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("Se busca la cuenta bancaria: " + numero);
		CuentaBancaria cta = new CuentaBancaria();
		cta.setNumero(numero);
		cta.setSaldo(new BigDecimal(100));
		cta.setTipo("C");
		return cta;
	}

	@Override
	public void insertarCuentaBancaria(CuentaBancaria c) {
		System.out.println("Cuenta bancaria insertada " + c);

	}

	@Override
	public void eliminar(String numero) {

		System.out.println("Cuenta bancaria eliminada " + numero);
	}

}