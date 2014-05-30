package repaso;

import java.util.Arrays;

/*
 * La Primitiva es un juego donde tenemos un tablero con n�meros del 1 al 49. El jugador marca 6 de ellos. 
 * En un sorteo se eligen 6 n�meros m�s el complementario (un total de 7). 
 * En funci�n de los n�meros del sorte que coincidan con los seis elegidos por el usuario, tendremos los siguientes premios:

    3 aciertos.
    4 aciertos.
    5 aciertos.
    5 aciertos + complementario.
    6 aciertos.

Crea la clase Primitiva que tenga los siguientes m�todos:

    Un constructor que permita pasar los datos de un sorteo: fecha, recaudaci�n y combinaci�n ganadora, para que se almacenen dentro de la clase. 
    Debe comprobar que los n�meros pasados son 7 y est�n en el rango permitido, generando una excepci�n en caso contrario (IllegalArgumentException).

    Un m�todo compruebaNumeros que recibir� un array con los 6 n�meros jugados. El m�todo coprobar� los aciertos y los almacenar� internamente. 
    Pueden hacerse varias llamadas a compruebaNumeros porque se jueguen muchas combinaciones.

    Un m�todo compruebaMultiple, que tiene el mismo funcionamiento que compruebaNumeros pero al que se le pueden pasar combinaciones 
    de m�s de 6 n�meros.

    Un m�todo muestraPremios que mostrar� por consola los premios acumulados (de cada categor�a).

    Implementar el m�todo toString() y getters.

 */
public class Primitiva{

	String fecha;
	double recaudacion;
	int [] combinacion;
	int [] combinacionpremiada;
	int numaciertos = 0;

	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public double getRecaudacion() {
		return recaudacion;
	}
	public void setRecaudacion(double recaudacion) {
		this.recaudacion = recaudacion;
	}
	public int[] getCombinacion() {
		return combinacion;
	}
	public void setCombinacion(int[] combinacion) {
		this.combinacion = combinacion;
	}
	public int[] getCombinacionpremiada() {
		return combinacionpremiada;
	}
	public void setCombinacionpremiada(int[] combinacionpremiada) {
		this.combinacionpremiada = combinacionpremiada;
	}
	public int getNumaciertos() {
		return numaciertos;
	}
	public void setNumaciertos(int numaciertos) {
		this.numaciertos = numaciertos;
	}
	
	
	
	@Override
	public String toString() {
		return "Primitiva [fecha=" + fecha + ", recaudacion=" + recaudacion
				+ ", combinacion=" + Arrays.toString(combinacion)
				+ ", combinacionpremiada="
				+ Arrays.toString(combinacionpremiada) + ", numaciertos="
				+ numaciertos + "]";
	}
	
	public Primitiva(String fecha, double recaudacion, int[] combinacion) {
		this.fecha = fecha;
		this.recaudacion = recaudacion;
		this.combinacion = combinacion;	
								
	}
	
	public int compruebaNumeros(){
	
		for (int i = 0; i < combinacion.length; i++) {
			if (combinacion[i] == combinacionpremiada[i]) {
				numaciertos++;
			}
		}
		return numaciertos;
	}
	
	public static void main(String[] args) {

	}

}
