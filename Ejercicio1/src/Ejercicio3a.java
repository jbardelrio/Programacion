//Calculen el per�metro y �rea de un rect�ngulo dada su base y su altura.

import java.util.Scanner;
public class Ejercicio3a {

	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		int base, altura, perimetro, area;
		
		System.out.print( "Introduzca la base del rect�ngulo: " ); 
		base = input.nextInt(); 
		System.out.print( "Introduzca la altura del rect�ngulo: " ); 
		altura = input.nextInt(); 
		input.close();
		// P = (b *2) + (a * 2)
		perimetro = (base * 2) + (altura * 2);
		System.out.println("\nEl per�metro del rect�ngulo es: ");
		System.out.println(perimetro);
		//A= a * b
		area = (base * altura);
		System.out.println("\nEl �rea del rect�ngulo es: ");
		System.out.println(area);
	}
}