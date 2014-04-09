package arrays1d;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Ejercicio 2 Crea un programa que almacene los meses del a�o
 * (los nombres de cada mes). Se pedir� al usuario el n�mero de
 *  mes y se visualizar� su nombre.
 *  
 * @author Angel
 *
 */
public class DosExcepciones {

	public static void main(String[] args) {
		String[] meses={"Enero",
				"Febrero",
				"Marzo",
				"Abril",
				"Mayo",
				"Junio",
				"Julio",
				"Agosto",
				"Septiembre",
				"Octubre",
				"Noviembre",
				"Diciembre"};

		try{
			System.out.println("Mes del a�o (n�mero):");
			int numero = (new Scanner(System.in)).nextInt();
			System.out.println("El mes se llama: " + meses[numero-1]);
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("El n�mero no corresponde a ning�n mes del a�o.");
			}catch(InputMismatchException e){
				System.out.println("Has intorducido una letra.");
			}
	}

}
