package IfElseIf;
import java.util.Scanner;
public class Ejercicio2 {
	//Escribe un programa que pida un n�mero con el fin de visualizarlo, siempre que dicho n�mero sea par.
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime un n�mero y te dir� si es par o impar: ");
		int numero=teclado.nextInt();

		teclado.close();
		if (numero % 2 == 0 ) {
			System.out.println("El n�mero " + numero + " es par.");
			//Tambi�n podr�amos ponerlo as�, que es lo mismo:
			//System.out.printf("El n�mero %d es par", numero);
		}else{
			System.out.printf("El n�mero %d es impar", numero);
		}

	}

}
