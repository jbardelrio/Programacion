package WhileyDoWhile;
import java.util.Scanner;
public class Ejercicio3 {
//Escribir un programa que pida varios n�meros hasta que el usuario inserte 
//un n�mero par. Hay que ir mostrando cada uno de los n�meros insertados 
//(excepto el par).
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		
		do {
			System.out.println("Dime un n�mero: ");
			numero = teclado.nextInt();
			
			if (numero % 2 != 0) {
				System.out.println("El n�mero " + numero + " es impar.");
			}
			
		} while (numero % 2 != 0);
		
		System.out.println("El �ltimo n�mero introducido es par.");
	}


}
