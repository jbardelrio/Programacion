package WhileyDoWhile;
import java.util.Scanner;
public class Ejercicio3 {
//Escribir un programa que pida varios números hasta que el usuario inserte 
//un número par. Hay que ir mostrando cada uno de los números insertados 
//(excepto el par).
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		
		do {
			System.out.println("Dime un número: ");
			numero = teclado.nextInt();
			
			if (numero % 2 != 0) {
				System.out.println("El número " + numero + " es impar.");
			}
			
		} while (numero % 2 != 0);
		
		System.out.println("El último número introducido es par.");
	}


}
