package com.uce.edu.demo.tour.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.tour.modelo.Alojamiento;
import com.uce.edu.demo.tour.repository.IAlojamientoRepository;
@Service
public class AlojamientoServiceImpl implements IAlojamientoService {

	@Autowired
	private IAlojamientoRepository iAlojamientoRepository;
	@Override
	public void insertarAlojamiento(Alojamiento alojamiento) {
		// TODO Auto-generated method stub
		this.iAlojamientoRepository.insertarAlojamiento(alojamiento);
	}

	@Override
	public Alojamiento buscarAlojamiento(String nombre) {
		// TODO Auto-generated method stub
		return this.iAlojamientoRepository.buscarAlojamiento(nombre);
	}

	@Override
	public void actualizarAlojamiento(Alojamiento alojamiento) {
		// TODO Auto-generated method stub
		this.iAlojamientoRepository.actualizarAlojamiento(alojamiento);
	}

	@Override
	public void eliminarAlojamiento(String nombre) {
		// TODO Auto-generated method stub
		this.iAlojamientoRepository.eliminarAlojamiento(nombre);
		
	}

}
