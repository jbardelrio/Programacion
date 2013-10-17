//Calculen el área de un rectángulo (alineado con los ejes x e y) 
//dadas sus coordenadas x1,x2,y1,y2.

import java.util.Scanner;
public class Ejercicio3d {

	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		double x1, x2, y1, y2, ejex, ejey, area;
			
		System.out.print( "Introduzca el valor de la coordenada x1: " ); 
		x1 = input.nextInt();
		System.out.print( "Introduzca el valor de la coordenada x2: " ); 
		x2 = input.nextInt(); 
		System.out.print( "Introduzca el valor de la coordenada y1: " ); 
		y1 = input.nextInt(); 
		System.out.print( "Introduzca el valor de la coordenada y2: " ); 
		y2 = input.nextInt(); 
		input.close();
		
		ejex = x2 - x1;
		ejey = y2 - y1;
		area = ejex * ejey;
		
		System.out.print("\nEl área del rectángulo es: " + area); 	
	}
}