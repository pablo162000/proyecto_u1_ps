package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Deposito;

@Repository
public class DepositoRepositoryImpl implements IDepositoRepository {

	@Override
	public void insertarDeposito(Deposito d) {
		// TODO Auto-generated method stub
		System.out.println("Se creo el deposito: " + d);
	}

	@Override
	public Deposito buscarDeposito(String numeroCuentaDestino) {
		// TODO Auto-generated method stub
		System.out.println("Se ha buscado en la base el deposito: " + numeroCuentaDestino);
		Deposito deposito = new Deposito();
		deposito.setNumeroCuentaDestino(numeroCuentaDestino);
		return deposito;
	}

	@Override
	public void actualizarDeposito(Deposito o) {

		System.out.println("Se ha actualizado el deposito: " + o);
	}

	@Override
	public void eliminar(String numeroCuentaDestino) {
		System.out.println("Se ha eliminado el deposito: " + numeroCuentaDestino);

	}

	@Override
	public List<Deposito> consultar(String cuente, LocalDateTime fechainicio, LocalDateTime fechafin) {
       List<Deposito> listaDeposito =new ArrayList<>();
       Deposito depo1 =new Deposito();
       depo1.setFecha(LocalDateTime.of(2021, 2,10,8,50,2));
       depo1.setMonto(new BigDecimal(20));
       depo1.setNumeroCuentaDestino("2345");
       
       Deposito depo2 =new Deposito();
       depo2.setFecha(LocalDateTime.of(2021, 3,15,8,50,9));
       depo2.setMonto(new BigDecimal(20));
       depo2.setNumeroCuentaDestino("1234");
       
       listaDeposito.add(depo2);
       listaDeposito.add(depo1);
		return listaDeposito;
	}

}