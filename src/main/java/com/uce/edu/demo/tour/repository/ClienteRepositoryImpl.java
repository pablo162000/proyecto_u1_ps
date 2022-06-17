package com.uce.edu.demo.tour.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.tour.modelo.Cliente;
@Repository
public class ClienteRepositoryImpl implements IClienteRepository {

	@Override
	public void insertarCliente(Cliente cliente) {

		System.out.println("SE ha insertado el cliente: " + cliente);
	}

	@Override
	public Cliente buscarCliente(String nombre, String apellido) {

		System.out.println("Se ha buscado el cliente " + nombre + " " + apellido);
		Cliente cliente = new Cliente();
		cliente.setNombre(nombre);
		cliente.setApellido(apellido);
		return cliente;
	}

	@Override
	public void actualizarCliente(Cliente cliente) {

		System.out.println("Se ha actaulizado el cliente: " + cliente);
	}

	@Override
	public void eliminarCliente(String nombre, String apellido) {

		System.out.println("Se ha eliminado el cliente: " + nombre + apellido);
	}

}
