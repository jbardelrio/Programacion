package arrays2d;
import java.util.Arrays;
import java.util.Scanner;
/*
 * Ejercicio 4. Escribe un m�todo que se encargue de crear y cargar un vector con n�meros decimales 
 * (con datos que se insertan por el teclado). 
 * El m�todo devolver� dicho vector.
 */
public class Ejercicio4 {

	public static int decimales(){
		Scanner teclado = new Scanner (System.in);
		
		int tama�o = 5;
		
		double longitudArray[] = new double[5];
		
		System.out.println("Introduce los n�meros decimales: ");
		for (int i=0; i<tama�o; i++){
			longitudArray[i]= teclado.nextDouble();
		}
		
		teclado.close();
		
		System.out.println("N�meros: " + Arrays.toString(longitudArray));
		return tama�o;	
		
	}

	public static void main(String[] args) {
		
		System.out.println(decimales());

	}

}
