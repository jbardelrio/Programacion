package Examen5_12;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int deseada = 0;
		int margen = 0;
		int actual = 0;
		
		boolean infinito = true;
		
		System.out.println("Controlador de termostato");
		for(int k=0;k<25;k++) System.out.print("-");
		System.out.println();
		
		System.out.println("¿A qué temperatura quieres estar?: ");
		deseada = teclado.nextInt();
		
		System.out.println("¿Con qué histéresis trabajamos?: ");
		margen = teclado.nextInt();
		
		while(infinito){
			int temp1 = deseada + margen;
			int temp2 = deseada - margen;
		System.out.println();
		System.out.println("¿Temperatura actual?: ");
		actual = teclado.nextInt();
		if ( actual < temp2 || actual > temp1 ) {
			for(int k=0;k<25;k++) System.out.print("-");
			System.out.println();
			System.out.println("--  ENCENDIDO  --");
			for(int k=0;k<25;k++) System.out.print("-");
		}else{
			for(int k=0;k<25;k++) System.out.print("-");
			System.out.println();
			System.out.println("--  APAGADA  --");
			for(int k=0;k<25;k++) System.out.print("-");
			System.out.println();
		}
		}
		

	}

}
