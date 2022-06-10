package com.uce.edu.demo.banco.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Retiro {
	
	private LocalDateTime fecha;
	private String numeroCuentaOrigen;
	private BigDecimal monto;
	
	
	@Override
	public String toString() {
		return "Retiro [fecha=" + fecha + ", numeroCuentaorigen=" + numeroCuentaOrigen + ", monto=" + monto + "]";
	}
	
	//SET Y GET
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public String getNumeroCuentaorigen() {
		return numeroCuentaOrigen;
	}
	public void setNumeroCuentaorigen(String numeroCuentaorigen) {
		this.numeroCuentaOrigen = numeroCuentaorigen;
	}
	public BigDecimal getMonto() {
		return monto;
	}
	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}

	
}
