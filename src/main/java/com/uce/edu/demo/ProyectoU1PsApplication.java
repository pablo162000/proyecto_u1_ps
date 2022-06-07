package com.uce.edu.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.cine.Ticket;
import com.uce.edu.demo.cine.Ticket2;
import com.uce.edu.demo.cine.Ticket3;
import com.uce.edu.demo.consultorio.CitaMedica;
import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.repository.IEstudianteRepository;
import com.uce.edu.demo.service.IEstudianteService;

@SpringBootApplication
public class ProyectoU1PsApplication implements CommandLineRunner {
	
	@Autowired
	private IEstudianteService estudianteService;
	
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
		
		//Usar los 3 métodos restantes
		e.setCedula("1723069819");
		this.estudianteService.actualizarEstudiante(e);
		
		this.estudianteService.buscarPorApellido("Suntaxi");
		
		this.estudianteService.borrarEstudiante("1725435689");


	}
	
	

}
