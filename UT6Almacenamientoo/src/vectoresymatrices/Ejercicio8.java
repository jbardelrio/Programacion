package vectoresymatrices;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Ejercicio 8. Escribe un método que reciba una matriz de caracteres con el fin de visualizar su contenido.
 */
public class Ejercicio8 {

	public static Object caracteres() {
		
		Scanner teclado = new Scanner(System.in);
 
        char[] cadena = new char[8];
		
		System.out.println("Introduce los caracteres: ");
		for (int i=0; i<cadena.length; i++){
			cadena = teclado.toChar();
		}
		
		System.out.println("Números: " + Arrays.toString(cadena));
		return cadena;	
		 
	}

	public static void main(String[] args) {
		
		System.out.println(caracteres());

	}

}
