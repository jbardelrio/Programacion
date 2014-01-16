package Examen;
import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int total;
		int n;
		double suma = 0;
		double media;
		int negativos = 0;
		int positivos = 0;
	
		
		System.out.println("Dime cuantos numeros vas a poner: ");
		total = teclado.nextInt();	
		 System.out.println("Escribe los " + total + " números: ");
		for (int i = 0; i < total; i++) {
			
             n=teclado.nextInt();
             suma = suma+n;
             if (n < 0){
            	 negativos++;
            	
             }
             if (n > 0){
            	 positivos++;
             }
		}
		teclado.close();
		System.out.println("Los negativos son: " + negativos);
		System.out.println("Los positivos son: " + positivos);
		System.out.println("La media es: " + (double)suma / (double)total);
	}

}
