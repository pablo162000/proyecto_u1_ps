package com.uce.edu.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Materia;
import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.service.IEstudianteService;
import com.uce.edu.demo.service.IMateriaService;
import com.uce.edu.demo.service.IMatriculaService;

@SpringBootApplication
public class ProyectoU1PsApplication implements CommandLineRunner {

	@Autowired
	private IEstudianteService estudianteService;

	@Autowired
	private IMateriaService materiaService;

	@Autowired
	private IMatriculaService matriculaService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1PsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Estudiante e = new Estudiante();
		e.setNombre("Pablo");
		e.setApellido("Suntaxi");
		e.setCedula("1724157688");
		this.estudianteService.ingresarEstudiante(e);

		Estudiante e1 = new Estudiante();
		e1.setNombre("Pepito");
		e1.setApellido("Perez");
		e1.setCedula("1725435689");
		this.estudianteService.ingresarEstudiante(e1);

		// Usar los 3 métodos restantes
		e.setCedula("1723069819");
		this.estudianteService.actualizarEstudiante(e);
		this.estudianteService.buscarPorApellido("Suntaxi");
		this.estudianteService.borrarEstudiante("1725435689");

		System.out.println("///////////////////////////////////////////////////");

		Materia materia = new Materia();
		materia.setNombre("Matematicas");
		materia.setSemestre("Sexto");
		this.materiaService.ingresarMateria(materia);
		this.materiaService.buscarPorNombre("Matematicas");
		materia.setSemestre("Septimo");
		this.materiaService.actualizarMateria(materia);
		this.materiaService.borrarMateria("Matematicas");

		Materia materia2 = new Materia();
		materia2.setNombre("Filosofia");
		materia2.setSemestre("Octavo");

		System.out.println("////////////////////////////////////////////////");

		Matricula matricula = new Matricula();
		matricula.setEstudiante(e);
		matricula.setNumero("01");
		matricula.setMateria(List.of(materia, materia2));

		this.matriculaService.ingresarMatricula(matricula);
		this.matriculaService.buscarPorNumero("4747");
		matricula.setNumero("02");
		this.matriculaService.actualizarMatricula(matricula);
		this.matriculaService.borrarMatricula("02");

	}

}
