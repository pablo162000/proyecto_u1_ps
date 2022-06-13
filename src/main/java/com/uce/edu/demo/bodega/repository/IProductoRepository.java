package com.uce.edu.demo.bodega.repository;

import com.uce.edu.demo.bodega.modelo.Producto;

public interface IProductoRepository {
	
	//CRUD
	
	public void insertar(Producto producto);

	public void buscar(String nombre);

	public void actualizar(Producto producto);

	public void eliminarInventario(String nombre);


}
