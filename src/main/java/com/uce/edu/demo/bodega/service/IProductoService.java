package com.uce.edu.demo.bodega.service;

import com.uce.edu.demo.bodega.modelo.Producto;

public interface IProductoService {

	public void insertar(Producto producto);

	public void buscar(String nombre);

	public void actualizar(Producto producto);

	public void eliminarInventario(String nombre);

}
