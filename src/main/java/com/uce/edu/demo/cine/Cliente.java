package com.uce.edu.demo.cine;

import org.springframework.stereotype.Component;

@Component
public class Cliente {
	
	private String nombre;
	private String direccion;
	
	// SET Y GET
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	

}
