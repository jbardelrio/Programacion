package For;
import java.util.Scanner;
public class Ejercicio1 {
//Escribe un programa que pida cinco frases y las visualice.
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			String frase;
			System.out.println("Escribe una frase: ");
			frase = teclado.next();
			System.out.println(frase);
		}
		teclado.close();
	}

}
