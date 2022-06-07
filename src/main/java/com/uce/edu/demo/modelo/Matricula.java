package com.uce.edu.demo.modelo;

import java.util.List;

public class Matricula {

	private String numero;
	private Estudiante estudiante;
	private List<Materia> materia;

	// SET Y GETT

	@Override
	public String toString() {
		return "Matricula [numero=" + numero + ", estudiante=" + estudiante + ", materia=" + materia + "]";
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	public List<Materia> getMateria() {
		return materia;
	}

	public void setMateria(List<Materia> materia) {
		this.materia = materia;
	}

}
