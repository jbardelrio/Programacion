package ejemplosListas;

import java.util.ArrayList;

public class Listas2 {

	public static void main(String[] args) {
		ArrayList <String> c = new ArrayList<String>();//Ahora creamos una lista de cadenas
		String cadena = "ASIR";
		
		c.ensureCapacity(1000);//Para marcar la capacidad m�nima del array. En este caso de damos 1000 de capacidad. Reserva en memoria este espacio para el array
		c.add("Daw");
		c.add("Daw");
		c.add(cadena);
		
		c.add(2, "Insercci�n");
		c.set(0, "Otra cadena");//Coloca en la posici�n 3 la cadena que le digamos. Tiene que haber uno antes metido. Elimina el anterior.
		//Si no hay nada en la posci�n elegida da error(posici�n 3 por ejemplo)
		//c.set(5, "Lanza error de excepcion");
		//c.add(6, "Insercci�n");//Este tambi�n da error porque hay huecos entre 3 y 6
		c.add(c.size(), "Insercci�n");//Este lo inserta bien porque coge el �ltimo de la lista y lo a�ade despu�s de ese
		
		c.remove("Insercci�n");//Puedes pasarle directamente la cadena que quieres borrar. Nos ha borrado en �ltimo, ya que sale 2 veces "Insercci�n"
		
		System.out.println(c.size());//Imprime el tama�o, nos dice que es 5 el tama�o (utilizado) del array, pero en realidad tiene 1000 de capacidad
		
		System.out.println(c);

	}

}
