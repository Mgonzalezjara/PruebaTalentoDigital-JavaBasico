package cl.edutecno.model;

import java.util.Iterator;

import cl.edutecno.interfaces.AnalizadorTitulos;

public class AnalizadorTitulosImpl2 implements AnalizadorTitulos {

	@Override
	public Integer analizar(String palabras) {

		String sPalabras= palabras.toLowerCase();
		int [] contador = {0,0,0};
		Integer retorno=0;
		
	for (int i = 0; i < sPalabras.length(); i++) {
		switch (sPalabras.charAt(i)) {
	    case 'a': case 'á':
	      contador[0]++;
	      break;
	}
		
	if (contador.length <= 8) {
		retorno= -1;
	}
	if (contador.length >= 8 && contador.length >= 12) {
		retorno= 0;
	}
	if (contador.length > 12) {
		retorno= 1;
	}
	
	}
		return retorno;
	}

}
