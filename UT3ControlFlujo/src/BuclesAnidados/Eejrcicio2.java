package BuclesAnidados;

import java.util.Scanner;

public class Eejrcicio2 {
//Modifica el ejercicio de la tabla de multiplicar de forma que el usuario
//vaya introduciendo números y se vayan imprimiendo las tablas correspondientes. 
//El programa termina cuando se introduce un número no esté entre 1 y 10.
	public static void main(String[] args) {
		int numero;
		Scanner teclado = new Scanner(System.in);
		
		do {
			
		int linea;
		System.out.println("Dime de qué número quieres calcular la tabla de multiplicar");
		numero = teclado.nextInt();
		if (numero >= 1 && numero <= 10) {
			for (linea = 1; linea <= 10; linea++) {
				System.out.println(numero + " x " + linea + " = " + (numero*linea));
		}
		}
		} while (numero >= 1 && numero <= 10);
		System.out.println("Fin del programa.");
		teclado.close();

	}

}
