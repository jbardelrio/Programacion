package Ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

//Modifica el ejercicio 3 para que si el usuario tiene más de 5 errores muestre el mensaje 
//"Demasiados fallos. Vuelve a intentarlo otro día".
public class Ejercicio4 {

	public static void main(String[] args) {
		int dividendo=0, divisor=0;
		Scanner teclado = new Scanner(System.in);
		boolean hayerror = false;
		int numerrores = 0;
		
			do{
			System.out.println("Dime los números: ");
			
			try{	
			dividendo = teclado.nextInt();
			divisor = teclado.nextInt();
			teclado.close();
			hayerror = false;
			}
			catch (InputMismatchException e){
				teclado.nextLine();
				hayerror=true;
				numerrores++;
			}
			
			}while (hayerror && numerrores <= 5);
			
			if (numerrores > 5) {
				System.out.println("Demasiados fallos. Vuelve a intentarlo otro día");
				System.exit(0);
			}
			System.out.println("Resultado: " + (dividendo/divisor));
		
	}

}
