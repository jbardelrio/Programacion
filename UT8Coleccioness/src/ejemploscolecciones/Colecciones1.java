package ejemploscolecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Colecciones1 {

	public static void main(String[] args) {
		Collection colec = new ArrayList();
		
		for (int i = 0; i < 10; i++) {
			colec.add(i);
			//colec.add(new Integer(i));    Lo de arriba hace en realidad lo mismo que esto de abajo. Escuchar audio EJEMPLOSCOLECCIONES1
		}
		
		System.out.println(colec);
		
		for (Object i:colec) {
			System.out.println(i);
		}
		
		Iterator it = colec.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
