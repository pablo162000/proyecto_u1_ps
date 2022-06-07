package com.uce.edu.demo.service;

import com.uce.edu.demo.modelo.Matricula;

public interface IMatriculaService {

	public void ingresarMatricula(Matricula m);

	public Matricula buscarPorNumero(String numero);

	public void actualizarMatricula(Matricula e);

	public void borrarMatricula(String numero);

}
