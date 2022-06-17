package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.tour.modelo.Alojamiento;
import com.uce.edu.demo.tour.modelo.Cliente;
import com.uce.edu.demo.tour.modelo.Reservacion;
import com.uce.edu.demo.tour.modelo.TransporteAereo;
import com.uce.edu.demo.tour.modelo.TransporteTerrestre;
import com.uce.edu.demo.tour.service.AlojamientoServiceImpl;
import com.uce.edu.demo.tour.service.ClienteServiceImpl;
import com.uce.edu.demo.tour.service.ReservacionServiceImpl;

@SpringBootApplication
public class ProyectoU1PsApplication implements CommandLineRunner {

	@Autowired
	private TransporteAereo transporteAereo;
	@Autowired
	private TransporteAereo transporteAereo1;
	@Autowired
	private TransporteTerrestre transporteTerrestre;
	@Autowired
	private TransporteTerrestre transporteTerrestre1;
	@Autowired
	private ClienteServiceImpl clienteServiceImpl;
	@Autowired
	private AlojamientoServiceImpl alojamientoServiceImpl;
	@Autowired
	private ReservacionServiceImpl reservacionServiceImpl;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1PsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


		System.out.println("EJEMPLO SINGLETON");
		this.transporteAereo.setDestino("Sidney");
		this.transporteAereo.setHorasViaje(15);
		System.out.println(this.transporteAereo);
		System.out.println("----------------------------------------------------");
		System.out.println(this.transporteAereo1);
		System.out.println("----------------------------------------------------");
		this.transporteAereo1.setDestino("Ciudad de Mexico");
		System.out.println(this.transporteAereo1);

		System.out.println();
		System.out.println("EJEMPLO PROTOTYPE");
		this.transporteTerrestre.setDestino("Guayaquil");
		this.transporteTerrestre .setHorasViaje(9);
		System.out.println(this.transporteTerrestre);
		System.out.println("----------------------------------------------------");
		System.out.println(this.transporteTerrestre1);
		
		Cliente cliente= new Cliente();
		cliente.setNombre("Pablo");
		cliente.setApellido("Suntaxi");
		
		clienteServiceImpl.insertarCliente(cliente);
		
		Alojamiento alojamiento = new Alojamiento();
		alojamiento.setNombre("Hotel 1");
		alojamiento.setPrecio(new BigDecimal(200));
		alojamiento.setTipo("VIP");
		
		alojamientoServiceImpl.insertarAlojamiento(alojamiento);
		
		Reservacion reservacion= new Reservacion();
		reservacion.setFechadeIngreso(LocalDateTime.now());
		reservacion.setAlojamiento(alojamiento);
		reservacion.setHuesped(cliente);
		reservacion.setNumeroReservacion("123");
		System.out.println();
		reservacionServiceImpl.insertarReservacion(reservacion);
		
		
	
		
		
		
	}

}
