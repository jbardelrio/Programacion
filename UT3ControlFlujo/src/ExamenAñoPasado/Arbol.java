package ExamenA�oPasado;

import java.util.Scanner;

public class Arbol {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int tama�o;

		System.out.print("Dame el tama�o del arbolito: ");
		tama�o = input.nextInt();
		
		System.out.println("Arbolito: ");
		
		for (int k = 0; k < tama�o -1; k++) {
			for (int i = 0; i < k + 2; i++) {
				for (int j = tama�o; j > i; j--)
					System.out.print(" ");
				for (int j = 0; j <= i; j++)
					System.out.print("@ ");
				System.out.println();
			}
		}

	}

}
