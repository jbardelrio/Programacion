package IfElseIf;
import java.util.Scanner;
public class Ejercicio3 {
	//Escribe un programa que pida dos n�meros y que visualice el 
	//n�mero que sea mayor de los dos. Si los dos son iguales, imprimir� cualquiera de ellos.
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime el primer n�mero: ");
		int numero1=teclado.nextInt();
		
		System.out.println("Dime el segundo n�mero: ");
		int numero2=teclado.nextInt();

		teclado.close();
		if (numero1 == numero2) {
			System.out.printf("Los dos n�mero son iguales, en este caso el %d.", numero1);
		}
		else if (numero1 > numero2) {
			System.out.println("El n�mero mayor es: " + numero1);
		}else
			System.out.println("el n�mero mayor es: " + numero2);

	}

}
