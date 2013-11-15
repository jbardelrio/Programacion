package WhileyDoWhile;
import java.util.Scanner;
public class Ejercicio5 {
//Escribe un programa que lea una serie de n�meros, muestre el primero, 
//no el segundo, si el tercero y as� sucesivamente. Termina cuando insertamos 
//un n�mero negativo. El n�mero negativo no se imprimir�.
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		boolean imprimir;
		
		imprimir=true;
		do {
			System.out.println("Dime un n�mero: ");
			numero = teclado.nextInt();
	
			if (imprimir && numero >= 0) {
				System.out.println("El n�mero que has introducido es: " + numero);
			}
			imprimir=!imprimir;
		} while (numero >=  0);
		teclado.close();
		System.out.println("Fin del programa.");
	}
}
