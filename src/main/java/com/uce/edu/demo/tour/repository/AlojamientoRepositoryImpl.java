package com.uce.edu.demo.tour.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.tour.modelo.Alojamiento;
@Repository
public class AlojamientoRepositoryImpl implements IAlojamientoRepository {

	@Override
	public void insertarAlojamiento(Alojamiento alojamiento) {

		System.out.println("Se ha insertado el Alojamiento: " + alojamiento);
	}

	@Override
	public Alojamiento buscarAlojamiento(String nombre) {
		System.out.println("Se ha buscado el alojamiento " + nombre);
		Alojamiento alojamiento = new Alojamiento();
		alojamiento.setNombre(nombre);
		return alojamiento;
	}

	@Override
	public void actualizarAlojamiento(Alojamiento alojamiento) {

		System.out.println("Se ha acutalizado el alojamiento: " + alojamiento);
	}

	@Override
	public void eliminarAlojamiento(String nombre) {

		System.out.println("Se ha eliminado el alojamiento: " + nombre);
	}

}
