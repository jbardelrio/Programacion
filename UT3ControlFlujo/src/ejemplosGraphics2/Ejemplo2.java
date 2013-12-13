package ejemplosGraphics2;

import graphics2.Canvas;
import graphics2.Color;
import graphics2.Ellipse;
import graphics2.Rectangle;
import graphics2.Text;

import java.awt.Point;

public class Ejemplo2 {

	public static void main(String[] args) {
		Rectangle cuadrado;
		cuadrado = new Rectangle(100, 100, 300, 300);
		cuadrado.setThickness(6.5f); //LA "f" indica que es un FLOAT
		cuadrado.setColor(Color.RED);
		cuadrado.draw();

		Ellipse circulo;
		circulo = new Ellipse(150, 150, 20, 20);
		circulo.setThickness(20f); 
		circulo.setColor(Color.BLUE);
		circulo.fill();
		
		// Canvas.pause(); //Sir para hacer una pausa hasta que pulsemos el ok que sale en la nueva ventana
		
		/*Canvas c;
		c = Canvas.getInstance();
		c.waitMouseClick();
		*/
		//Esto de abajo es lo mismo que las tres l�neas de arriba. Lo que hace es que hay que pulsar el rat�n para que
		//siga con la siguiente orden.
		// Canvas.getInstance().waitMouseClick();
			
		 // circulo.undraw();  //Este borra el objeto
		
		Canvas c;
		c = Canvas.getInstance();
		c.waitMouseClick();
		
		Text coordenadas = new Text(10, 10,"-");
		coordenadas.draw();
		circulo.draw(); 
		while(true){
		Point pulsacion = c.waitMouseClick();
		circulo.undraw();
		
		coordenadas.setText(pulsacion.x + "-" + pulsacion.y);
		
		circulo = new Ellipse(pulsacion.x-30, pulsacion.y-30, 60, 60);
		circulo.setColor(Color.BLUE);
		circulo.fill();
		
		System.out.println("Has pulsado en: " + pulsacion.x + "-" + pulsacion.y);
		
		}

	}

}
