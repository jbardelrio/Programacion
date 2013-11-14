package Ejercicios;
import java.util.Scanner;
public class Ejercicio6 {
/*
 *Escribe un programa que pida el ph de una solución y muestre el mensaje de si la solución es ácida
 *(ph < 7.0) o peligrósamente ácida: ph < 3.0).
 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double ph = 0;
		teclado.close();
		System.out.println("Dime el ph: ");
		ph = teclado.nextDouble();
		if (ph < 7.0 && ph > 3.0) {
			System.out.println("La solución es ácida.");
		}else if (ph < 3.0) {
			System.out.println("La solución es peligrosamente ácida.");
		}else{
			System.out.println("El ph está bien.");
		}
		

	
	}

}
