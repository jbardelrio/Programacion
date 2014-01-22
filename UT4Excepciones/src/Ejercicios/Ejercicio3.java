package Ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

//Modifica el ejercicio 1 para que si el usuario introduce algo que no es un n�mero, 
//vuelva a repetirse el pedir el dividendo y divisor.

public class Ejercicio3 {

	public static void main(String[] args) {
		int dividendo=0, divisor=0;
		Scanner teclado = new Scanner(System.in);
		boolean hayerror = false;
		
			do{
			System.out.println("Dime los n�meros: ");
			
			try{	
			dividendo = teclado.nextInt();
			divisor = teclado.nextInt();
			teclado.close();
			hayerror = false;
			}
			catch (InputMismatchException e){
				System.err.println("Error, no es n�mero entero.");
				teclado.nextLine();
				hayerror=true;
			}
			
			}while (hayerror);
			
			System.out.println("Resultado: " + (dividendo/divisor));
		
	}

}
