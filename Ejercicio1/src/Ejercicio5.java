//Crea un programa que pida el tama�o de un archivo (Mbytes) y la velocidad de una l�nea 
//de datos (Mbps), y muestre el tiempo que tardar� en transmitirlo usando dicha l�nea.

import java.util.Scanner;
public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		double mbytes, mbps, tiempo;
		
		System.out.print( "Introduzca el tama�o del archivo: " ); 
		mbytes = input.nextInt(); 
		System.out.print( "Introduzca la velocidad de la l�nea: " ); 
		mbps = input.nextInt(); 
		input.close();
		
		tiempo = ((mbytes * 8) / mbps);
		System.out.print("\nEl tiempo que tardar� la descarga es de " + tiempo + " segundos");
	}
}