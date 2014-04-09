package arrays2d;
/*
 * Ejercicio 2. Declara y crea un tipo de variable que sea capaz de contener la nota que han obtenido 4 alumnos 
 * en los diferentes módulos en los que están matriculados. 
 * Sabemos que el primer alumno está matriculado en 4 módulos; 
 * el segundo, en 7 módulos; el tercero, en 3 módulos, y el cuarto, en 2 módulos.
 */
public class Ejercicio2 {

	
	public static void main(String[] args) {
		
		int[][] notas={{5, 6, 9, 7},{5, 5, 5, 5, 5, 5, 5},{6, 6, 5},{8, 7}};

		for (int i = 0; i < notas.length; i++) { 
			for (int j = 0; j < notas[i].length; j++) { 
				System.out.print(notas[i][j]+ " ");
			}
			System.out.println();
		}
		
	}

}
