package Libro;

import java.util.Scanner;

public class Array5_LineaComandos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numeros;
		System.out.println("Dime los 3 números elegidos: ");
		numeros = teclado.nextInt();
		teclado.close();
		
		//Comprueba el número de argumentos
		if(args.length !=3)
			System.out.println("Error, el número de argumentos introducidos "
					+ "no es correcto");
		else{
			//Obtiene el tamaño del array del primer argumento introducido
			int longitudArray = Integer.parseInt( args[ 0 ]);
			//Crea el array
			int [] arreglo = new int[ longitudArray ]; 
			
			//Obtiene el valor inicial y el incremento de los argumentos introducidos
			int valorInicial = Integer.parseInt( args[ 1 ]);
			int incremento = Integer.parseInt( args[ 2 ]);
			
			//Calcula el valor para cada elemento del array
			for (int contador = 0; contador < arreglo.length; contador++) 
				arreglo[contador] = valorInicial + incremento * contador;
			
			System.out.printf("%s%8s\n", "Indice", "Valor");
			
			//Muestra el número de índice y el valor del array
			for (int contador = 0; contador < arreglo.length; contador++) {
				System.out.printf("%5d%8d\n", contador, arreglo[contador]);
			
			}
		}

	}

}
