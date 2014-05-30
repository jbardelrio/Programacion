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
		
		c.add(2, "Insercción");
		c.set(0, "Otra cadena");//Coloca en la posición 3 la cadena que le digamos. Tiene que haber uno antes metido. Elimina el anterior.
		//Si no hay nada en la posción elegida da error(posición 3 por ejemplo)
		//c.set(5, "Lanza error de excepcion");
		//c.add(6, "Insercción");//Este también da error porque hay huecos entre 3 y 6
		c.add(c.size(), "Insercción");//Este lo inserta bien porque coge el último de la lista y lo añade después de ese
		
		System.out.println(c);

	}

}
