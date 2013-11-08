package Ejercicios;
import java.util.Scanner;
public class Ejercicio4 {
//El ordenador de nuestro coche calcula los kilómetros que nos quedan antes de repostar. 
//Crea un programa que pida: tamaño del depósito (en litros), porcentaje del depósito que está lleno
//y litros de consumo por 100kms. El programa mostrará los kilómetros que quedan de autonomía. 
//Si quedan menos de 30 kilómetros mostrará un aviso de que hay que repostar porque estamos usando la reserva.
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double tamaño;
		double porcentaje_lleno;
		double consumo;
		
		System.out.println("Dime el tamaño del depósito: ");
		tamaño = teclado.nextDouble();
		System.out.println("Dime el el porcentaje del depósito que está lleno: ");
		porcentaje_lleno = teclado.nextDouble();
		System.out.println("Dime los litros consumidos por 100 kms: ");
		consumo = teclado.nextDouble();
		teclado.close();
		
		
	}

}
