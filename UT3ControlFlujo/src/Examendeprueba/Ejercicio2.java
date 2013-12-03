package Examendeprueba;
import graphics.Ellipse;
import graphics.Rectangle;
import graphics.Line;
import graphics.Text;

import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int tamaño = 0;
		int figuras = 0;
		Rectangle tablero;
		Ellipse pelota;
		Rectangle cuadrado;
		Line linea;
		Text texto;
		int enteros [];
		enteros = new int [5];
		
		
		
		
		
		System.out.println("Dime el tamaño del cuadrado : ");
		tamaño = teclado.nextInt();
		System.out.println("Dime el número de figuras : ");
		figuras = teclado.nextInt();
		
		tablero = new Rectangle(0, 0, tamaño, tamaño);
		tablero.draw();
		
		switch (figuras) {
		case 1:pelota = new Ellipse(200, 200, 40, 40);
				pelota.fill();
			
			break;
		case 2:pelota = new Ellipse(200, 200, 40, 40);
				pelota.fill();
				cuadrado = new Rectangle(20, 20, 50, 11);
				cuadrado.fill();
			break;
		case 3:pelota = new Ellipse(200, 200, 40, 40);
		pelota.fill();
		cuadrado = new Rectangle(20, 20, 50, 11);
		cuadrado.fill();
		linea = new Line (200,25,60,30);
		linea.draw();
			break;
		case 4:pelota = new Ellipse(200, 200, 40, 40);
		pelota.fill();
		cuadrado = new Rectangle(20, 20, 50, 11);
		cuadrado.fill();
		linea = new Line (200,25,60,30);
		linea.draw();
		texto = new Text (300, 400, "DAW");
		texto.draw();
			
			default:
			break;
		}

	}

}
