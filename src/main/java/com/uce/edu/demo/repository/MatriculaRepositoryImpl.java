package com.uce.edu.demo.repository;

import com.uce.edu.demo.modelo.Matricula;

public class MatriculaRepositoryImpl implements IMatriculaRepository {

	@Override
	public void insertar(Matricula e) {
		// TODO Auto-generated method stub
		//Aqui se realiza la insercion en la base de datos
				System.out.println("Se ha insertado en la base la matricula "+ e);
	}

	@Override
	public Matricula buscar(String numero) {
		// TODO Auto-generated method stub
		Matricula m= new Matricula();
		m.setNumero(numero);
		return m;
	}

	@Override
	public void actualizar(Matricula m) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado en la base la matricula "+ m);

	}

	@Override
	public void eliminar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado en la base la matricula " + numero);

		
	}

	
}
