package ejemplos;

public class Arrays {

	public static void main(String[] args) {
		//Declaraci�n: 
		
		int[] enteros;
		int enteros2[]; //Se puede escribir como arriba o en esta l�nea. Mejor usar la de arriba.
		String [] cadenas;
		
		//Creaci�n:
		
		enteros = new int[40];
		cadenas = new String[40];
		
		//Inicializaci�n: 
		int[] enteros3={1,2,3,7}; //As� lo creamos e inicializamos directamente, as� no hace falta hacer el NEW
		String[] cadenas2={"Uno","Dos","Tres"};
		String[] cadenas3={new String("Uno"), new String("dos"), new String ("tres")};//Esto es igual que 
		//el de aariba pero creado de otra manera, pero es lo mismo
		
		for(int i=0;i<enteros.length;i++) enteros[i]=i;//Esto inicializa desde 0 hasta 39 el array de ENTEROS
		
		for(int i=0;i<cadenas.length;i++) cadenas[i]=new String(Integer.toString(i));//Esto inicializa 
		//el array de cadenas desde el 0 hasta el 39. contiene 0,1,2...hasta 39 pero como CADENAS no como n�meros
		
		//Acceso elementos: Se hace con los CORCHETES
		
		//Recorrido
		
		for(int i=0;i<cadenas.length;i++) 
			System.out.println(cadenas[i]); //Eesto imprime las cadenas que tengo en el array
		
		for(String c:cadenas2)
			System.out.println(c); //Esta forma de recorrer el array hace lo mismo que la de arriba
		
		//B�squeda y ordenaci�n: ESTO FALTA EXPLICARLO A�N

		//Array bidimensional
		
		int [][] enteros4; 
		
		int [][] enteros5 = {{1,2},{3,4}};
		
		System.out.println(enteros5[0][1]);
		System.out.println(enteros5[1][0]);
		
		enteros4 = new int[3][3];//As� creamos un array pero con un NEW, es otra forma de hacerlo distinta
		
		enteros4 [1][1]=1; //As� le decimos que esa posici�n (que es la de en medio del array 3x3 es un 1
		enteros4 [2][2]=2;
		enteros4 [1][2]=3; //PRIMERO LA FILA Y LUEGO LA COLUMNA
		
		
		
	}

}
