package com.uce.edu.demo.tour.modelo;

import java.math.BigDecimal;

public class Alojamiento {
	private String nombre;
	private String tipo;
	private BigDecimal precio;
	
	
	@Override
	public String toString() {
		return "Alojamiento [nombre=" + nombre + ", tipo=" + tipo + ", precio=" + precio + "]";
	}
	//SET Y GET
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public BigDecimal getPrecio() {
		return precio;
	}
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
