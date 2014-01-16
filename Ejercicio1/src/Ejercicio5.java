//Crea un programa que pida el tamaño de un archivo (Mbytes) y la velocidad de una línea 
//de datos (Mbps), y muestre el tiempo que tardará en transmitirlo usando dicha línea.

import java.util.Scanner;
public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		double mbytes, mbps;
		
		System.out.print( "Introduzca el tamaño del archivo: " ); 
		mbytes = input.nextInt(); 
		System.out.print( "Introduzca la velocidad de la línea: " ); 
		mbps = input.nextInt(); 
		input.close();
		
		mbytes = mbytes * 1024 * 1024 * 8; //También se podría poner " mbytes * Marh.pow (2, 20) * 8 "
		mbps = mbps * 1000000;
		
		System.out.print("Datos: " + mbytes + " bits");
		System.out.print("\nmbps: " + mbps + " bps");
		System.out.print("\nTiempo para transmitir " + mbytes/mbps  + " sg");
	}
}