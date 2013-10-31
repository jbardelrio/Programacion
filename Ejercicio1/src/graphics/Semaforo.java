package graphics;

import graphics.Rectangle;
import graphics.Ellipse;
public class Semaforo {

	public static void main(String[] args) {
		Rectangle caja, palo;
		Ellipse verde, ambar, rojo;
		
		caja = new Rectangle(10, 10, 60, 110);
		caja.draw();
		//Es mejor que, para cada objeto, creemos una variable, porque sino se perdería la anterior
		//si definimos otra vez la misma. Por eso la siguiente caja la llamamos de otro modo
		palo = new Rectangle(30,120,25,200);
		palo.draw();
		//Ahora rellenamos el palo del semáforo
		palo.fill();
		//Creamos lso objetos circulares de los colores
		verde = new Ellipse(30, 80, 20, 20);
		//Una ver creado el objeto le decimos que use el color verde. El color es en realidad un OBJETO, por lo 
		//que o creamos uno directamente o usamos uno que tengamos predefinido. Nosotros vamos 
		//a utilizar el que nos da la clase COLOR.JAVA ya creado, peor podriamos crearlo nosotros así:
		//	verde.setColor(new Color(0, 200, 0));
		
		verde.setColor(Color.GREEN);
		verde.fill();
		
		//Otra opción sería primero declarar el objeto y después usarlo:
		//Color color_verde=new Color (0, 200, 0);
		//verde.setColor(color_verde);
		
		//NOTA IMPORTANTE: EN MAYÚSCULAS SE PONEN LOS NOMBRES DE LAS CLASES Y EN MINÚSCULAS LOS DE LOS OBJETOS
		ambar = new Ellipse(30, 55, 20, 20);
		ambar.setColor(Color.YELLOW);
		ambar.fill();
		
		rojo = new Ellipse(30, 30, 20, 20);
		rojo.setColor(Color.RED);
		rojo.fill();
	}

}
