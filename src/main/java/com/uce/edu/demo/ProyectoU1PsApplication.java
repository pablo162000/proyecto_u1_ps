package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.bodega.modelo.Inventario;
import com.uce.edu.demo.bodega.modelo.Producto;
import com.uce.edu.demo.bodega.service.IGestorInventarioService;
import com.uce.edu.demo.bodega.service.IInventarioService;

@SpringBootApplication
public class ProyectoU1PsApplication implements CommandLineRunner {

	
	@Autowired
	private IInventarioService iInventarioService;
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1PsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Inventario> listafinal= new ArrayList<>();
		Producto producto1 = new Producto();
		producto1.setCantidad(100);
		producto1.setCostoCompra(new BigDecimal(2.5));
		producto1.setNombre("Queso");
		producto1.setFechaIngreso(LocalDateTime.of(2022, 2, 5, 15, 50, 5));
		listafinal.add(iInventarioService.insertarInventario(producto1));

		Producto producto2 = new Producto();
		producto2.setCantidad(50);
		producto2.setCostoCompra(new BigDecimal(5.5));
		producto2.setNombre("Shampoo");
		producto2.setFechaIngreso(LocalDateTime.of(2022, 3, 5, 15, 50, 5));		
		listafinal.add(iInventarioService.insertarInventario(producto2));
		
		Producto producto3 = new Producto();
		producto3.setCantidad(500);
		producto3.setCostoCompra(new BigDecimal(6.5));
		producto3.setNombre("Jabon");
		producto3.setFechaIngreso(LocalDateTime.of(2022, 4, 5, 15, 50, 6));		
		listafinal.add(iInventarioService.insertarInventario(producto3));
		
		Producto producto4 = new Producto();
		producto4.setCantidad(400);
		producto4.setCostoCompra(new BigDecimal(2.55));
		producto4.setNombre("Galletas");
		producto4.setFechaIngreso(LocalDateTime.of(2022, 5, 6, 12, 50, 8));		
		listafinal.add(iInventarioService.insertarInventario(producto4));
		
		Producto producto5 = new Producto();
		producto5.setCantidad(350);
		producto5.setCostoCompra(new BigDecimal(2.99));
		producto5.setNombre("Mermelada");
		producto5.setFechaIngreso(LocalDateTime.of(2022, 1, 25, 11, 25, 3));		
		listafinal.add(iInventarioService.insertarInventario(producto5));

        System.out.println("//////////////////////////////////////////////////////////////////");

        System.out.println(iInventarioService.consultar(listafinal, LocalDateTime.of(2022, 3, 5, 15, 50, 5)));
        
		

	}

}
