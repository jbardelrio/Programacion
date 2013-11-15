package WhileyDoWhile;
import java.util.Scanner;
public class Ejercicio5 {
//Escribe un programa que lea una serie de números, muestre el primero, 
//no el segundo, si el tercero y así sucesivamente. Termina cuando insertamos 
//un número negativo. El número negativo no se imprimirá.
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		int contador = 0;
		
		do {
			System.out.println("Dime un número: ");
			numero = teclado.nextInt();
			contador++;
			
			if (contador % 2 != 0) {
				System.out.println("El número que has introducido es: " + numero);
			}
		} while (numero >=  0);
		System.out.println("El número " + numero + " es negativo.");
		
		
	}

	

}
