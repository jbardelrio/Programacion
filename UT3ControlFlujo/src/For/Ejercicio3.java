package For;
import java.util.Scanner;
public class Ejercicio3 {
//Escribe un programa que calcule la suma de 6 n�meros que inserte 
//el usuario a trav�s del teclado.
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int numero;
		int resultado = 0;
		for (int i = 0; i < 6; i++) {
			System.out.println("Escribe un n�mero: ");
			numero = teclado.nextInt();
			resultado += numero;
		}
		teclado.close();
		System.out.println("La suma de los 6 n�meros es: " + resultado);
	}

}
