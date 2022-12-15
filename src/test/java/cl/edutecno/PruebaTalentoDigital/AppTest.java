package cl.edutecno.PruebaTalentoDigital;


import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import cl.edutecno.model.AnalizadorTitulosImpl1;
import cl.edutecno.model.AnalizadorTitulosImpl2;


public class AppTest 
{
	public AnalizadorTitulosImpl1 analizador1;
	private AnalizadorTitulosImpl2 analizador2;
	
	 @BeforeEach
	 public void setUp() {
	 analizador1 = new AnalizadorTitulosImpl1();
	 analizador2 = new AnalizadorTitulosImpl2();
	 
	 }
	 
	 @Test
	public void AnalizadorTest() {
		 
		 String palabra1 = "la pelicula tiene cinco palabras";
		 Integer recuento1= analizador1.analizar(palabra1);
		 Assertions.assertEquals(1, recuento1);
		 
	 }
	 
	@Test
	 public void AnalizadorNull(){
		 String palabra1 = "la pelicula tiene cinco palabras";
		 Integer recuento1= analizador1.analizar(palabra1);
		 Assertions.assertNotNull(recuento1);
	 }
	
	 @Test
		public void AnalizadorTest2() {
			 
			 String palabra1 = "la pelicula tiene cinco palabras";
			 Integer recuento1= analizador1.analizar(palabra1);
			 Assertions.assertEquals(1, recuento1);
			 
		 }
		 
		@Test
		 public void AnalizadorNull2(){
			 String palabra1 = "la pelicula tiene cinco palabras";
			 Integer recuento1= analizador1.analizar(palabra1);
			 Assertions.assertNotNull(recuento1);
		 }
	
}
