package com.uce.edu.demo.bodega.service;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.bodega.modelo.Inventario;
import com.uce.edu.demo.bodega.modelo.Producto;

public interface IInventarioService {
	public Inventario insertarInventario(Producto producto);

	public List<Inventario> consultar(List<Inventario> lista, LocalDateTime fecha);

	public void actualizarInventario(Inventario inventario);

	public void eliminarInventario(String nombre);

}
