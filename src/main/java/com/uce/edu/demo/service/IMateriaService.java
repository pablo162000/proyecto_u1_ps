package com.uce.edu.demo.service;

import com.uce.edu.demo.modelo.Materia;

public interface IMateriaService {

	public void ingresarMateria(Materia e);

	public Materia buscarPorNombre(String nombre);

	public void actualizarMateria(Materia e);

	public void borrarMateria(String nombre);

}
