package Ejercicios;
import java.util.Scanner;
public class Ejercicio5 {
/*
 * Un a�o es bisiesto si es divisible entre 4, excepto el primero de cada siglo 
 * (aquel divisible por 100), salvo que este primero sea divisible por 400 
 * http://es.wikipedia.org/wiki/A�o_bisiesto. Haz un programa que pida un a�o y muestre
 *  un mensaje de si es o no bisiesto.
 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int a�o;
		
		System.out.println("Dime el a�o: ");
		a�o = teclado.nextInt();
		teclado.close();
		
		if ((a�o % 4 == 0) && ((a�o % 100 != 0) || (a�o % 400 == 0)))
			System.out.println("A�o bisiesto");
		else
			System.out.println("A�o no es bisiesto");

	}

}
