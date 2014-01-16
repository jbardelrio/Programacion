//Calculen el per�metro y �rea de un c�rculo dado su radio.

import java.util.Scanner;
public class Ejercicio3b {

	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		double radio, perimetro, area;
		
		System.out.print( "Introduzca el radio del c�rculo: " ); 
		radio = input.nextInt(); 
		input.close();
		//Area = Pi * radio^2
		area = (Math.PI) * (Math.pow(radio, 2));
		System.out.println("\nEl �rea del c�rculo es: ");
		System.out.println(String.format("%.3f", area));
		//per�metro = 2 * (pi) * radio
		perimetro = (Math.PI) * (radio * 2);
		System.out.println("\nEl per�metro del c�rculo es: ");
		System.out.println(String.format("%.3f", perimetro));
	}
}
