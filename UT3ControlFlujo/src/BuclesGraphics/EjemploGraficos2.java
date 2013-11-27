package BuclesGraphics;

import graphics.Color;
import graphics.Ellipse;
import graphics.Rectangle;

public class EjemploGraficos2 {

	public static void main(String[] args) throws InterruptedException {
		Ellipse pelota;
		Rectangle tablero;
		Color color;
		int movimiento_x;
		int movimiento_y;
		//(200, 200, 40, 40);   EStos son la coordenada X, la coordenada Y, la anchura y la altura
		pelota = new Ellipse(200, 200, 40, 40);
		color = new Color((int)(Math.random()*256),
				(int)(Math.random()*256),
				(int)(Math.random()*256));
		
		tablero = new Rectangle(0, 0, 400, 400);
		tablero.draw();
		
		pelota.setColor(color);
		pelota.fill();
		
		movimiento_x = (int)(Math.random()*7+1)-3;
		movimiento_y = (int)(Math.random()*7+1)-3;
		while(true)
		{
			pelota.translate(movimiento_x, 0);
			//pelota.getX()+40   Esto es los 400 del cuadrado más los 40 del tamaño de la pelota
			if ((pelota.getX()+40)>400 || pelota.getX() < 0) movimiento_x=-movimiento_x;

			pelota.translate(0, movimiento_y);
			if ((pelota.getY()+40)>400 || pelota.getY() < 0) movimiento_y=-movimiento_y;
			
			Thread.sleep(40);
		}

	}

}