package com.endes.entidad;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.miempresa.entidad.Producto;

class ComercialTest {
	
	public Comercial comercial;
	public String nombreVenta;
	public double precioVenta;
	@BeforeEach
	void setUp() throws Exception {
		
		comercial = new Comercial("92485932L", "Alejandro", "Taladradora", 950.0 , 100);
	}
	
	@Test
	@DisplayName("Test para la clase getVentas")
	void testGetVentas() {
		String nombreVenta = "Taladradora";
		double precioVenta = 100.00;
		
	assertEquals(precioVenta, comercial.getVentas(),"El precio no se corresponde");
	}
	
}
