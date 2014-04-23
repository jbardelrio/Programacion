package ejemplos;

public class EjemplosString {

	public static void main(String[] args) {
		String cadena = "cadena";
		
		cadena = new String("otra cadena");
		//Los objetos cadena no se pueden cambiar, son inmutables. Habría que crear otro objeto distinto
		
		cadena = cadena+" hola cadena"; 
		//Con esto de arriba creamos otro objeto nuevo CADENA que suma el anterior a este. El anterior se pierde
		
		if (cadena.equals("otra cadena hola cadena"))//Comparador de cadenas .EQUALS()
			System.out.println("Cadenas iguales");
		
		System.out.println(cadena.toUpperCase());//Pasar cadena a mayúsculas
		System.out.println(cadena);
		
		String nombre1="Angel", nombre2="Alberto";
		System.out.println(nombre1.compareTo(nombre2));
		System.out.println(nombre2.compareTo(nombre1));
		
		System.out.println("2".compareTo("3"));
		System.out.println("3".compareTo("2"));
		System.out.println("3".compareTo("3"));
		//Esto de arriba sirve para comparar una cadena con otra. Devuelve el número según sea mayor o menor la comparación
	
		System.out.println(cadena.trim());//Devuelve una copia de la cadena quitando espacios en blanco. CREO QUE NO HACE ESTO
			
		System.out.println(cadena.contains("cdena"));//Devuelve cierto o falso si la cadena contiene los caracteres que busquemos
	
		System.out.println(String.valueOf(0.7f));//Pasa a cadena un número, caracter o variable que le pasemos
		
		Float.valueOf("3");//Pasa una cadena a un float
		float f=Float.valueOf("2.45");
		
		System.out.println(cadena.substring(12, 16));//Coge la CADENA y crea una nueva cadena con ese trozo(caracteres 12 a 16)
		System.out.println(cadena.substring(12, cadena.length()));
		
		//Character.isUpperCase();  //Sacar un CARACTER para ver si es un número, mayúsculas, minúsculas, etc
		
	}

}
