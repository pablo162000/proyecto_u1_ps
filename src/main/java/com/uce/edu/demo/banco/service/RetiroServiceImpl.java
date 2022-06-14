package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.modelo.Retiro;
import com.uce.edu.demo.banco.repository.IRetiroRepository;
@Service
public class RetiroServiceImpl implements IRetiroService {
	
	@Autowired
	@Qualifier("ahorros")
	ICuentaBancariaService bancariaService;
	@Autowired
    IRetiroRepository iRetiroRepository;
	@Override
	public void realizarRetiro(String numeroCtaOrigen, BigDecimal monto) {
		// TODO Auto-generated method stub
		CuentaBancaria ctaOrigen = this.bancariaService.buscar(numeroCtaOrigen);
        BigDecimal saldoCuenta = ctaOrigen.getSaldo();
        BigDecimal saldoCuentafinal = saldoCuenta.subtract(monto);
        ctaOrigen.setSaldo(saldoCuentafinal);
        this.bancariaService.actualizar(ctaOrigen);
        
        Retiro retiro= new Retiro();
        retiro.setFecha(LocalDateTime.now());
        retiro.setMonto(monto);
        retiro.setNumeroCuentaorigen(numeroCtaOrigen);
        this.iRetiroRepository.insertarRetiro(retiro);
		
	}
	@Override
	public Retiro buscarRetiro(String numeroCuentaOrigen) {
		// TODO Auto-generated method stub
		return this.iRetiroRepository.buscarRetiro(numeroCuentaOrigen);
	}

	@Override
	public void actualizarRetiro(Retiro o) {
		// TODO Auto-generated method stub
		this.iRetiroRepository.actualizarRetiro(o);
	}

	@Override
	public void eliminarRetiro(String numeroCuentarigen) {


		this.iRetiroRepository.eliminarRetiro(numeroCuentarigen);
	}
	@Override
	public List<Retiro> consultar(String cuente, LocalDateTime fechainicio, LocalDateTime fechafin) {
		// TODO Auto-generated method stub
		return this.consultar(cuente, fechainicio, fechafin);
	}

	

}
