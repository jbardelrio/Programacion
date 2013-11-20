package For;
import java.util.Scanner;
public class Ejercicio5 {
//Escribe un programa que pida dos números con el fin de visualizar 
//la suma de todos los números que hay entre ambos números 
//(incluidos dichos números). Si el primer número que inserte el usuario
//es mayor que el segundo, se volverán a pedir otros dos números hasta que 
//el primer número insertado sea menor o igual que el segundo.
	public static void main(String[] args) {
		int n1= 2, n2 = 1;
		int suma = 0;
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.println("Introduce los 2 números separados por un espacio: ");
			n1 = teclado.nextInt();
			n2 = teclado.nextInt();
		} while (n1 > n2);
		
		for (int i = n1; i <= n2; i++) {
			suma += i;
		}
		teclado.close();
		System.out.println("La suma de los números es: " + suma);
	}

}
