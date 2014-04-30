package cadenas;
/*
 * Ejercicio 1. Calcular si una frase es un palíndromo, comprobando si la cadena es simétrica.
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		
		String cadena=BuscarCaracteres.pedirCadena();
		
		String inversa=(new StringBuilder(cadena)).reverse().toString();

		
		System.out.printf("Cadena: %s\nInversa: %s\n",cadena,inversa);
		
		if (cadena.equals(inversa)) {
			System.out.println("Â¡Es palÃ­ndromo!");
		}
	}

}
