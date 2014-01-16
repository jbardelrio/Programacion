//Dados los catetos de un triángulo rectángulo, calcular su hipotenusa.

import java.util.Scanner;
public class Ejercicio3e {

	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		double cateto1, cateto2, hipotenusa;
		
		System.out.print( "Introduzca el valor del cateto 1: " ); 
		cateto1 = input.nextInt(); 
		System.out.print( "Introduzca el valor del cateto 2: " ); 
		cateto2 = input.nextInt(); 
		input.close();
		// c = sqrt {a^2 + b^2} 
		hipotenusa = Math.sqrt((Math.pow(cateto1, 2) + (Math.pow(cateto2, 2))));
		System.out.print("\nLa hipotenusa del triángulo es " + String.format("%.3f", hipotenusa));
	}
}