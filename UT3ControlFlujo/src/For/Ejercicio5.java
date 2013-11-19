package For;
import java.util.Scanner;
public class Ejercicio5 {
//Escribe un programa que pida dos n�meros con el fin de visualizar 
//la suma de todos los n�meros que hay entre ambos n�meros 
//(incluidos dichos n�meros). Si el primer n�mero que inserte el usuario
//es mayor que el segundo, se volver�n a pedir otros dos n�meros hasta que 
//el primer n�mero insertado sea menor o igual que el segundo.
	public static void main(String[] args) {
		int n1, n2;
		int suma = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce los 2 n�meros separados por un espacio: ");
		n1 = teclado.nextInt();
		n2 = teclado.nextInt();
		if (n1 > n2) {
			System.out.println("Introduce primero el menor y luego el mayor: ");
			n1 = teclado.nextInt();
			n2 = teclado.nextInt();
		}
		
		for (int i = n1; i <= n2; i++) {
			suma += i;
		}
		teclado.close();
		System.out.println("La suma de los n�meros es: " + suma);
	}

}
