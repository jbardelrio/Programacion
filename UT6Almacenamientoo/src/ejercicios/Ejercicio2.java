package ejercicios;

import java.util.Scanner;

/*
 * Ejercicio 2 Crea un programa que almacene los meses del a�o (los nombres de cada mes). 
 * Se pedir� al usuario el n�mero de mes y se visualizar� su nombre.
 */
public class Ejercicio2 {

	
	public static void main(String[] args) {
		String[] meses={"Enero",
				"Febrero",
				"Marzo",
				"Abril",
				"Mayo",
				"Junio",
				"Julio",
				"Agosto",
				"Septiembre",
				"Octubre",
				"Noviembre",
				"Diciembre"};

		System.out.println("Mes del a�o (n�mero):");
		int numero = (new Scanner(System.in)).nextInt();
		
		System.out.println("El mes se llama: " + meses[numero-1]);
	}

}
