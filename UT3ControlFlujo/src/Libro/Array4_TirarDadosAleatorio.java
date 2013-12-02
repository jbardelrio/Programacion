package Libro;
import java.util.Random;

public class Array4_TirarDadosAleatorio {

	public static void main(String[] args) {
		//Generamos los números aleatorios
		Random numerosAleatorios = new Random();
		//Creamos el array para contar la frecuencia con que sale cada lado del dado
		int [] frecuencia = new int [7];
		//Tiramos el dado 6000 veces y usamos el valor del dado como FRECUENCIA
		for (int tiro = 0; tiro <= 6000; tiro++) {
			++frecuencia[1 + numerosAleatorios.nextInt(6)];
		}
		System.out.printf("%s%10s\n", "Cara", "Frecuencia");
		
		//Imprimir el valor de cada elemento del array
		for (int cara = 1; cara < frecuencia.length; cara++) {
			System.out.printf("%4d %10d\n", cara, frecuencia[cara]);
		}

	}

}
