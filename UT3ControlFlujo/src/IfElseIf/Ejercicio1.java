
package IfElseIf;
import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		//Leer temperatura fahrenheit
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime la temperatura (ºF): ");
		double temperatura=teclado.nextDouble();
		teclado.close();
		//Pasar a ºC
		
		temperatura = (temperatura - 32) / 1.8;
		
		//Si temperatura < 0
		if (temperatura <= 0) {
			System.out.println("Temperatura: " + temperatura + "ºC");
			System.out.println("AVISO: temperatura de congelación.");
		}else{
			System.out.println("No hay riesgo de congelación.");
		}
		
	}

}
