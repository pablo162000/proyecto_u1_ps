package com.uce.edu.demo.tour.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.tour.modelo.Cliente;
import com.uce.edu.demo.tour.repository.IClienteRepository;

@Service
public class ClienteServiceImpl implements IClienteService {
	
	@Autowired
    private IClienteRepository iClienteRepository;
	@Override
	public void insertarCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		this.iClienteRepository.insertarCliente(cliente);
	}

	@Override
	public Cliente buscarCliente(String nombre, String apellido) {
		// TODO Auto-generated method stub
		return this.iClienteRepository.buscarCliente(nombre, apellido);
	}

	@Override
	public void actualizarCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		this.iClienteRepository.actualizarCliente(cliente);
	}

	@Override
	public void eliminarCliente(String nombre, String apellido) {
		// TODO Auto-generated method stub
		this.iClienteRepository.eliminarCliente(nombre, apellido);
	}

}
