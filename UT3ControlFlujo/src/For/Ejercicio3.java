package For;
import java.util.Scanner;
public class Ejercicio3 {
//Escribe un programa que calcule la suma de 6 números que inserte 
//el usuario a través del teclado.
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int numero;
		int resultado = 0;
		for (int i = 0; i < 6; i++) {
			System.out.println("Escribe un número: ");
			numero = teclado.nextInt();
			resultado += numero;
		}
		teclado.close();
		System.out.println("La suma de los 6 números es: " + resultado);
	}

}
