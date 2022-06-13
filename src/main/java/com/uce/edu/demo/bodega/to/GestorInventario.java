package com.uce.edu.demo.bodega.to;

import java.time.LocalDateTime;

public class GestorInventario {
	
	private String  nombre;
	private double costoVenta;
	private Integer cantidad;
	private LocalDateTime fechaIngreso;
	
	
	
	
	@Override
	public String toString() {
		return "GestorInventario [nombre=" + nombre + ", costoVenta=" + costoVenta + ", cantidad=" + cantidad
				+ ", fechaIngreso=" + fechaIngreso + "]";
	}
	public double getCostoVenta() {
		return costoVenta;
	}
	public void setCostoVenta(double costoVenta) {
		this.costoVenta = costoVenta;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public LocalDateTime getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(LocalDateTime fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
