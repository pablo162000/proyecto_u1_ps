package com.uce.edu.demo.tour.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.tour.modelo.Reservacion;
@Repository
public class ReservacionRepositoryImpl implements IReservacionRepository {

	@Override
	public void insertarReservacion(Reservacion reservacion) {

		System.out.println("Se ha insertado la reservacion: " + reservacion);
	}

	@Override
	public Reservacion buscarReservacion(String numeroReservacion) {
		// TODO Auto-generated method stub
		System.out.println("Se ha buscado la reservacion " + numeroReservacion);
		Reservacion reservacion = new Reservacion();
		reservacion.setNumeroReservacion(numeroReservacion);
		return reservacion;
	}

	@Override
	public void actualizarReservacion(Reservacion reservacion) {

		System.out.println("Se ha actualizado la reservacion: " + reservacion);
	}

	@Override
	public void eliminarReservacion(String numeroReservacion) {

		System.out.println("Se ha eliminado la reservacion " + numeroReservacion);
	}

}
