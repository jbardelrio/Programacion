package vectoresymatrices;

import java.util.Arrays;

public class EjemplosMatrices {

	public static void main(String[] args) {
		int[][] array1;
		
		array1 = new int[3][4];
		/* Este es el array que hemos definido:
		 * [
		 * [0,0,0,0],
		 * [0,0,0,0],
		 * [0,0,0,0],
		 * ]
		 */
		array1[1][3]=7;
		/* Ahora el array es este otro:
		 * [
		 * [0,0,0,0],
		 * [0,0,0,7],
		 * [0,0,0,0],
		 * ]
		 */
		System.out.println(Arrays.toString(array1[1]));
		
		System.out.println();
		
		/*
		 * para imprimir una comuna haría que hacer un for
		 */
		for (int i = 0; i < array1.length; i++) { //aqui la longitud sería 3
			for (int j = 0; j < 4; j++) { //este la longitud sería 4
				System.out.print(array1[i][j]+ " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int i = 0; i < array1.length; i++) { //aqui la longitud sería 3
			for (int j = 0; j < array1[i].length; j++) { //este la longitud sería 4
				System.out.print(array1[i][j]+ " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		char[][] caracteres={{'a', 'b'},{'c', 'd', 'e'},{'f', 'g'}}; //el CHAR sirve para guardar un caracter, símbolo o letra
		/*el array sería este
		 * [
		 * ['a', 'b'],
		 * ['c', 'd', 'e'],
		 * ['f', 'g']
		 * ]
		 */
		for (int i = 0; i < caracteres.length; i++) { 
			for (int j = 0; j < caracteres[i].length; j++) { 
				System.out.print(caracteres[i][j]+ " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//otra forma de declarar un array a mano
		char [][] caracteres2;
		caracteres2 = new char [3][]; //primero crea el de 3 filas
		
		caracteres2[0] = new char[2]; //después creamos las columnas
		caracteres2[0][0]='a'; //esto mete el valor 'a' en una posición concreta que le decimos
		caracteres2[0][1]='b';
		
		caracteres2[1] = new char[3];
		caracteres2[1][0]='c';
		caracteres2[1][1]='d';
		caracteres2[1][2]='e';
		
		caracteres2[2] = new char[2];
		caracteres2[2][0]='f';
		caracteres2[2][1]='g';
		
		for (int i = 0; i < caracteres2.length; i++) { 
			for (int j = 0; j < caracteres2[i].length; j++) { 
				System.out.print(caracteres2[i][j]+ " ");
			}
			System.out.println();
		}
		
		
		
	}

}
