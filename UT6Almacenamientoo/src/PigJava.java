
 import java.util.Scanner;
     
    public class PigJava {
    	
    static boolean cadenavacia = false;
    static boolean sintaxis = false;
    String resto = "";
    public static void main(String[] args) {
    	
	    intro();//Llamamos al m�todo "intro" que muestra la pantalla de bienvenida
	   
		do {
			System.out.println();	
		    Scanner input = new Scanner(System.in);
		    
		    try{
			    System.out.print("Introduce la frase a traducir con el PigLatin:");
			    String frase = input.nextLine();
		
			    Scanner cadapalabra = new Scanner(frase);//Nos sirve para leer cada palabra de la frase por separado
			    
			    sonEspacios(frase); //Compruebo en el m�todo sonEspacios si es una cadena vac�a (Hay que darle, al menos, un espacio en blanco para esto)
			   
			    while (cadapalabra.hasNext()) { //El m�todo hasNext() retorna true si  contiene m�s elementos.
				   String pigLatin = cadapalabra.next();//El m�todo next retorna el siguiente elemento
				   System.out.print(convertirPalabra(pigLatin));//Pasamos cada elemento al m�todo convertirPalabra() y los imprimimos
			    }
		    }catch(java.lang.StringIndexOutOfBoundsException e){//Maneja la excepci�n java.lang.StringIndexOutOfBoundsException
			    System.out.println();
				System.out.println("Error de sintaxis. Puede que hayas escrito un caracter suelto... ");
				sintaxis = true;//Vuelve a repetir el do-while si entra en la excepci�n
				//input.nextLine();//Limpia el buffer
		    }
		    
		    //System.out.print(convertirPalabra(frase)); Con esto convertir�amos toda la frase como una �nica palabra
		} while (!cadenavacia || sintaxis);//Hacer mientras cadenavacia sea falso o mientras sintaxis sea verdadero
  
    }
    
    public static  void sonEspacios(String frase){//Este m�todo nos permite saber si hemos introducido una cadena de espacios vac�os
	    for(int i =0; i<frase.length(); i++)//Recorre la longitud de la frase
	    if(frase.charAt(i) != ' '){//Si encuentra alg�n caracter que no sea un espacio en blanco pone "cadenavacia" en FALSE. De lo contrario en TRUE
	    	cadenavacia = false;
	    }else{
	    	cadenavacia = true;
	    }
    } 
    
    public static void intro() { //M�todo para mostrar la entrada de bienvenida del programa
	    System.out.println("\t\t~~~~~~~"+ "Bienvenido al traductor de Pig Latin!" + "~~~~~~~");
	    System.out.println("\t~~~~~~~"+ "Traduciremos la frase en el idioma que quieras a Pig Latin !!" + "~~~~~~~");
	    System.out.println();
     
    }
     
    public static String convertirPalabra(String palabra) {//M�todo para traducir seg�n las reglas que nos piden
    	
	    int longitud = palabra.length();//Variable con la longitud de la palabra para escribir menos despu�s
	    
	    if(palabra.charAt(0) < 65 || palabra.charAt(0) > 122){	//Si una palabra no comienza con una letra lo dejo igual
	    	return palabra + " ";//Devuelve la palabra tal cual sin a�adirle nada
	    	
    	}else if (esVocal(palabra.charAt(0)) ||palabra.charAt(0) == 121 || palabra.charAt(0) == 89) {//Si es vocal o "y" o "Y"
	    	return (palabra + "yay"+" "); //Devuelve la palabra tal cual, a�adi�ndole "yay"
	    	
	    }else if (palabra.charAt(longitud - 1) == '.' || palabra.charAt(longitud - 1) == '!' || palabra.charAt(longitud - 1) == '?'|| palabra.charAt(longitud - 1) == ',') {
	    	//Si la palabara acaba en ".", "!" , "?" o ","
		    char ch = palabra.charAt(0); 
		    String resto = palabra.substring(1, longitud - 1);//la cadena RESTO es igual a la palabra quit�ndole el primer caracter(letra) y el �ltimo (!?.)
		    
		    if (palabra.charAt(0) >= 65 && palabra.charAt(0) <= 90) {//Si es una letra may�scula
		    	String resto2 = resto.substring(1);//Nueva cadena quitando a RESTO el primer caracter
		    	char letra = resto.charAt(0);//Cogemos la primer caracter de RESTO y lo guardamos en LETRA
		    	letra = Character.toUpperCase(letra);//Pasamos LETRA a may�scula
		    	ch = Character.toLowerCase(ch);//Pasamos la letra inicial original a min�scula
		    	return (letra + resto2 + ch + "ay"+ palabra.charAt(longitud - 1) +" ");
		    	//Devuelve en este orden: LETRA en may�scula, m�s RESTO2, m�s la primera letra de la palabra original, m�s "ay", m�s el �ltimo caracter de la palabra original
		    	 
			}else{
		    return (resto + ch + "ay"+ palabra.charAt(longitud - 1) +" ");//Devuelve, en este orden, RESTO m�s el PRIMER CARACTER, m�s "ay" m�s el s�mbolo del final (!?.,)
			}
		    
	    }else if ((!esVocal(palabra.charAt(0)) && !esVocal(palabra.charAt(1)))) {//Si no son vocales ni el primer ni el segundo caracter
	    	char ch = palabra.charAt(0);
	    	char ch2 = palabra.charAt(1);
	        String resto = palabra.substring(2); //Quita los dos primeros caracteres y guarda el resto en la cadena RESTO
	        
	        if (palabra.charAt(0) >= 65 && palabra.charAt(0) <= 90) {
		    	String resto2 = resto.substring(1);
		    	char letra = resto.charAt(0);
		    	letra = Character.toUpperCase(letra);
		    	ch = Character.toLowerCase(ch);
		    	 return (letra + resto2 + ch + ch2 + "ay" +" ");
		    	 
			}else{
	        return (resto + ch + ch2 + "ay"+" ");//Devuelve la cadena RESTO, m�s los dos caracteres que ha quitado, m�s "ay"
			}
	        
	    }else {//En el resto de casos 
		    char ch = palabra.charAt(0);
		    String resto = palabra.substring(1); //la cadena RESTO es la palabra quit�ndole el primer caracter
		    
		    if (palabra.charAt(0) >= 65 && palabra.charAt(0) <= 90) {
		    	String resto2 = resto.substring(1);
		    	char letra = resto.charAt(0);
		    	letra = Character.toUpperCase(letra);
		    	ch = Character.toLowerCase(ch);
		    	 return (letra + resto2 + ch + "ay" +" ");
		    	 
			}else{
		    return (resto + ch + "ay"+" ");   //Devuelve en este orden: RESTO, m�s el primer caracter, m�s "ay"
			}
	    }
	     
    }

    public static boolean esVocal(char c) {//M�todo booleano para saber si hay una vocal
	    if (c == 'a' || c == 'A') {
	    	return (true);
	     
	    } else if (c == 'e' || c == 'E') {
	    	return (true);
	     
	    } else if (c == 'i' || c == 'I') {
	    	return (true);
	    	
	    } else if (c == 'o' || c == 'O') {
	    	return (true);
	     
	    } else if (c == 'u' || c == 'U') {
	    	return (true);
	     
	    } else {
	    	return (false);
	     
	    }
     
    }
     
   }
