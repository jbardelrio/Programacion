package IfElseIf;
import java.util.Scanner;
public class Ejercicio4 {
	//Escribe un programa que visualice el m�s peque�o de tres n�meros.
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime el primer n�mero: ");
		int numero1=teclado.nextInt();
		
		System.out.println("Dime el segundo n�mero: ");
		int numero2=teclado.nextInt();


		System.out.println("Dime el tercer n�mero: ");
		int numero3=teclado.nextInt();
		
		teclado.close();
		
		if (numero1 <= numero2 && numero1 <= numero3) {
			System.out.println("El n�mero m�s peque�o es: " + numero1);
		}else if(numero2 <= numero3){
			System.out.println("El n�mero m�s peque�o es: " + numero2);
		}else{
			System.out.println("El n�mero m�s peque�o es: " + numero3);
		}

	}

}
