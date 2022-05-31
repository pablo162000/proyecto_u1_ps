package com.uce.edu.demo.consultorio;

import org.springframework.stereotype.Component;

//les voy a poner una metadata
@Component
public class Paciente {
	
	
	private String nombre;
	private Integer edad;
	
	//GET Y SET
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
	
	

}
