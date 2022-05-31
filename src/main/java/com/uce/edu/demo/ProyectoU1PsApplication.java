package com.uce.edu.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.consultorio.CitaMedica;

@SpringBootApplication
public class ProyectoU1PsApplication implements CommandLineRunner {
	@Autowired
	//private CitaMedica cita;
	private CitaMedica cita2;

	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1PsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Mi primer proyecto Spring framework");

		String respuesta = this.cita2.agendar(LocalDateTime.now(), "Javier", "Teran", 32, "Quito", "Paul", 0);
		System.out.println(respuesta);

	}

}
