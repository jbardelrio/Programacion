package Ejercicios;
import java.util.Scanner;
public class Ejercicio2 {
//Crea un programa que tiene una palabra oculta.
//El programa pregunta la contrase�a al jugador, si la adivina muestra un mensaje de �xito. Si no, muestra el error.
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String palabra;
		String oculto = "Filolog�a";
		
		System.out.println("Dime la palabra elegida: ");
		palabra = teclado.nextLine();
		teclado.close();
		
		if (palabra.equals(oculto)) {
			System.out.println("Enhorabuena muchacho !!");
		}else{
			System.out.println("Error, sigue intent�ndolo...");
		}

	}

}