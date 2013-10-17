import java.util.Scanner;
public class Ejercicio2 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner( System.in );
		
		double numero1, numero2, suma, producto, media; 
		
		System.out.print( "Introduzca el primer número: " ); 
		numero1 = input.nextInt(); 
		System.out.print( "Introduzca el segundo número: " ); 
		numero2 = input.nextInt(); 
		input.close();
		
		suma = (numero1 + numero2);
		System.out.println("\nLa suma de " + numero1 + " y " + numero2 + " es: ");
		System.out.println(suma);
		
		producto = (numero1 * numero2);
		System.out.println("\nEl producto de " + numero1 + " y " + numero2 + " es: ");
		System.out.println(producto);
		
		media = (numero1 + numero2) / 2;
		System.out.println("\nLa media de " + numero1 + " y " + numero2 + " es: ");
		System.out.println(media);
	}
}
