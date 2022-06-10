package com.uce.edu.demo.banco.repository;

import com.uce.edu.demo.banco.modelo.Retiro;

public interface IRetiroRepository {

	//CRUD
		public void insertarRetiro(Retiro r);
		public Retiro buscarRetiro(String numeroCuentaOrigen);
		public void actualizarRetiro(Retiro o);
		public void eliminarRetiro(String numeroCuentarigen);
}
