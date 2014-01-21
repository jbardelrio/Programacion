package Metodos;

import java.util.Scanner;

//Escriba un método llamado enteroPotencia (base, exponente) que devuelva el valor de base elevado a exponente
public class Deitel6_14 {
	

	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int base = 0;
		int exponente = 1;
		
		do {
		System.out.println("Dime la base: ");
		base = teclado.nextInt();
		} while (base <= 0);
		
		do {
		System.out.println("Dime el exponente: ");
		exponente = teclado.nextInt();
		} while (exponente <= 0);
		
		enteroPotencia(base, exponente);
	}
	
	public static int enteroPotencia(int base, int exponente){
		int potencia = 1;
		
		for ( int i = 1; i <= exponente; i++ )
		{     
		potencia *= base; 
		}    
		System.out.println("El resultado es: " + potencia);
		
		return potencia;
		
		
	
	}
	

}
