package Ejercicios;
import java.util.Scanner;
public class Ejercicio1 {
//Crea un programa que tiene un numero oculto (del 1 al 10). El programa pregunta el n�mero al jugador,
//si la adivina muestra un mensaje de �xito. Si no, muestra el error.
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		int oculto = 3;
		
		System.out.println("Dime el n�mero elegido: ");
		numero = teclado.nextInt();
		teclado.close();
		
		if (numero == oculto) {
			System.out.println("Enhorabuena muchacho !!");
		}else{
			System.out.println("Error, sigue intent�ndolo...");
		}

	}

}
