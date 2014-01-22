package Ejercicios;
import java.util.*;

public class Ejercicio1 {

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
			System.exit(0);
			
		}
		catch(ArithmeticException e){
			System.err.println("Error, división por cero.");
			System.exit(0);
		}
		
	}

}