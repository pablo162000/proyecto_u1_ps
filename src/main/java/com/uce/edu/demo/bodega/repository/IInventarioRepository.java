package com.uce.edu.demo.bodega.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.bodega.modelo.Inventario;
import com.uce.edu.demo.bodega.modelo.Producto;

public interface IInventarioRepository {

	// CRUD

	public void insertarInventario(Producto producto);

	public void buscarInventario(String nombre);

	public void actualizarInventario(Inventario inventario);

	public void eliminarInventario(String nombre);

}
