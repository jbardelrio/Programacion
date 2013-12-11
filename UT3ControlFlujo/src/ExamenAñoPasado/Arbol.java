package ExamenAñoPasado;

import java.util.Scanner;

public class Arbol {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int tamaño;

		System.out.print("Dame el tamaño del arbolito: ");
		tamaño = input.nextInt();
		
		System.out.println("Arbolito: ");
		
		for (int k = 0; k < tamaño -1; k++) {
			for (int i = 0; i < k + 2; i++) {
				for (int j = tamaño; j > i; j--)
					System.out.print(" ");
				for (int j = 0; j <= i; j++)
					System.out.print("@ ");
				System.out.println();
			}
		}

	}

}
