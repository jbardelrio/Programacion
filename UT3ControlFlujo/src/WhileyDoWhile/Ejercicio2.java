package WhileyDoWhile;
import java.util.Scanner;
public class Ejercicio2 {
//Pedir números hasta que se inserte un 0. 
//Mostrar la cantidad de números leídos y el resultado de multiplicar todos ellos.
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		int multiplicacion=1;
		
		int contador = 0;
		
		
		do {
			contador++;
			System.out.println("Dime un número: ");
			numero = teclado.nextInt();
			
			if (numero != 0) {
				multiplicacion*=numero;	
			}
			
		} while (numero != 0);
		
		System.out.println("Has introducido " + (contador-1) + " números.");
		System.out.println("El resultado de multiplicarlos todos es: " + multiplicacion);
	}

}
