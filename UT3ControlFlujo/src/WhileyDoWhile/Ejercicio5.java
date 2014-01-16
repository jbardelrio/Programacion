package WhileyDoWhile;
import java.util.Scanner;
public class Ejercicio5 {
//Escribe un programa que lea una serie de números, muestre el primero, 
//no el segundo, si el tercero y así sucesivamente. Termina cuando insertamos 
//un número negativo. El número negativo no se imprimirá.
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		boolean imprimir;
		
		imprimir=true;
		do {
			System.out.println("Dime un número: ");
			numero = teclado.nextInt();
	
			if (imprimir && numero >= 0) {
				System.out.println("El número que has introducido es: " + numero);
			}
			imprimir=!imprimir;
		} while (numero >=  0);
		teclado.close();
		System.out.println("Fin del programa.");
	}
}
