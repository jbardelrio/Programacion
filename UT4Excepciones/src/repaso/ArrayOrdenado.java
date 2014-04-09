package repaso;

import java.util.Arrays;

/*
 * Crear la clase ArrayOrdenado. ArrayOrdenado almacena un array de n�meros enteros que siempre est� ordenado. 
 * La clase tendr�:
 * - Un constructor, al que le pasamos un array de enteros que se almacenar� internamente.
 * - Un constructor, al que le pasamos un valor y crea un ArrayOrdenado de ese tama�o.
 * - getElemento(int x) devuelve el valor del elemento en la posici�n x.
 * - setElemento(int x, int elto) cambia el elemento en la posici�n x por el elemento elto.
 * Obviamente, como es un array ordenador, si el n�mero tiene otro orden se colocar� automaticamente 
 * en otra posici�n.
 * - toString()
 */

public class ArrayOrdenado {
	int[] numeros;
	
	private void ordenar(){
		Arrays.sort(numeros);
	}
	public ArrayOrdenado(int[] vector) {
		numeros = Arrays.copyOf(vector, vector.length);
		ordenar();
	}
	
	public ArrayOrdenado(int tama�o) {
		numeros = new int[tama�o];
		Arrays.fill(numeros, 0);//Este FILL no ser�a necesario en realidad, es para que rellene a ceros
	}
	
	public int getElemento(int x){
		return numeros[x];
	}
	
	public void setElemento(int x, int elto){
		numeros[x] = elto;
		ordenar();
	}
	
	public String toString(){
		return Arrays.toString(numeros);
	}
	
	public static void main(String[] args) {
		
		ArrayOrdenado x;
		x = new ArrayOrdenado(100);
		
		for (int i = 0; i < 100; i++) {
			x.setElemento(i, (int)(Math.random()*100 + 1));
		}

		System.out.println(x);
	}

}
