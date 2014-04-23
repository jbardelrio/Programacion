package arrays2d;

import java.util.Arrays;
import java.util.Scanner;

public class Cinco {
	/*
	 * Ejercicio 5. Escribe un programa que pida 8 notas. El programa debe
	 * visualizar cu�l es la nota m�s alta, luego la siguiente, y as�
	 * sucesivamente. Si hay alguna nota repetida, se visualizar� solo una vez.
	 */

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int tama�oInicial = 8;
		int tama�oFinal = tama�oInicial;
		int vector[] = new int[tama�oInicial];

		System.out.println("Inserte las notas que desea ordenar (desc).");
		for (int i = 0; i < tama�oInicial; i++) {
			vector[i] = teclado.nextInt();
		}

		teclado.close();


		int ordenado[]=Arrays.copyOf(vector,vector.length); //HACER COPIA DE UN VECTOR
		Arrays.sort(ordenado); //ORDENAR ARRAY 
		
		int anterior=ordenado[ordenado.length-1];
		System.out.print(ordenado[ordenado.length-1]+" ");
		for(int i=ordenado.length-2;i>=0;i--) {
			if (anterior!=ordenado[i]) { 
				System.out.print(ordenado[i]+ " ");
				anterior=ordenado[i];
			}			
		}
	}

}



