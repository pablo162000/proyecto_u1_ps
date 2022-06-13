package com.uce.edu.demo.bodega.service;

import com.uce.edu.demo.bodega.modelo.Inventario;
import com.uce.edu.demo.bodega.modelo.Producto;

public interface IGestorInventarioService {

	public Inventario transformar(Producto producto);

}
