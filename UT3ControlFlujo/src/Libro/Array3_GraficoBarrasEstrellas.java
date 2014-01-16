package Libro;

public class Array3_GraficoBarrasEstrellas {

	public static void main(String[] args) {
		int [] arreglo = { 0, 0, 0, 0, 0, 0 , 1 , 2, 4, 2 , 1 };
		System.out.println("Distribución de las calificaciones: ");
		
		//par. cada el_nto del arreglo, imprime una barra del grafi co
		
		for (int contador = 0; contador < arreglo.length; contador++) {
			
			//Imprime etiquetas de la barra
			if (contador == 10)
				System.out.printf("%5d: ", 100);
			else
				System.out.printf("%02d-%02d: ", contador * 10, contador * 10 +9 );
			//Imprime barra de asteriscos
			for (int entrellas = 0; entrellas < arreglo[contador]; entrellas++) {
				System.out.print("*");
			}
		}

	}

}
