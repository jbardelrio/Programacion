package WhileyDoWhile;
import java.util.Scanner;
public class Ejercicio4 {
//Escribir un programa que lea tantos n�meros como el usuario quiera 
//(hasta que se inserte un n�mero negativo). El primer n�mero hay que 
//visualizarlo en la pantalla.
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		System.out.println("Dime un n�mero: ");
		numero = teclado.nextInt();
		System.out.println("El primer n�mero introducido es: " + numero);
		do {
			System.out.println("Dime un n�mero: ");
			numero = teclado.nextInt();
			
		} while (numero >=  0);
		teclado.close();
		System.out.println("El n�mero " + numero + " es negativo.");
		
		
	}

}


