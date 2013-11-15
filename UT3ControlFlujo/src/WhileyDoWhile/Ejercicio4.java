package WhileyDoWhile;
import java.util.Scanner;
public class Ejercicio4 {
//Escribir un programa que lea tantos números como el usuario quiera 
//(hasta que se inserte un número negativo). El primer número hay que 
//visualizarlo en la pantalla.
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		System.out.println("Dime un número: ");
		numero = teclado.nextInt();
		System.out.println("El primer número introducido es: " + numero);
		do {
			System.out.println("Dime un número: ");
			numero = teclado.nextInt();
			
		} while (numero >=  0);
		teclado.close();
		System.out.println("El número " + numero + " es negativo.");
		
		
	}

}


