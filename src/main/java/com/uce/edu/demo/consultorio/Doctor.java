package com.uce.edu.demo.consultorio;

import org.springframework.stereotype.Component;

//les voy a poner una metadata
@Component
public class Doctor {
	
	private String nombre;
	private String apellido;
	private Integer edad;
	private String ciudad;
	
		// SET Y GET

	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
	

}
