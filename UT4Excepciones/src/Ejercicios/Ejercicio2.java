package Ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

//Añade un bloque finally al ejercicio 1 y haz que se muestre un mensaje final independientemente
//de lo que ocurra en el programa.
public class Ejercicio2 {
	//PARA QUE SALGA EL FINALLY AUNQUE DE ERROR HAY QUE QUITAR LOS EXIT CON RESPECTO AL EJERCICIO 1 EN LOS CATCH
	public static void main(String[] args) {
		int dividendo=0, divisor=0;
		Scanner teclado = new Scanner(System.in);
		
		try{
			dividendo = teclado.nextInt();
			divisor = teclado.nextInt();
			teclado.close();
			System.out.println("Resultado: " + (dividendo/divisor));
		}
		catch (InputMismatchException e){
			System.err.println("Error, no es número entero.");	
		}
		catch(ArithmeticException e){
			System.err.println("Error, división por cero.");
		}
		finally{
			System.out.println("Este mensaje es cosa del FINALLY.");
		}

	}

}
