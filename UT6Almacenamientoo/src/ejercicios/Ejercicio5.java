package ejercicios;

import java.util.Scanner;

/*
 * Ejercicio 5 Realiza un programa que encripte una cadena de caracteres 
 * (solo podemos usar caracteres en min�sculas o n�meros). 
 * La enciptaci�n consiste en:

   Dada una cadena de caracteres, en la cadena encriptada cada car�cter ser� igual a �l mismo m�s el car�cter 
   que se encuentra a continuaci�n. 
   Si nos encontramos en el �ltimo valor le sumaremos 4.
   Una vez realizada la operaci�n anterior sumaremos 3 a cada car�cter obteniendo finalmente la cadena 
   encriptada definitiva.

Puedes utilizar los m�todos de cadenas toCharArray y el constructor String(char[] value) 
para convertir/crear una cadena a/partiendo de un array de caracteres.
 */
public class Ejercicio5{

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Teclea la cadena a encriptar: ");
		String cadena=teclado.nextLine();
		
		char[] vector = cadena.toCharArray(); //El toCharArray te devuelve un vector con los caracteres de la cadena
		
		for(int i=0;i<vector.length-1;i++)
			vector[i]+=vector[i+1];
		
		vector[vector.length-1]+=4;
			
		cadena=new String(vector); //Este cambia los elementos del vector pro una cadena de caracteres
		System.out.print("Cadena encriptada: " + cadena);

	}

}
