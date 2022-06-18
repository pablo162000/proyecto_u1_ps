package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
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
	
	@Lookup
	public ProfesorGeneral obtenerProfesorG() {
//		System.out.println("ddddddddddddddddddd");

		return null;
	}
	@Lookup
	public ProfesorMateria obtenerProfesorM() {
//		ProfesorMateria profeM= new ProfesorMateria();
//		profeM.setApellido("Tapia");
//		profeM.setNombre("Jose");
//		System.out.println("ddddddddddddddddddd");
		return null;
	}
	
	
	@Override
	public void ingresarMatricula(Matricula m) {
		// TODO Auto-generated method stub
		System.out.println("DI desde Service SINGLETON"+ this.profesorGeneral);
		System.out.println("DI desde Service Prototype"+ this.profesorMateria);
		System.out.println("DI desde un metodo General" +this.obtenerProfesorG());

		System.out.println("DI desde un metodo Materia" +this.obtenerProfesorM());

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
