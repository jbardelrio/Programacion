package Metodos;
//Modificar el 6_18 para que reciba un segundo parámetro de tipo char, llamado caracterRelleno. Para formar el cuadrado,
//utilice un char que se proporciona como argumento.
import java.util.Scanner;

public class Deitel6_19 {

	public static void main(String[] args) {
		char caracter ='*';
		
		String nombre="Jesus";
		
		caracter = nombre.charAt(0);
		System.out.println("Resultado: " + caracter);
		
		Scanner teclado = new Scanner(System.in);
		
		teclado.next().charAt(0);
		System.out.println(teclado.next().charAt(0));

	}
	
}
