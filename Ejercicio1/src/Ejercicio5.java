//Crea un programa que pida el tamaño de un archivo (Mbytes) y la velocidad de una línea 
//de datos (Mbps), y muestre el tiempo que tardará en transmitirlo usando dicha línea.

import java.util.Scanner;
public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		double mbytes, mbps, tiempo;
		
		System.out.print( "Introduzca el tamaño del archivo: " ); 
		mbytes = input.nextInt(); 
		System.out.print( "Introduzca la velocidad de la línea: " ); 
		mbps = input.nextInt(); 
		input.close();
		
		tiempo = (mbytes / mbps);
		System.out.print("\nEl tiempo que tardará la descarga es de " + tiempo + " segundos");
	}
}