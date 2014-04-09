package arrays2d;

import java.util.Arrays;

/*
 * Ejercicio 3. Queremos guardar en la memoria del ordenador el n�mero de alumnos matriculados (por m�dulos) 
 * en el ciclo de DAW. 
 * Sabemos que los alumnos matriculados por cada m�dulo son:

	21 alumnos matriculados en Sistemas Inform�ticos.
	17 alumnos matriculados en Base de Datos.
	30 alumnos matriculados en Programaci�n.
	14 alumnos matriculados en Lengaje de Marcas.
	12 alumnos matriculados en Entornos de Desarrollo.
	25 alumnos matriculados en Acceso a Datos.
 */
public class Ejercicio3 {

	public static void main(String[] args) {
		
		String [] modulos = {"Sistemas Inform�ticos", "Base de Datos", "Programaci�n", "Lenguaje de Marcas", 
							"Entornos de Desarrollo", "Acceso a Datos"};
		int[] numalumnos = {21, 17, 30, 14, 12, 25};
			
		System.out.println(Arrays.toString(modulos));
		System.out.println(Arrays.toString(numalumnos));
		

	}

}
