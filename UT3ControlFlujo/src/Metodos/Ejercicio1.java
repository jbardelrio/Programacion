package Metodos;

import java.util.Scanner;

//Escribir un método que convierta de euros a dólares. Recibirá un número decimal correspondiente a la cantidad 
//en euros y devolverá la cantidad correspondiente en dolares. Escribir el código en el main necesario para probarlo.
public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime los euros: ");
		double numero = teclado.nextDouble();
		
		cambio(numero);

	}
	public static double cambio(double numero){
		
		double dolar = 1.38;
	
		double cambio = numero * dolar;
		System.out.print("Son " + cambio + " $");
		return (double) cambio;
		
	}

}
