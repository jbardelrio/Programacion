package WhileyDoWhile;
import java.util.Scanner;
public class Ejercicio1 {
//Imprimir la tablas de multiplicar que el usuario elija.
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		
		System.out.println("Dime de qué número quieres calcular la tabla de multiplicar");
		numero = teclado.nextInt();
		teclado.close();
		
		System.out.println(numero + " x 1 = " + (numero*1));
		System.out.println(numero + " x 2 = " + (numero*2));
		System.out.println(numero + " x 3 = " + (numero*3));
		System.out.println(numero + " x 4 = " + (numero*4));
		System.out.println(numero + " x 5 = " + (numero*5));
		System.out.println(numero + " x 6 = " + (numero*6));
		System.out.println(numero + " x 7 = " + (numero*7));
		System.out.println(numero + " x 8 = " + (numero*8));
		System.out.println(numero + " x 9 = " + (numero*9));

	}

}
