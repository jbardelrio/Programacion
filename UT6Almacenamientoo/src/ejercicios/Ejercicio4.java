package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Ejerciccio 4 Realiza un programa que pida al usuario la introducci�n de un car�cter hasta que este 
 * pulse el car�cter @. 
 * El programa debe mostrar las veces que se ha escrito cada car�cter. 
 * Recordad que los caracteres tienen asociado un n�mero (c�digo) que comienza por cero. 
 * Ten en cuenta que se pueden hacer cosas como esta:

int c;
String qp="qp";
c=qp.charAt(0);
System.out.println(c);

Este programa imprimir�a "113", el c�digo de q. Si quisiera imprimir un n�mero tambi�n puedo hacerlo as�:

System.out.println((char)65);

Utiliza arrays para hacer el ejercicio.
 */
public class Ejercicio4 {

	public static void main(String[] args) {
		int[] contador;
		Scanner teclado = new Scanner(System.in);
		
		contador=new int[256];
		
		Arrays.fill(contador, 0);
				
		char c;
		do {
			System.out.print("Teclea un caracter: ");
			c=teclado.next().charAt(0);
			contador[c]++;
		}while(c!='@');
		
		System.out.println("Frecuencias de cada caracter: ");
		
		for(int i=0;i<contador.length;i++) {
			if (contador[i]>0)
				System.out.printf("\t%s : %d\n",Character.toString((char)i),contador[i]);
		}
		
		
		
	}

}
