package Arrays;
import java.util.Scanner;

public class Ejemplo2 {
//Hacer el ejercicio 1 de los FOR pero con un array
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String [] frase;
		int i;
		
		frase=new String[5];
		for  (i = 0; i <5; i++) {
			System.out.println("Escribe una frase: ");
			frase[i]=teclado.nextLine();
			System.out.println(" " + frase[i]);
		}
		System.out.println("Fin del programa.");
		teclado.close();
	}

}
