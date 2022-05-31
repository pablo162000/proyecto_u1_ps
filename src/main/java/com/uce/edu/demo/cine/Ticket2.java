package com.uce.edu.demo.cine;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Ticket2 {

	private LocalDateTime fecha;

	// 2) DI por constructor
	private Cliente cliente;
	private SalaCine salaCine;

	public Ticket2(Cliente cliente, SalaCine salaCine) {
		this.cliente = cliente;
		this.salaCine = salaCine;

	}

	public String generarTicket(LocalDateTime fecha, String nombre, String direccion, int numeroSala, String tiposala,
			String pelicula) {

		this.fecha = fecha;
		this.cliente.setNombre(nombre);
		this.cliente.setDireccion(direccion);

		this.salaCine.setNumeroSala(numeroSala);
		this.salaCine.setTipoSala(tiposala);
		this.salaCine.setPelicula(pelicula);

		return "Se genero el ticket 2";
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public SalaCine getSalaCine() {
		return salaCine;
	}

	public void setSalaCine(SalaCine salaCine) {
		this.salaCine = salaCine;
	}

}
