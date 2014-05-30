package repaso;

import java.util.Arrays;

/*
 * La Primitiva es un juego donde tenemos un tablero con números del 1 al 49. El jugador marca 6 de ellos. 
 * En un sorteo se eligen 6 números más el complementario (un total de 7). 
 * En función de los números del sorte que coincidan con los seis elegidos por el usuario, tendremos los siguientes premios:

    3 aciertos.
    4 aciertos.
    5 aciertos.
    5 aciertos + complementario.
    6 aciertos.

Crea la clase Primitiva que tenga los siguientes métodos:

    Un constructor que permita pasar los datos de un sorteo: fecha, recaudación y combinación ganadora, para que se almacenen dentro de la clase. 
    Debe comprobar que los números pasados son 7 y están en el rango permitido, generando una excepción en caso contrario (IllegalArgumentException).

    Un método compruebaNumeros que recibirá un array con los 6 números jugados. El método coprobará los aciertos y los almacenará internamente. 
    Pueden hacerse varias llamadas a compruebaNumeros porque se jueguen muchas combinaciones.

    Un método compruebaMultiple, que tiene el mismo funcionamiento que compruebaNumeros pero al que se le pueden pasar combinaciones 
    de más de 6 números.

    Un método muestraPremios que mostrará por consola los premios acumulados (de cada categoría).

    Implementar el método toString() y getters.

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
