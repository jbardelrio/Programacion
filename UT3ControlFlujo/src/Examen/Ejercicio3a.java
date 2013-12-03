package Examen;

import java.util.Scanner;

public class Ejercicio3a {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String [] frase;
		int i;
		String respuesta = "s";
		
		
		do {
		System.out.println("Bienvenido a Haiku Generator.");
		System.out.println("Comenzaremos recopilando versos (escribe * para terminar");
		frase=new String[40];
		
		do {
		for  (i = 0; i <40; i++) {
			System.out.println("Dame un verso: ");
			frase[i]=teclado.nextLine();		
			
		}
		} while (!frase[i].equals("*"));
		
		System.out.println("¿Otro Haiku [s/n]?");
		respuesta = teclado.next();
		
		} while (respuesta.equals("s") || respuesta.equals("S"));
		System.out.println("Fin del programa.");
		teclado.close();

	}

}
