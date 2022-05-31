package com.uce.edu.demo.cine;

import org.springframework.stereotype.Component;

@Component
public class SalaCine {
	
	private Integer numeroSala;
	private String tipoSala;
	private String pelicula;
	
	
	public String getPelicula() {
		return pelicula;
	}
	public void setPelicula(String pelicula) {
		this.pelicula = pelicula;
	}
	//SET Y GET
	public Integer getNumeroSala() {
		return numeroSala;
	}
	public void setNumeroSala(Integer numeroSala) {
		this.numeroSala = numeroSala;
	}
	public String getTipoSala() {
		return tipoSala;
	}
	public void setTipoSala(String tipoSala) {
		this.tipoSala = tipoSala;
	}
	

}
