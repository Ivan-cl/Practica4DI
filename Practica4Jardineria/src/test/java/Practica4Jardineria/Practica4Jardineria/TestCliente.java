package Practica4Jardineria.Practica4Jardineria;

import org.junit.Test;
import static org.junit.Assert.*;


import errores.EmailNoExiste;
import Builder.BuilderCliente;
import JardineriaTest.cliente;

public class TestCliente {
	
	@Test
	public void Emailnofunciona() {
		try {
			BuilderCliente.buildClient(12, "Dario", "Julio", "235612976", cliente.DocumentType.DNI, "12345678A", "123@tuia.com", "nofunciona");
		} catch (Exception e) {
			assertTrue(e instanceof EmailNoExiste);
			return;
		}
		fail("Excepcion");
	}
	
	
	public void Emailfunciona() {
		try {
			BuilderCliente.buildClient(12, "Dario", "Julio", "235612976", cliente.DocumentType.DNI, "12345678A", "123@gmail.com", "funciona");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void lenghtDNI_shouldNotWork() {
		
	}
	
	
	public void lenghtDNI_shouldWork() {
			
	}
	
	
	
	
	public void wordDNI_shouldNotWork() {
			
	}
	
	
	public void wordDNI_shouldWork() {
			
	}
	
	
	
	public void lenghtNIE_shouldNotWork() {
		
	}
	
	
	public void lenghtNIE_shouldWork() {
			
	}
	
	
	

}
