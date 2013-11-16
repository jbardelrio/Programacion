package For;
import java.util.Scanner;
public class Ejercicio4 {
//Escribe un programa que pida tantos números como el usuario del programa
//indique al principio. El programa mostrará al final la media
//y si se ha insertado un número par.
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numeroveces;
		int suma = 0;
		double media;
		String cadena ="";
		
		System.out.println("Indica cuantos números vas a introducir: ");
		numeroveces = teclado.nextInt();
		
		for (int i = 0; i <= numeroveces; i++) {
			System.out.println("Introduce un número: ");
			i = teclado.nextInt();
			suma +=i;
			if (i %2 == 0) {
				cadena = cadena + i + " ";
			}
		}
		teclado.close();
		System.out.println("La media de los " + numeroveces + " números es: " + (media = suma / numeroveces));
		System.out.print("Son números pares: " + cadena);
	}

}
