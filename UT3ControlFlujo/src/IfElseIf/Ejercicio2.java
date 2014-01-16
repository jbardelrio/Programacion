package IfElseIf;
import java.util.Scanner;
public class Ejercicio2 {
	//Escribe un programa que pida un número con el fin de visualizarlo, siempre que dicho número sea par.
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime un número y te diré si es par o impar: ");
		int numero=teclado.nextInt();

		teclado.close();
		if (numero % 2 == 0 ) {
			System.out.println("El número " + numero + " es par.");
			//También podríamos ponerlo así, que es lo mismo:
			//System.out.printf("El número %d es par", numero);
		}else{
			System.out.printf("El número %d es impar", numero);
		}

	}

}
