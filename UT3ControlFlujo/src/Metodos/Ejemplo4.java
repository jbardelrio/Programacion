package Metodos;

import java.util.Scanner;
//LA FÓRMULA ES ESTA: (int)(math.random() * ((max - min) + 1)) + min;
public class Ejemplo4 {

	public static void main(String[] args) {
		int minimo, maximo;
		
		minimo = 1;
		maximo = 10;
		
		for (int i = 0; i < 10000000; i++) {
			
			int aleatorio = getAleatorio(minimo, maximo);
			
			if (aleatorio<minimo || aleatorio>maximo) {
				System.out.print("getAleatorio se ha ido de rango.");
				
			}
			if (i%10000==0) System.out.println("#"); //Cada 10000 números imprime una #
		}
	}
	
	public static int getAleatorio(int min, int max){
		
		// LA FÓRMULA ES ESTA: (int)(math.random() * ((max - min) + 1)) + min;		
		int aleatorio = (int)(Math.random() * ((max - min) + 1)) + min;
		System.out.println(aleatorio);
		return aleatorio;
		
	
	}

}
// LA FÓRMULA ES ESTA: (int)(math.random() * ((max - min) + 1)) + min;