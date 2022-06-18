package com.uce.edu.demo;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Materia;
import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.modelo.ProfesorGeneral;
import com.uce.edu.demo.modelo.ProfesorMateria;
import com.uce.edu.demo.service.IMatriculaService;

@SpringBootApplication
public class ProyectoU1PsApplication implements CommandLineRunner {

	@Autowired
	private ProfesorGeneral profesorGeneral;

	@Autowired
	private ProfesorGeneral profesorGeneral1;
	@Autowired
	private ProfesorMateria profesorMateria;

	@Autowired
	private ProfesorMateria profesorMateria1;
	@Autowired
	private IMatriculaService iMatriculaService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1PsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		this.profesorGeneral.setNombre("Pablo");
		this.profesorGeneral.setApellido("Suntaxi");

		System.out.println("EJEMPLO SINGLETON");
		System.out.println(this.profesorGeneral);
		System.out.println("-----------------------------------");
		System.out.println(this.profesorGeneral1);
		this.profesorGeneral1.setNombre("Pepito");
		System.out.println("-----------------------------------");
		System.out.println(this.profesorGeneral);
		System.out.println("-----------------------------------");
		System.out.println(this.profesorGeneral1);
		System.out.println();
		System.out.println("EJEMPLO PROTOTYPE");
		this.profesorMateria.setNombre("Daniel");
		this.profesorMateria.setApellido("Teran");
		System.out.println(this.profesorMateria);
		System.out.println("-----------------------------------");

		System.out.println(this.profesorMateria1);
		System.out.println("-----------------------------------");

		Matricula matricula1 = new Matricula();
		matricula1.setEstudiante(new Estudiante());
		matricula1.setMateria(new ArrayList<Materia>());
		matricula1.setNumero("123");
		this.iMatriculaService.ingresarMatricula(matricula1);

	}

}