package BuclesGraphics;

import java.util.Scanner;

public class EjemploArrayAdivinarClave {

	public static void main(String[] args) {
		String[] palabras={"uno","hola","tera","bit"};

			Scanner teclado=new Scanner(System.in);
			System.out.println("Dame una palabra: ");
			
			String intento;
			intento = teclado.next();
			boolean encontrar=false;
			
			for (int i = 0; i <palabras.length && !encontrar; i++) {
				if (intento.equals(palabras[i])) encontrar=true;
					
			}
			if (encontrar){
				System.out.println("Muy bien.");
			};
				
			
	}

}
