package ejemploscolecciones;

import java.util.ArrayList;
import java.util.Collection;

public class Colecciones2 {

	public static void main(String[] args) {
		
		Collection <String> c = new ArrayList<String>();
		String cadena = "ASIR";
		
		c.add("Daw");
		c.add("Daw");
		c.add(cadena);
		
		System.out.println(c.size());//Imprime el tamaño del array
		
		System.out.println(c);//Te imprime el arraylist completo
		
		for(String s:c){
			System.out.println(s);//Te imprime el arraylist pero uno a uno
		}
		
		c.remove(cadena);//Para borrar
		
		System.out.println(c.size());//Imprime el tamaño del array
		
		System.out.println(c);//Te imprime el arraylist completo
	}
}
