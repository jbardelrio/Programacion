package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejemplo {

	public static void main(String[] args) {
		int [] enteros;
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		enteros=new int[10];
		System.out.println("Escribe los n�meros separados por un espacio: ");
		for (int i = 0; i < 10; i++){
			enteros[i]=teclado.nextInt();
		}
					System.out.println(Arrays.toString(enteros));
		
		for (int i = 9; i >=0; i--) {
			System.out.print(" " + enteros[i]);
		}

	}

}
