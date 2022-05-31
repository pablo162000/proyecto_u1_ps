package com.uce.edu.demo.cine;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Ticket3 {

	private LocalDateTime fecha;

	// 3) DI por metodos set
	private Cliente cliente;//  a su metodo Set le pongo @Autowired
	private SalaCine salaCine;//  a su metodo Set le pongo @Autowired



	public String generarTicket(LocalDateTime fecha, String nombre, String direccion, int numeroSala, String tiposala,
			String pelicula) {

		this.fecha = fecha;
		this.cliente.setNombre(nombre);
		this.cliente.setDireccion(direccion);

		this.salaCine.setNumeroSala(numeroSala);
		this.salaCine.setTipoSala(tiposala);
		this.salaCine.setPelicula(pelicula);

		return "Se genero el ticket 3";
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

	@Autowired
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public SalaCine getSalaCine() {
		return salaCine;
	}

	@Autowired
	public void setSalaCine(SalaCine salaCine) {
		this.salaCine = salaCine;
	}

}
