package Ejercicios;
//Haciendo uso de un método que pida un número entero, hacer un programa que pida números enteros
//y visualice el resultado de sumar dichos número. Se pedirás números hasta que se inserte una letra
//o se inserten seis números.
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio6 {
	/*
	 * Haciendo uso de un mÃ©todo que pida un nÃºmero entero, hacer un programa
	 * que pida nÃºmeros enteros y visualice el resultado de sumar dichos nÃºmero.
	 * Se pedirÃ¡s nÃºmeros hasta que se inserte una letra o se inserten seis
	 * nÃºmeros.
	 */

	static Scanner teclado;

	public static int pideNumero() throws InputMismatchException {

		int resultado;
		
		resultado= teclado.nextInt();
				
		return resultado;
	}

	public static void main(String[] args) {
		int n2;
		int acumulador;
		
		teclado = new Scanner(System.in);
		
		System.out.println("Introduzca un nÃºmero entero para sumarlo: ");
		acumulador = 0;

		boolean continuarCiclo = true;
		int intentos = 0;
		do {
			
			try {
				System.out.println("Introduzca otro nÃºmero entero: (nÃºmeros a introducir restantes = " + (6-intentos) + ")" );
				n2 = pideNumero();
				acumulador+=n2;
				intentos++;
				continuarCiclo=true;
			} catch (InputMismatchException e) {
				System.out.println("Error: Se ha insertado una letra en lugar de un nÃºmero entero.");
				continuarCiclo=false;
			}

		} while (continuarCiclo == true && intentos != 6);
		
		System.out.printf("Se han introducido %d numeros que suman: %d\n",intentos,acumulador);
		System.out.println("--FIN DEL PROGRAMA--");

		teclado.close();
	}
}
