package Ejercicios;
import java.util.Scanner;
public class Ejercicio4 {
//El ordenador de nuestro coche calcula los kil�metros que nos quedan antes de repostar. 
//Crea un programa que pida: tama�o del dep�sito (en litros), porcentaje del dep�sito que est� lleno
//y litros de consumo por 100kms. El programa mostrar� los kil�metros que quedan de autonom�a. 
//Si quedan menos de 30 kil�metros mostrar� un aviso de que hay que repostar porque estamos usando la reserva.
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double tama�o;
		double porcentaje_lleno;
		double consumo;
		
		System.out.println("Dime el tama�o del dep�sito: ");
		tama�o = teclado.nextDouble();
		System.out.println("Dime el el porcentaje del dep�sito que est� lleno: ");
		porcentaje_lleno = teclado.nextDouble();
		System.out.println("Dime los litros consumidos por 100 kms: ");
		consumo = teclado.nextDouble();
		teclado.close();
		
		
	}

}
