package ejemplosListas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Listas1 {

	public static void main(String[] args) {

		List <String> c = new ArrayList<String>();//Ahora creamos una lista de cadenas
		String cadena = "ASIR";
		
		c.add("Daw");
		c.add("Daw");
		c.add(cadena);
		
		c.add(2, "Insercci�n");
		c.set(0, "Otra cadena");//Coloca en la posici�n 3 la cadena que le digamos. Tiene que haber uno antes metido. Elimina el anterior.
		//Si no hay nada en la posci�n elegida da error(posici�n 3 por ejemplo)
		//c.set(5, "Lanza error de excepcion");
		//c.add(6, "Insercci�n");//Este tambi�n da error porque hay huecos entre 3 y 6
		c.add(c.size(), "Insercci�n");//Este lo inserta bien porque coge el �ltimo de la lista y lo a�ade despu�s de ese
		
		System.out.println(c);

	}

}
