package com.uce.edu.demo.tour.service;

import com.uce.edu.demo.tour.modelo.Alojamiento;

public interface IAlojamientoService {

	public void insertarAlojamiento(Alojamiento alojamiento);

	public Alojamiento buscarAlojamiento(String nombre);

	public void actualizarAlojamiento(Alojamiento alojamiento);

	public void eliminarAlojamiento(String nombre);

}
