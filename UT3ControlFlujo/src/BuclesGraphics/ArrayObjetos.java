package BuclesGraphics;

import graphics.Color;
import graphics.Ellipse;

public class ArrayObjetos {

	public static void main(String[] args) throws InterruptedException {
		
		
		Color[] colores;
		//Otra opción para declarar los colores en el array sería así:
		//Color[] colores = {new Color(255,0,0),  Color.CYAN, Color.RED, Color.LIGHT_GRAY, new Color(200,180,10) };
		
		colores = new Color[5];
		
		colores[0] = new Color(255,0,0);
		colores[1] = Color.CYAN;
		colores[2] = Color.RED;
		colores[3] = Color.LIGHT_GRAY;
		colores[4] = new Color(200,180,10);
		
		Ellipse circulo = new Ellipse(100, 100, 300, 300);
		
		while(true){
			circulo.setColor(colores[(int)(Math.random()*5)]);
			circulo.fill();
			Thread.sleep(500);
		}
	}

}
