package EjerciciosRepaso;
import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String numero;
		
		System.out.println("Dime el número para saber si es palíndromo : ");
		numero = teclado.nextLine();
		
	    StringBuffer sb = new StringBuffer(numero);
	    sb = sb.reverse();
	    
	    if (numero.equals(sb.toString()))	
	        System.out.println(numero + " es un PALINDROMO");
	    else
	        System.out.println(numero + " NO es un palindromo");
		

	}

}
