package Metodos;

import java.util.Scanner;

public class Deitel6_19 {

	public static void main(String[] args) {
		char caracter ='*';
		
		String nombre="Jesus";
		
		caracter = nombre.charAt(0);
		System.out.println("Resultado: " + caracter);
		
		Scanner teclado = new Scanner(System.in);
		
		teclado.next().charAt(0);
		System.out.println(teclado.next().charAt(0));

	}

}
