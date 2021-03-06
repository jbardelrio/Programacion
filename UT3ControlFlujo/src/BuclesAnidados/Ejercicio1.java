package BuclesAnidados;
import java.util.Scanner;
public class Ejercicio1 {
//Escribe un programa que pida un n�mero con el fin de calcular el factorial
//de dicho n�mero. Hay que validar que el n�mero insertado sea positivo 
//(incluido el 0). Si no es as�, se volver� a pedir dicho n�mero. 
//Posteriormente, el programa le preguntar� al usuario si quiere insertar
//otro n�mero, con un mensaje como este:"�Quiere insertar otro n�mero [s/n]?".
//Debes validar tambi�n esta respuesta.
	
	public static void main(String[] args) {
		
		String respuesta = "s";
		Scanner teclado = new Scanner(System.in);
		
		do {
			int multiplicacion = 1;
			int numero = 0;
				do {
					System.out.println("Introduce un n�mero positivo: ");
					numero = teclado.nextInt();
				} while (numero < 0);
				
				for (int i = 1; i < numero + 1; i++) {
					multiplicacion *= i;
				}
				
			System.out.println("El factorial de " + numero + " es: " + multiplicacion);
			System.out.println("�Quiere insertar otro n�mero [s/n]?");
			respuesta = teclado.next();
			
		} while (respuesta.equals("s") || respuesta.equals("S"));

		System.out.println("Fin del programa.");
		teclado.close();
	}

}
