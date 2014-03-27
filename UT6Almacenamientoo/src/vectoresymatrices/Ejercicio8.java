package vectoresymatrices;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Ejercicio 8. Escribe un método que reciba una matriz de caracteres con el fin de visualizar su contenido.
 */
public class Ejercicio8 {
	
	public static void caracteres(char [][] matriz) {
		
		for (int i = 0; i < matriz.length; i++) { 
			for (int j = 0; j < matriz[i].length; j++) { 
				System.out.print(matriz[i][j]+ " ");
			}
			System.out.println();
		}	
		 
	}
	public void setArray(char [][] matriz) 
	{ 
	this.array = array; 
	} 
	public static void main(String[] args) {
		
		char [][] matriz= {{'*','*','#'},{'/','&','%'}};
		
	
		
	}

}
