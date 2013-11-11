package Ejercicios;
import java.util.Scanner;
public class Ejercicio5 {
/*
 * Un año es bisiesto si es divisible entre 4, excepto el primero de cada siglo 
 * (aquel divisible por 100), salvo que este primero sea divisible por 400 
 * http://es.wikipedia.org/wiki/Año_bisiesto. Haz un programa que pida un año y muestre
 *  un mensaje de si es o no bisiesto.
 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int año;
		
		System.out.println("Dime el año: ");
		año = teclado.nextInt();
		teclado.close();
		
		if ((año % 4 == 0) && ((año % 100 != 0) || (año % 400 == 0)))
			System.out.println("Año bisiesto");
		else
			System.out.println("Año no es bisiesto");

	}

}
