package Metodos;

import java.util.Scanner;

public class Ejemplo3 {
//Método que imprima 10 líneas aleatorias
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime el tamaño: ");
		int tamaño = teclado.nextInt();
		
		
		for (int i = 0; i < tamaño; i++) {
			lineaAleatorios(tamaño);
		}
	}
	//IMPORTANTE: El valor de la variable "tam" lo coge del valor de "tamaño"
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
