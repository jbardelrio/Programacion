package Metodos;
//Escriba un m�todo llamado cuadradoDeAsteriscos que muestre un cuadrado relleno (el mismo n�mero de filas y columnas)
//de asteriscos cuyo lado se especifique en el par�metro entero lado.
import java.util.Scanner;

public class Deitel6_18 {

	public static void main(String[] args) {
		int lado = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime el lado: ");
		lado= teclado.nextInt();
		
		cuadradoDeAsteriscos(lado);

	}
	public static int cuadradoDeAsteriscos(int lado){
		for (int i = 0; i < lado; i++) {
			for (int j = 0; j < lado; j++)
				System.out.print("*");
			System.out.println("");
		}
		return lado;
		
	}

}
