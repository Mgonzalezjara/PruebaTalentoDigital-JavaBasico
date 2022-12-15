package cl.edutecno.model;

import cl.edutecno.interfaces.AnalizadorTitulos;

public class AnalizadorTitulosImpl1 implements AnalizadorTitulos {

	@Override
	public Integer analizar(String palabras) {

		
		String [] recorte = palabras.split("\\s+");
		int recuentoPalabras= recorte.length;
		Integer retorno= 0;
		
	if (recuentoPalabras<=1) {
		retorno = -1;
		
	} 
	if (recuentoPalabras<1 && recuentoPalabras>3) {
		retorno = 0;
	}
	if (recuentoPalabras>2) {
		retorno = 1;
	}
	else {
		retorno = null;
	}
		return retorno;
	}

}
