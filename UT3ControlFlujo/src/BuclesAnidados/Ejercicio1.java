package BuclesAnidados;
import java.util.Scanner;
public class Ejercicio1 {
//Escribe un programa que pida un número con el fin de calcular el factorial
//de dicho número. Hay que validar que el número insertado sea positivo 
//(incluido el 0). Si no es así, se volverá a pedir dicho número. 
//Posteriormente, el programa le preguntará al usuario si quiere insertar
//otro número, con un mensaje como este:"¿Quiere insertar otro número [s/n]?".
//Debes validar también esta respuesta.
	
	public static void main(String[] args) {
		int numero;
		String respuesta = "s";
		Scanner teclado = new Scanner(System.in);
		
		do {
			int multiplicacion = 1;
			System.out.println("Introduce el número: ");
			numero = teclado.nextInt();
			
				if (numero < 0) {
					System.out.println("El número intruducido es negativo, introduce otro nuevo: ");
					numero = teclado.nextInt();
				}
				
				for (int i = 1; i < numero + 1; i++) {
					multiplicacion *= i;
				}
				
			System.out.println("El factorial de " + numero + " es: " + multiplicacion);
			System.out.println("¿Quiere insertar otro número [s/n]?");
			respuesta = teclado.next();
			
		} while (respuesta.equals("s") || respuesta.equals("S"));

		System.out.println("Fin del programa.");
		teclado.close();
	}

}
