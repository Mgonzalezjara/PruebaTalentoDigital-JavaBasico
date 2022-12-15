package cl.edutecno.main;



import cl.edutecno.model.AnalizadorTitulosImpl1;
import cl.edutecno.model.AnalizadorTitulosImpl2;

public class Main {

	public static void main(String[] args) {
	
		 String Titulo1= "this film has 5 words";
		
		AnalizadorTitulosImpl1 analizador1 = new AnalizadorTitulosImpl1();
		AnalizadorTitulosImpl2 analizador2 = new AnalizadorTitulosImpl2();
		
		Integer Recuento1 = analizador1.analizar(Titulo1);
		Integer Recuento2 = analizador2.analizar(Titulo1);
		System.out.println(Recuento1);
		System.out.println(Recuento2);
		
	}

}
