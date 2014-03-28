package ordenacionybusqueda;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Ejercicio 2. Escribe un programa que pida la estatura de una serie de alumnos, de tantos como indique el usuario
 * del programa. 
 * Posteriormente, el programa ordenará dichos datos de forma ascendente. 
 * Una vez ordenados, el programa visualizará los datos en el orden que se insertaron 
 * y ordenados de forma ascendente.
 */
public class Ejercicio2 {

	 public static void main(String[] args) {
	        Scanner teclado = new Scanner(System.in);
	        int i, N;
	        
	        //Leo el número de alumnos
	        do{
	            System.out.print("Dime cuantos alumnos: ");
	            N = teclado.nextInt();
	        }while(N<=0);
	        //Se crea el array de tamaño N y el auxiliar
	        int[] alturas = new int[N];
	      
	        //Leer alturas
	        System.out.println("Dime la altura de los alumnos: ");
	        for (i = 0; i < N; i++) {
	            System.out.print("Alumno " + (i+1) + " = ");
	            alturas[i] = teclado.nextInt();
	         
	        }
	        System.out.println("Según las has introducido: " + Arrays.toString(alturas));
	    
		teclado.close();

		int[] ordenado=Arrays.copyOf(alturas,alturas.length);
		Arrays.sort(ordenado);
		
		System.out.println("Ordenadas de menor a mayor: " + Arrays.toString(ordenado));
	 }
}
