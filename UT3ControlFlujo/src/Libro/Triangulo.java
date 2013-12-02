package Libro;
import java.util.Scanner;
public class Triangulo {

	public static void main(String[] args) {
		int n;
		String triangulo = "";

		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingrese un número: ");
		n = teclado.nextInt();

		for (int i = 1; i <= n; i++){
		triangulo = triangulo + "*";
		System.out.println(triangulo);
		}
		

	}

}
