package com.uce.edu.demo.tour.repository;

import com.uce.edu.demo.tour.modelo.Cliente;

public interface IClienteRepository {

	// CRUD

	public void insertarCliente(Cliente cliente);

	public Cliente buscarCliente(String nombre, String apellido);

	public void actualizarCliente(Cliente cliente);

	public void eliminarCliente(String nombre, String apellido);

}
