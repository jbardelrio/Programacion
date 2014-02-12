package EjerciciosIniciales;
/*
 * Ejercicio 2 Dada la clase Coche:

class Coche {
  private int velocidad;
  Coche() {velocidad=0;}
}

A�adirle los siguientes m�todos: 
1. int getVelocidad - Obtiene la velocidad actual. 
2. void acelera(int mas) - Aumenta la velocidad en 'm�s' kil�metros hora.
 */
public class Coche  {
	private int velocidad;
	 
	Coche() {
		  velocidad=0;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public void acelera (int mas){
		velocidad += mas;
	}

}