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
	
	@Test
	@DisplayName("Test para la clase setVentas")
	void testSetVentas() {
		Exception exception = assertThrows(IllegalArgumentException.class, ()->{new Comercial("92485932L", "Alejandro", "Taladradora", 950.0 , 18 );});
		double precioEsperado = -18.0;
		String mensajeEsperado = "Las ventas no pueden ser negativas"+ precioEsperado;
		assertEquals(mensajeEsperado, exception.getMessage(), "No se corresponde el mensaje");
	}
	
	@Test
	@DisplayName("Prueba para la clase calcularExtra")
	void testCalcularExtras() {
		double dineroEsperado = 0.10 * 100;
		assertEquals(dineroEsperado, 100,"El dinero extra no se corresponde");
		
	}
}
