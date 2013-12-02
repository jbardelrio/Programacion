package Libro;

public class Array1 {

	public static void main(String[] args) {
		final int LONGITUD_ARRAY = 10;
		int [] arreglo = new int [LONGITUD_ARRAY];
		
		//Calcular valor para cada elemento del array
		for (int contador = 0; contador < arreglo.length; contador++) 
		
		//Esto no va dentro del for. Es la fórmula para calcular los valores
		arreglo [contador] = 2 + 2 * contador;
		System.out.printf("%s%8s\n", "Indice", "Valor");
		
		
		//Imprime el valor de cada elemento del array
		for (int contador = 0; contador < arreglo.length; contador++) {
			System.out.printf("%s%8s\n", contador, arreglo [contador]);
		}

	}

}
