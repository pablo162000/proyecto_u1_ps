package com.uce.edu.demo.tour.modelo;

import java.time.LocalDateTime;

public class Reservacion {
	
	private String numeroReservacion;
	private Cliente cliente;
	private Alojamiento alojamiento;
	private LocalDateTime fechadeIngreso;
	
	
	
	// SET Y GET

	@Override
	public String toString() {
		return "Reservacion [numeroReservacion=" + numeroReservacion + ", cliente=" + cliente + ", alojamiento="
				+ alojamiento + ", fechadeIngreso=" + fechadeIngreso + "]";
	}
	public Cliente getHuesped() {
		return cliente;
	}
	public void setHuesped(Cliente cliente) {
		this.cliente = cliente;
	}
	public Alojamiento getAlojamiento() {
		return alojamiento;
	}
	public void setAlojamiento(Alojamiento alojamiento) {
		this.alojamiento = alojamiento;
	}
	public LocalDateTime getFechadeIngreso() {
		return fechadeIngreso;
	}
	public void setFechadeIngreso(LocalDateTime fechadeIngreso) {
		this.fechadeIngreso = fechadeIngreso;
	}
	public String getNumeroReservacion() {
		return numeroReservacion;
	}
	public void setNumeroReservacion(String numeroReservacion) {
		this.numeroReservacion = numeroReservacion;
	}
		
	

}
