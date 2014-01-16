package Examen5_12;
import graphics.Color;
import graphics.Rectangle;

import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Rectangle tablero;
		Color color;
		int lado;
		int red = 0;
		int green = 0;
		int blue = 0;
		boolean tamaño = true;
		
		tablero = new Rectangle(0, 0, 400, 400);
		color = new Color(red, green, blue);

		do {
			
		System.out.println("Dime el tamaño del lado");
		lado = teclado.nextInt();
		
		} while (lado < 100 || lado > 200 );
		
		do {
		System.out.println("Dime el rojo: ");
		red = teclado.nextInt();
		} while (red < 0 || red > 255 );
		
		do {
		System.out.println("Dime el verde: ");
		green =  teclado.nextInt();
		} while (green < 0 || green > 255 );
		
		do {
		System.out.println("Dime el azul: ");
		blue =  teclado.nextInt();
		} while (blue < 0 || blue > 255 );
		
	
		tablero=new Rectangle(10,10,lado,lado);
		tablero.setColor(color = new Color(red, green, blue));
		tablero.fill();
		}
	}


