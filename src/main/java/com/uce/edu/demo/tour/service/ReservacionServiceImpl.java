package com.uce.edu.demo.tour.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.tour.modelo.Reservacion;
import com.uce.edu.demo.tour.modelo.TransporteAereo;
import com.uce.edu.demo.tour.modelo.TransporteTerrestre;
import com.uce.edu.demo.tour.repository.IReservacionRepository;
@Service
public class ReservacionServiceImpl implements IReservacionService {

	@Autowired
	private IReservacionRepository iReservacionRepository;
	@Autowired
	private TransporteAereo transporteAereo;
	@Autowired
	private TransporteTerrestre transporteTerrestre1;
	
	@Override
	public void insertarReservacion(Reservacion reservacion) {
		// TODO Auto-generated method stub
		System.out.println("DI desde Service"+ this.transporteAereo);
		System.out.println("DI desde Service"+ this.transporteTerrestre1);

		this.iReservacionRepository.insertarReservacion(reservacion);
	}

	@Override
	public Reservacion buscarReservacion(String numeroReservacion) {
		// TODO Auto-generated method stub
		return this.iReservacionRepository.buscarReservacion(numeroReservacion);
		//return null;
	}

	@Override
	public void actualizarReservacion(Reservacion reservacion) {
		// TODO Auto-generated method stub
		this.iReservacionRepository.actualizarReservacion(reservacion);
		
	}

	@Override
	public void eliminarReservacion(String numeroReservacion) {
		// TODO Auto-generated method stub
		this.iReservacionRepository.eliminarReservacion(numeroReservacion);
	}

}
