package BuclesAnidados;
import java.util.Scanner;
public class Ejercicio1 {
//Escribe un programa que pida un n�mero con el fin de calcular el factorial
//de dicho n�mero. Hay que validar que el n�mero insertado sea positivo 
//(incluido el 0). Si no es as�, se volver� a pedir dicho n�mero. 
//Posteriormente, el programa le preguntar� al usuario si quiere insertar
//otro n�mero, con un mensaje como este:"�Quiere insetar otro n�mero [s/n]?".
//Debes validar tambi�n esta respuesta.
	public static void main(String[] args) {
		int numero;
		int multiplicacion = 1;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el n�mero: ");
		numero = teclado.nextInt();
		do {
			System.out.println("El n�mero intruducido es negativo, introduce otro nuevo: ");
		} while (numero < 0);
		for (int i = 1; i < numero + 1; i++) {
			multiplicacion *= i;
		}
		System.out.println("El factorial de " + numero + " es: " + multiplicacion);
	}

}
