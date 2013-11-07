package IfElseIf;
import java.util.Scanner;
public class Ejercicio4 {
	//Escribe un programa que visualice el más pequeño de tres números.
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime el primer número: ");
		int numero1=teclado.nextInt();
		
		System.out.println("Dime el segundo número: ");
		int numero2=teclado.nextInt();


		System.out.println("Dime el tercer número: ");
		int numero3=teclado.nextInt();
		
		teclado.close();
		
		if (numero1 <= numero2 && numero1 <= numero3) {
			System.out.println("El número más pequeño es: " + numero1);
		}else if(numero2 <= numero3){
			System.out.println("El número más pequeño es: " + numero2);
		}else{
			System.out.println("El número más pequeño es: " + numero3);
		}

	}

}
