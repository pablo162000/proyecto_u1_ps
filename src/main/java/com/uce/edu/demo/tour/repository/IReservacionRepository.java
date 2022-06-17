package com.uce.edu.demo.tour.repository;

import com.uce.edu.demo.tour.modelo.Reservacion;

public interface IReservacionRepository {

	//CRUD
	public void insertarReservacion(Reservacion reservacion);

	public Reservacion buscarReservacion(String numeroReservacion);

	public void actualizarReservacion(Reservacion reservacion);

	public void eliminarReservacion(String numeroReservacion);

}
