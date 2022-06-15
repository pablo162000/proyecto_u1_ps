package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.modelo.ProfesorGeneral;
import com.uce.edu.demo.modelo.ProfesorMateria;
import com.uce.edu.demo.repository.IMatriculaRepository;
@Service
public class MatriculaSeviceImpl implements IMatriculaService{

	@Autowired
	private IMatriculaRepository matriculaRepository;
	@Autowired
	private ProfesorGeneral profesorGeneral;
	@Autowired
	private ProfesorMateria profesorMateria;
	@Override
	public void ingresarMatricula(Matricula m) {
		// TODO Auto-generated method stub
		System.out.println("DI desde Service "+ this.profesorGeneral);
		System.out.println("DI desde Service "+ this.profesorMateria);

		this.matriculaRepository.insertar(m);
		
	}

	@Override
	public Matricula buscarPorNumero(String numero) {
		// TODO Auto-generated method stub
		
		return this.matriculaRepository.buscar(numero);
	}

	@Override
	public void actualizarMatricula(Matricula e) {

		this.matriculaRepository.actualizar(e);
		
	}

	@Override
	public void borrarMatricula(String numero) {

		this.matriculaRepository.eliminar(numero);
	}

}
