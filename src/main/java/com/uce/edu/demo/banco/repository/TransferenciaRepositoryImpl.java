package com.uce.edu.demo.banco.repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Transferencia;

@Repository
public class TransferenciaRepositoryImpl implements ITransferenciaRepository {

	@Override
	public void insertar(Transferencia t) {
		// TODO Auto-generated method stub
		System.out.println("Aqui se inserta la transferencia en la base de datos " + t);
	}

	@Override
	public Transferencia buscarTransferencia(String numeroCuentaOrigen, String numeroCuentaDestino) {
		// TODO Auto-generated method stub
		System.out.println("Se busca la transferencia con cuenta de origen: " + numeroCuentaOrigen
				+ "y cuenta destino: " + numeroCuentaDestino);
		Transferencia transferencia = new Transferencia();
		transferencia.setNumeroCuentaDestino(numeroCuentaDestino);
		transferencia.setNumeroCuentaOrigen(numeroCuentaOrigen);
		return transferencia;
	}

	@Override
	public void actualizarTransferencia(Transferencia t) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado la transferencia: " + t);
	}

	@Override
	public void eliminartransferencia(String numeroCuentaOrigen, String numeroCuentaDestino) {
		// TODO Auto-generated method stub
		System.out.println("Se busca la transferencia con cuenta de origen: " + numeroCuentaOrigen
				+ "y cuenta destino: " + numeroCuentaDestino);

	}

	@Override
	public List<Transferencia> consultar(String cuente, LocalDateTime fechainicio, LocalDateTime fechafin) {
		// TODO Auto-generated method stub
		//Aqui deberia estar el sql a la base
		List<Transferencia> listaConsultada= new ArrayList<>();
		Transferencia trans1= new Transferencia();
		trans1.setFechaTransferencia(LocalDateTime.now());
		trans1.setNumeroCuentaDestino("1234");
		trans1.setNumeroCuentaOrigen("12567");
		
		listaConsultada.add(trans1);
		return listaConsultada;
	}

}
