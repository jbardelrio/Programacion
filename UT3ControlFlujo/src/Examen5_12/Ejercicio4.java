package Examen5_12;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String [] opciones;
		opciones = new String[10];
		boolean continuar = true;
		boolean nuevomenu = true;
		int num_opciones = 0;
		String elegida = "";
		
		System.out.println("Bienvenido a Men� Generator.");
		System.out.println();
		System.out.println("Comenzaremos recopilando opciones (escribe * para terminar)");
		System.out.println();
		
		while (continuar && num_opciones <10) {
			System.out.print("\nDame una opci�n: ");
			opciones[num_opciones] = teclado.nextLine();
			if (opciones[num_opciones].equals("*")) {
				continuar=false;
			} else {
				num_opciones++;
			}
		}
		
		while (nuevomenu) {
		System.out.printf("* Men� * \n");
		for(int i=0;i<num_opciones;i++)
			System.out.println(opciones[i]);
		
		System.out.println("Opci�n elegida: ");
		elegida = teclado.nextLine().toLowerCase();
		if (elegida.equals(opciones[num_opciones])) {
			System.out.println("Ha elegido la opci�n" + elegida);
		}
		if (elegida.equalsIgnoreCase("salir")) {
			
			nuevomenu = false;
		}
		
		}
	}

}
