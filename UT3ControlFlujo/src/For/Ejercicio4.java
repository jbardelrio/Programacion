package For;
import java.util.Scanner;
public class Ejercicio4 {
//Escribe un programa que pida tantos n�meros como el usuario del programa
//indique al principio. El programa mostrar� al final la media
//y si se ha insertado un n�mero par.
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numeroveces;
		int numero;
		int suma = 0;
		double media;
		String cadena ="";
		
		System.out.println("Indica cuantos n�meros vas a introducir: ");
		numeroveces = teclado.nextInt();
		
		for (int i = 1; i <= numeroveces; i++) {
			System.out.println("Introduce un n�mero: ");
			numero = teclado.nextInt();
			suma +=numero;
			if (numero %2 == 0) {
				cadena = cadena + numero + " ";
			}
		}
		teclado.close();
		System.out.println("La media de los " + numeroveces + " n�meros es: " + (media = suma / numeroveces));
		System.out.print("Son n�meros pares: " + cadena);
	}

}
