package WhileyDoWhile;
import java.util.Scanner;
public class Ejercicio5 {
//Escribe un programa que lea una serie de n�meros, muestre el primero, 
//no el segundo, si el tercero y as� sucesivamente. Termina cuando insertamos 
//un n�mero negativo. El n�mero negativo no se imprimir�.
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		int contador = 0;
		
		do {
			System.out.println("Dime un n�mero: ");
			numero = teclado.nextInt();
			contador++;
			
			if (contador % 2 != 0) {
				System.out.println("El n�mero que has introducido es: " + numero);
			}
		} while (numero >=  0);
		System.out.println("El n�mero " + numero + " es negativo.");
		
		
	}

	

}
