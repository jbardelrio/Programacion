package BuclesGraphics;

import graphics.Color;
import graphics.Ellipse;

public class Ejercicio4 {
//Diana: Escribir un programa que dibuje 10 círculos concéntricos en la pantalla. 
//Puedes utilizar Math.Random() para obtener valores de color aleatorio.
	public static void main(String[] args) {
		
		Color[] colores;
		int centro_x, centro_y;
		int distancia;
		int anterior; //Este -1 es solo para que iniciarlizarlo a un número que no pueda ser y que no de error
		
		//Otra opción para declarar los colores en el array sería así:
		//Color[] colores = {new Color(255,0,0),  Color.CYAN, Color.RED, Color.LIGHT_GRAY, new Color(200,180,10) };
		
		colores = new Color[5];
		
		colores[0] = new Color(255,0,0);
		colores[1] = Color.MAGENTA;
		colores[2] = Color.BLUE;
		colores[3] = Color.LIGHT_GRAY;
		colores[4] = new Color(200,180,10);
		
		centro_x = 200;
		centro_y = 200;
		distancia = 15;
		anterior = -1;
		
		for (int i = 10; i > 0; i--) {
		
			Ellipse circulo;
			int actual; 
			
			circulo = new Ellipse(centro_x-i*distancia, centro_y-i*distancia, distancia*i*2, distancia*i*2);
			do{
				actual=(int)(Math.random()*5);
			}while (anterior==actual);
			circulo.setColor(colores[actual]);
			circulo.fill();
			anterior=actual;
		}
		

	}

}
