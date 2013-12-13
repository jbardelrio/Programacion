package ejemplosGraphics2;

import java.awt.Point;

import graphics2.*;

public class ejemplo1 {

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
		//Esto de abajo es lo mismo que las tres líneas de arriba. Lo que hace es que hay que pulsar el ratón para que
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
		
		coordenadas.setText(pulsacion.x + "-" + pulsacion.y);
		//DX = oordenada final menos el ancho / 2, DY = coordenada inicial menos el alto / 2
		circulo.translate(pulsacion.x - circulo.getX() - circulo.getWidth()/2, pulsacion.y - circulo.getY() - circulo.getHeight()/2); 
		System.out.println("Has pulsado en: " + pulsacion.x + "-" + pulsacion.y);
	
		}
		
		
	}

}
