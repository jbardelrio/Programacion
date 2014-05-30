package ejerciciosIniciales;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/*
 * 1. Crea una colección, de tipo ArrayList que cargue 10 números por teclado. 
 * Después recorrerá la colección y devolverá la cantidad de números positivos, cero y negativos.
 */
public class ejercicio1 {

	public static void imprimeCantidades(List<Integer> vector) {
		int positivos=0,negativos=0;
		for(int i=0;i<10;i++) {
			if (vector.get(i)>0) positivos++;
			else if (vector.get(i)<0) negativos++;
		}
		
		System.out.println("Positivos: " + positivos);
		System.out.println("Negativos: " + negativos);
		System.out.println("Ceros: " + (10-positivos-negativos));
	}
	
	public static void numeros() {
		LinkedList<Integer> numeros = new LinkedList<Integer>();
		
		Scanner teclado = new Scanner(System.in);
		
		for(int i=0;i<10;i++) {
			numeros.add(teclado.nextInt());
		}
		
		imprimeCantidades(numeros);
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();//Creamos la colección de tipo ArrayList
		
		Scanner teclado = new Scanner(System.in);
		
		for(int i=0;i<10;i++) {//Le pedimos los 10 números por teclado
			numeros.add(teclado.nextInt());//Añadimos cada uno de esos números pedidos por teclado al ArrayList NUMEROS
		}
		
		int positivos=0,negativos=0;
		for(int i=0;i<10;i++) {//Bucle que se recorre 10 veces
			if (numeros.get(i)>0) positivos++;//Con el "get(i)" vamos cogiendo los números del ArrayList
			else if (numeros.get(i)<0) negativos++;
		}
		
		System.out.println("Positivos: " + positivos);
		System.out.println("Negativos: " + negativos);
		System.out.println("Ceros: " + (10-positivos-negativos));
	}
	
}
