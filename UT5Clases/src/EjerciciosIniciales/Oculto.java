package EjerciciosIniciales;
/*
 * Ejercicio 5 Crea la clase Oculto que contiene un número oculto. 
 * Cuando se crea un objeto de esta clase, se crea internamente un número 
 * aleatorio entre 1 y 100, o entre los números que se le pasan por 
 * parámetros (mínimo y máximo). 
 * Esta clase entrá el método: pruebaNumero(int n),
 *  que devolverá 0 si el número es el oculto, 
 *  -1 si el número oculto es menor y +1 si el número oculto es mayor. 
 *  Utiliza esta clase para crear la aplicación Adivina el número.
 */
public class Oculto {

	private int oculto;
	
	public int getOculto() {
		return oculto;
	}

	public void setOculto(int oculto) {
		this.oculto = oculto;
	}

//int valorEntero = Math.floor(Math.random()*(N-M+1)+M);  
// Valor entre M y N, ambos incluidos.	
	
	public Oculto() {
		oculto = (int)(Math.random()*(100-1+1)+1); 
	}
	
	public Oculto( int minimo, int maximo ) {
		oculto = (int)(Math.random()*(maximo-minimo+1)+minimo);
	}

	public int pruebaNumero ( int n ) {
		if ( n > oculto ){
			return 1;
		}else if ( n < oculto ){
			return -1;
		}else{
			return 0;
		}
	}
}
