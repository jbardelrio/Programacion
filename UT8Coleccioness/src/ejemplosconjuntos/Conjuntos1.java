package ejemplosconjuntos;

import java.util.HashSet;
import java.util.Iterator;

public class Conjuntos1 {

	public static void main(String[] args) {
		
		HashSet<String> miscadenas = new HashSet<String>();
		
		miscadenas.add("Daw");
		miscadenas.add("Asir");
		
		System.out.println(miscadenas);
		
		if (miscadenas.contains("Daw")) {//Si miscadenas CONTIENE "Daw"
			
			System.out.println("Daw es un ciclo");
		
		miscadenas.add("Daw");//Como es un conjunto este no lo va añadir porque CADA DATO DEBE SER ÚNICO EN UN CONJUNTO, no se puede repetir
		System.out.println(miscadenas);
		
		Iterator<String> i=miscadenas.iterator();//PARA RECORRER UN CONJUNTO usamos un ITERADOR y un WHILE. HAY QUE PONER <STRING> para que sea
		//una cadena y no un OBJECT, es decir, un iterador de cadenas.
		while (i.hasNext()){//Mientras que tenga el siguiente...
			i.next();//Recorrer el siguiente
		}
		
		miscadenas.remove("Daw");//Borra el "Daw" si existe dentro del conjunto. AQUI SI DIFERENCIA ENTRE MAYÚSCULAS Y MINÚSCULAS (MÉTODO EQUALS)
		System.out.println(miscadenas);
			
		}

	}

}
