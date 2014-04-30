package cadenas;
/*
 * Ejercicio 2. Mejorar el ejercicio 1, teniendo en cuenta que los espacios en blanco no cuentan, ni las mayúsculas o minúsculas.
 */
public class Ejercicio2 {

	public static void main(String[] args) {
		
		String cadena=BuscarCaracteres.pedirCadena();
		
		StringBuilder cadenaLimpia=new StringBuilder(cadena.toLowerCase());
		
		for(int i=0;i<cadenaLimpia.length();i++) {
			if (!Character.isLetterOrDigit(cadenaLimpia.charAt(i))) {
				cadenaLimpia.deleteCharAt(i);
			}
		}
		
		String original=cadenaLimpia.toString();
		String invertida=cadenaLimpia.reverse().toString();
		
		System.out.printf("Cadena: %s\nInversa: %s\n",original,invertida);
		
		if (original.equals(invertida)) {
			System.out.println("Â¡Es palÃ­ndromo!");
		}
	}

}
