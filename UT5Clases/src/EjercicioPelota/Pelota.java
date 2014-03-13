package EjercicioPelota;

import graphics2.Color;
import graphics2.Ellipse;

public class Pelota {

	int radio;
	Ellipse circulo;
	
	public Ellipse getCirculo(double x, double y, double w, double h) {
		circulo = new Ellipse(x, y, w, h);
		circulo.setThickness(20f);
		circulo.setColor(Color.BLUE);
		circulo.fill();
		return circulo;
	}

	public void setCirculo(Ellipse circulo) {
		this.circulo = circulo;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	public void setLimites(int i, int j, int k, int l) {
	
		
	}

	public void dibuja() {

	
	}

	public void mueve() {
		
		
	}
	

}
