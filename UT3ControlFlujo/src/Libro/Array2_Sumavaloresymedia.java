package Libro;

public class Array2_Sumavaloresymedia {

	public static void main(String[] args) {
		int[] arreglo = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
		int total = 0;
		int media = 0;
		
		//Sumar el valor de cada elemento del array al total
		for (int contador = 0; contador < arreglo.length; contador++) 
			
			total += arreglo [contador];
			media = total / arreglo.length;
		System.out.println("La suma de todos los elementos del array es: " + total);
		System.out.println("La media es: " + media);
	}

}
