package For;
import java.util.Scanner;
public class TablaMultiplicar {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		int linea;
		
		System.out.println("Dime de qué número quieres calcular la tabla de multiplicar");
		numero = teclado.nextInt();
		for (linea = 1; linea <= 10; linea++) {
			System.out.println(numero + " x " + linea + " = " + (numero*linea));
		}

	}

}
