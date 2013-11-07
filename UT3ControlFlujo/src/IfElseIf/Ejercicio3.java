package IfElseIf;
import java.util.Scanner;
public class Ejercicio3 {
	//Escribe un programa que pida dos números y que visualice el 
	//número que sea mayor de los dos. Si los dos son iguales, imprimirá cualquiera de ellos.
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime el primer número: ");
		int numero1=teclado.nextInt();
		
		System.out.println("Dime el segundo número: ");
		int numero2=teclado.nextInt();

		teclado.close();
		if (numero1 == numero2) {
			System.out.printf("Los dos número son iguales, en este caso el %d.", numero1);
		}
		else if (numero1 > numero2) {
			System.out.println("El número mayor es: " + numero1);
		}else
			System.out.println("el número mayor es: " + numero2);

	}

}
