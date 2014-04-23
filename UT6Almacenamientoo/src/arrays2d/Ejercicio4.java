package arrays2d;
import java.util.Arrays;
import java.util.Scanner;
/*
 * Ejercicio 4. Escribe un método que se encargue de crear y cargar un vector con números decimales 
 * (con datos que se insertan por el teclado). 
 * El método devolverá dicho vector.
 */
public class Ejercicio4 {

	public static int decimales(){
		Scanner teclado = new Scanner (System.in);
		
		int tamaño = 5;
		
		double longitudArray[] = new double[5];
		
		System.out.println("Introduce los números decimales: ");
		for (int i=0; i<tamaño; i++){
			longitudArray[i]= teclado.nextDouble();
		}
		
		teclado.close();
		
		System.out.println("Números: " + Arrays.toString(longitudArray));
		return tamaño;	
		
	}

	public static void main(String[] args) {
		
		System.out.println(decimales());

	}

}
