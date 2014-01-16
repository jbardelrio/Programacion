//Crea un programa que pida el tama�o de un archivo (Mbytes) y la velocidad de una l�nea 
//de datos (Mbps), y muestre el tiempo que tardar� en transmitirlo usando dicha l�nea.

import java.util.Scanner;
public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		double mbytes, mbps;
		
		System.out.print( "Introduzca el tama�o del archivo: " ); 
		mbytes = input.nextInt(); 
		System.out.print( "Introduzca la velocidad de la l�nea: " ); 
		mbps = input.nextInt(); 
		input.close();
		
		mbytes = mbytes * 1024 * 1024 * 8; //Tambi�n se podr�a poner " mbytes * Marh.pow (2, 20) * 8 "
		mbps = mbps * 1000000;
		
		System.out.print("Datos: " + mbytes + " bits");
		System.out.print("\nmbps: " + mbps + " bps");
		System.out.print("\nTiempo para transmitir " + mbytes/mbps  + " sg");
	}
}