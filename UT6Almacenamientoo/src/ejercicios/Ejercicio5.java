package ejercicios;

import java.util.Scanner;

/*
 * Ejercicio 5 Realiza un programa que encripte una cadena de caracteres 
 * (solo podemos usar caracteres en minúsculas o números). 
 * La enciptación consiste en:

   Dada una cadena de caracteres, en la cadena encriptada cada carácter será igual a él mismo más el carácter 
   que se encuentra a continuación. 
   Si nos encontramos en el último valor le sumaremos 4.
   Una vez realizada la operación anterior sumaremos 3 a cada carácter obteniendo finalmente la cadena 
   encriptada definitiva.

Puedes utilizar los métodos de cadenas toCharArray y el constructor String(char[] value) 
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
