package Ejercicios;
import java.util.Scanner;
public class Ejercicio5b {
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
		
		  if (año%4 == 0){
          	
          	if (año%100 == 0) { //no bisiesto
          		
          		if (año%400 == 0) System.out.printf("El año %d es bisiesto", año);
          		else System.out.printf("El año %d no es bisiesto", año);
          	} else // bisiesto
          		System.out.printf("El año %d es bisiesto", año);
          	
          } else System.out.printf("El año %d no es bisiesto", año);
		}
}



