package For;
import java.util.Scanner;
public class Media3numeros {
//Pedir 3 números y hacer la media
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int suma = 0;
		double media;
		for (int i = 1; i <= 3; i++) {
			System.out.println("Dime un numero");
			int numero;
			numero = teclado.nextInt();
			suma += numero;
		}
		teclado.close();
		media = suma / 3;
		System.out.println("La media es: " + media);
	}

}
