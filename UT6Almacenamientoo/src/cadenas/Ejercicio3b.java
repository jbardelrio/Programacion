package cadenas;

import java.util.StringTokenizer;
//Ejercicio 3. Dada una frase, que puede contener caracteres, espacios en blanco, puntos y comas, contar las palabras que contiene. 
//Por ejemplo "El perro de San Roque. Fin." devuelve 6.
public class Ejercicio3b {

	public static int contarPalabras(String frase){
		int contador = 0;
		frase = frase.replaceAll("[.|,]", " ");
		System.out.println(frase);
		frase = frase.replaceAll("( )+", " ");//El + indica que, si hay más de un espacio en blanco, los une en un solo espacio en blanco
		System.out.println(frase);
				
		String [] palabras = frase.split(" ");
		
		for (int i = 0; i < palabras.length; i++) {
			contador++;
		}
		
		return palabras.length;
		
	}

	public static void main(String[] args) {
		
		String pruebas="Hola cadena para probar, palabras. Fin";

		System.out.println(contarPalabras(pruebas));
	}

}