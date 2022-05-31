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

@SpringBootApplication
public class ProyectoU1PsApplication implements CommandLineRunner {
	@Autowired
	//private CitaMedica cita;
	private CitaMedica cita2;
	
	@Autowired
	private Ticket ticket;
	@Autowired
	private Ticket2 ticket2;
	@Autowired
	private Ticket3 ticket3;

	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1PsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Mi primer proyecto Spring framework");

		String respuesta = this.cita2.agendar(LocalDateTime.now(), "Javier", "Teran", 32, "Quito", "Paul", 0);
		//System.out.println(respuesta);
		
		
		///////////////////////////////////////////////////////////
		
		String respuesta1= this.ticket.generarTicket(LocalDateTime.now(), "Pablo ", "Condado",7,"VIP" , "Rambo");
		System.out.println(respuesta1);
		String respuesta2= this.ticket2.generarTicket(LocalDateTime.now(), "Pablo ", "Condado",7,"VIP" , "Rambo");
		System.out.println(respuesta2);
		String respuesta3= this.ticket3.generarTicket(LocalDateTime.now(), "Pablo ", "Condado",7,"VIP" , "Rambo");
		System.out.println(respuesta3);


	}
	
	

}
