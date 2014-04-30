package cadenas;

import java.util.StringTokenizer;
//Ejercicio 3. Dada una frase, que puede contener caracteres, espacios en blanco, puntos y comas, contar las palabras que contiene. 
//Por ejemplo "El perro de San Roque. Fin." devuelve 6.
public class Ejercicio3 {

	public static int contarPalabras(String frase){
		StringTokenizer contar = new StringTokenizer(frase);
		
		return contar.countTokens();
	}

	public static void main(String[] args) {
		
		String pruebas="Hola cadena para probar, palabras. Fin";

		System.out.println(contarPalabras(pruebas));
	}

}
