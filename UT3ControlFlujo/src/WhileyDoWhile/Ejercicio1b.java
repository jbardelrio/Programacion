package WhileyDoWhile;
import java.util.Scanner;
public class Ejercicio1b {
//Imprimir la tablas de multiplicar que el usuario elija.
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		int linea;
		
		System.out.println("Dime de qu� n�mero quieres calcular la tabla de multiplicar");
		numero = teclado.nextInt();
		teclado.close();
		
		linea = 1;
		while (linea <= 10) {
			System.out.println(numero + " x " + linea + " = " + (numero*linea));
			linea++;
		}

	}

}
