package com.uce.edu.demo.tour.modelo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value  = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class TransporteAereo {
	
	private String destino;
	private Integer horasViaje;
	
	
	@Override
	public String toString() {
		return "TransporteAereo [destino=" + destino + ", horasViaje=" + horasViaje + "]";
	}
	//SET Y GET 
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public Integer getHorasViaje() {
		return horasViaje;
	}
	public void setHorasViaje(Integer horasViaje) {
		this.horasViaje = horasViaje;
	}
	
	

}
