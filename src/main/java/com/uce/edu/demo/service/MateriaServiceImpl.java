package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.Materia;
import com.uce.edu.demo.repository.IMateriaRepository;

@Service
public class MateriaServiceImpl implements IMateriaService {

	@Autowired
	private IMateriaRepository materialRepository;

	@Override
	public void ingresarMateria(Materia e) {
		// TODO Auto-generated method stub
		this.materialRepository.insertar(e);

	}

	@Override
	public Materia buscarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return this.materialRepository.buscar(nombre);
	}

	@Override
	public void actualizarMateria(Materia e) {
		// TODO Auto-generated method stub
		this.materialRepository.actualizar(e);
	}

	@Override
	public void borrarMateria(String nombre) {
		// TODO Auto-generated method stub
		this.materialRepository.eliminar(nombre);

	}

}
