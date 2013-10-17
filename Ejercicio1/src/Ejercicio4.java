//Crea un programa que pida un peso en Kilogramos y realice la conversión a onzas, 
//sabiendo que 1 Kilogramo (Kg) = 35.2739619 Onzas (oz)

import java.util.Scanner;
public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		double kg, onzas, valor;
		
		onzas = 35.2739619;
		
		System.out.print( "Introduzca el valor en kg: " ); 
		kg = input.nextInt(); 
		input.close();
		
		valor = (kg * onzas);
		System.out.print("\nEl valor es " + String.format("%.3f", valor));
	}
}
