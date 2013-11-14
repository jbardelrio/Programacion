package WhileyDoWhile;
import java.util.Scanner;
public class Ejercicio1c {
//Imprimir la tablas de multiplicar que el usuario elija.
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		int linea, multiplicacion;
		
		System.out.println("Dime de qué número quieres calcular la tabla de multiplicar");
		numero = teclado.nextInt();
		teclado.close();
		
		linea = 1;
		multiplicacion = numero;
		while (linea <= 10) {
			System.out.println(numero + " x " + linea + " = " + (multiplicacion));
			linea++;
			multiplicacion+=numero; //ESTO ES LO MISMO QUE ESTO OTRO: multiplicacion=multiplicacion + numero;
		}

	}

}
