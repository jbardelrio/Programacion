package ordenacionybusqueda;

import java.util.Arrays;

/*
 * Ejercicio 1. Escribe un programa que genere los seis números aleatorios de la lotería primitiva. 
 * No puede haber números repetidos.
 */
public class Ejercicio1 {

	private static int random(int min, int max) {
		return (int) (Math.random() * (max - min + 1) + min);
	}
	
	
	/**
	 * Comprueba si un elemento está en un array
	 *   
	 * @param i Elemento buscado
	 * @param array Vector donde buscar
	 * @param size Número de elementos donde buscar
	 * @return true si se ha encontrado i
	 * 
	 */
	private static boolean is_in(int i,int[] array,int size) {
		for(int j=0;j<size;j++)
			if (array[j]==i) return true;
		return false;
	}
	
	public static void main(String[] args) {
		int[] numbers=new int[6];

		
		for(int i=0;i<6;) {
			int new_number = random(1,49);
			
			if (!is_in(new_number,numbers,i)) {
				numbers[i++]=new_number;
			}
		}
		
		System.out.println("Resultado:" + Arrays.toString(numbers));
	}


}
