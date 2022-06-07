package com.uce.edu.demo.repository;

import com.uce.edu.demo.modelo.Matricula;

public interface IMatriculaRepository {
	//CRUD
		// C: crear/insertar
		public void insertar(Matricula e);
		
		//R:  leer/buscar
		public Matricula buscar(String numero);
		
		//U: actualizar
		public void actualizar(Matricula m) ;
		
		//D: eliminar
		public void eliminar(String numero);
		
		

}
