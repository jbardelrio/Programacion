//Calculen el volumen de una esfera dado su radio.

import java.util.Scanner;
public class Ejercicio3c {

	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		double radio, volumen;
		
		System.out.print( "Introduzca el radio de la esfera: " ); 
		radio = input.nextInt(); 
		input.close();
		//V = (4 * pi * R^3) / 3
		volumen = ((4 * Math.PI) * (Math.pow(radio, 3))) / 3;
		System.out.println("\nEl volumen de la esfera es: ");
		System.out.println(String.format("%.3f", volumen));

	}

}
