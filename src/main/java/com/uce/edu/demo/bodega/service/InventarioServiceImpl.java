package com.uce.edu.demo.bodega.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.bodega.modelo.Inventario;
import com.uce.edu.demo.bodega.modelo.Producto;
import com.uce.edu.demo.bodega.repository.IInventarioRepository;

@Service
public class InventarioServiceImpl implements IInventarioService {

	@Autowired
	private IInventarioRepository iInventarioRepository;

	@Autowired
	private IGestorInventarioService gest;

	@Override
	public Inventario insertarInventario(Producto producto) {

		iInventarioRepository.insertarInventario(producto);

		Inventario in = this.gest.transformar(producto);
		return in;

	}

	@Override
	public void actualizarInventario(Inventario inventario) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminarInventario(String nombre) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Inventario> consultar(List<Inventario> lista, LocalDateTime fecha) {
		// TODO Auto-generated method stub
		List<Inventario> listafinal = new ArrayList<>();
		for (Inventario i : lista) {
			if (i.getFechaIngreso().isAfter(fecha) || i.getFechaIngreso().isEqual(fecha)) {
				listafinal.add(i);
			}
		}
		return listafinal;
	}

}
