//Calculen el perímetro y área de un círculo dado su radio.

import java.util.Scanner;
public class Ejercicio3b {

	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		double radio, perimetro, area;
		
		System.out.print( "Introduzca el radio del círculo: " ); 
		radio = input.nextInt(); 
		input.close();
		//Area = Pi * radio^2
		area = (Math.PI) * (Math.pow(radio, 2));
		System.out.println("\nEl área del círculo es: ");
		System.out.println(String.format("%.3f", area));
		//perímetro = 2 * (pi) * radio
		perimetro = (Math.PI) * (radio * 2);
		System.out.println("\nEl perímetro del círculo es: ");
		System.out.println(String.format("%.3f", perimetro));
	}
}
