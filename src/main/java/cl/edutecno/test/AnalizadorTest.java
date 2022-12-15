package cl.edutecno.test;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import cl.edutecno.model.AnalizadorTitulosImpl1;

public class AnalizadorTest {

	private AnalizadorTitulosImpl1 analizador1;
	
 @BeforeEach
 public void setUp() {
 analizador1 = new AnalizadorTitulosImpl1();
 
 }
 
 @Test
	public void AnalizadorTest() {
	 
	 String palabra1 = "Piratas del caribe";
	 Integer recuento1= analizador1.analizar(palabra1);
	 Assertions.assertEquals(1,1);
	 
 }
 
}
