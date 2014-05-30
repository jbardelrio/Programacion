package ejemplosListas;

import java.util.ArrayList;

public class Listas2 {

	public static void main(String[] args) {
		ArrayList <String> c = new ArrayList<String>();//Ahora creamos una lista de cadenas
		String cadena = "ASIR";
		
		c.ensureCapacity(1000);//Para marcar la capacidad mínima del array. En este caso de damos 1000 de capacidad. Reserva en memoria este espacio para el array
		c.add("Daw");
		c.add("Daw");
		c.add(cadena);
		
		c.add(2, "Insercción");
		c.set(0, "Otra cadena");//Coloca en la posición 3 la cadena que le digamos. Tiene que haber uno antes metido. Elimina el anterior.
		//Si no hay nada en la posción elegida da error(posición 3 por ejemplo)
		//c.set(5, "Lanza error de excepcion");
		//c.add(6, "Insercción");//Este también da error porque hay huecos entre 3 y 6
		c.add(c.size(), "Insercción");//Este lo inserta bien porque coge el último de la lista y lo añade después de ese
		
		c.remove("Insercción");//Puedes pasarle directamente la cadena que quieres borrar. Nos ha borrado en último, ya que sale 2 veces "Insercción"
		
		System.out.println(c.size());//Imprime el tamaño, nos dice que es 5 el tamaño (utilizado) del array, pero en realidad tiene 1000 de capacidad
		
		System.out.println(c);

	}

}
