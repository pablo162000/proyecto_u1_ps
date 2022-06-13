package com.uce.edu.demo.bodega.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import com.uce.edu.demo.bodega.modelo.Inventario;
import com.uce.edu.demo.bodega.modelo.Producto;

@Service
public class GestorInventarioServiceImpl implements IGestorInventarioService {

	@Override
	public Inventario transformar(Producto producto) {
		Inventario inventario = new Inventario();
		inventario.setCantidad(producto.getCantidad());
		inventario.setCostoVenta(producto.getCostoCompra().multiply(new BigDecimal(1.22)));
		inventario.setNombre(producto.getNombre());
		inventario.setFechaIngreso(producto.getFechaIngreso());

		return inventario;
	}

}
