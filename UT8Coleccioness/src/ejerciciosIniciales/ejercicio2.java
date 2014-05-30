package ejerciciosIniciales;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

/*
 * 2. Crear una colección de caracteres que se irán introduciendo por teclado, hasta que se introduzca un asterisco. 
 * Decir si hay algún caracter duplicado.
 */
public class ejercicio2 {

	public static void main(String[] args) {
		ArrayList<Character> caracteres = new ArrayList<Character>(); //Creamos la colección en un ArrayList de tipo Character
		
		Scanner teclado = new Scanner(System.in);
		char leido;
		boolean repetidos=false;
		
		leido=teclado.next().charAt(0);//leido es el primer caracter que se introduzca por teclado
		while(leido!='*') {//Mientras "leido" no sea un asterisco
			caracteres.add(leido);//Añadimos "leido" al ArrayList "caracteres" 
			leido=teclado.next().charAt(0);
		}

		//HashSet<Character> unicos = new HashSet<Character>(caracteres);
		//repetidos=unicos.size()<caracteres.size();
		
		Collections.sort(caracteres); //Ordenamos el ArrayList "caracteres" 
		for(int i=1;i<caracteres.size() && !repetidos;i++)//Bucle para saber si hay algún caracter duplicado
			//Este for recorre la longitud de caracteres mientras repetidos sea FALSE
			if (caracteres.get(i-1).equals(caracteres.get(i)))//Si el último caracter es igual al que coge con el get(i) del índice
				repetidos=true;//Pone repetidos en true
		
		
		if (repetidos) System.out.println("Se introdujeron caracteres repetidos");
		
		System.out.println(caracteres);
	}
	
	public static void main2(String[] args) {
		HashSet<Character> caracteres = new HashSet<Character>();
		
		Scanner teclado = new Scanner(System.in);
		char leido;
		boolean repetidos=false;
		
		leido=teclado.next().charAt(0);
		while(leido!='*') {
			if (caracteres.contains(leido)) repetidos=true;
			caracteres.add(leido);
			leido=teclado.next().charAt(0);
		}

		if (repetidos) System.out.println("Se introdujeron caracteres repetidos");
		
		System.out.println(caracteres);
	}

}
