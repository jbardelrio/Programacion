package Metodos;

import java.util.Scanner;

public class Ejemplo3 {
//M�todo que imprima 10 l�neas aleatorias
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime el tama�o: ");
		int tama�o = teclado.nextInt();
		
		
		for (int i = 0; i < tama�o; i++) {
			lineaAleatorios(tama�o);
		}
	}
	//IMPORTANTE: El valor de la variable "tam" lo coge del valor de "tama�o"
	public static void lineaAleatorios(int tam){ 
		for (int j = 0; j < tam; j++) {
			numaleatorio();
		}
		System.out.println();
	}
	public static void numaleatorio() {
		
		int numero = (int) (Math.random()*10);
		
		System.out.print( numero );
	}
}
