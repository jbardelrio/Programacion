package BuclesAnidados;
import java.util.Scanner;
public class Ejercicio1 {
//Escribe un programa que pida un número con el fin de calcular el factorial
//de dicho número. Hay que validar que el número insertado sea positivo 
//(incluido el 0). Si no es así, se volverá a pedir dicho número. 
//Posteriormente, el programa le preguntará al usuario si quiere insertar
//otro número, con un mensaje como este:"¿Quiere insetar otro número [s/n]?".
//Debes validar también esta respuesta.
	public static void main(String[] args) {
		int numero;
		int multiplicacion = 1;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el número: ");
		numero = teclado.nextInt();
		do {
			System.out.println("El número intruducido es negativo, introduce otro nuevo: ");
		} while (numero < 0);
		for (int i = 1; i < numero + 1; i++) {
			multiplicacion *= i;
		}
		System.out.println("El factorial de " + numero + " es: " + multiplicacion);
	}

}
