package Ejercicios;
import java.util.Scanner;
public class Ejercicio6 {
/*
 *Escribe un programa que pida el ph de una soluci�n y muestre el mensaje de si la soluci�n es �cida
 *(ph < 7.0) o peligr�samente �cida: ph < 3.0).
 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double ph = 0;
		teclado.close();
		System.out.println("Dime el ph: ");
		ph = teclado.nextDouble();
		if (ph < 7.0 && ph > 3.0) {
			System.out.println("La soluci�n es �cida.");
		}else if (ph < 3.0) {
			System.out.println("La soluci�n es peligrosamente �cida.");
		}else{
			System.out.println("El ph est� bien.");
		}
		

	
	}

}
