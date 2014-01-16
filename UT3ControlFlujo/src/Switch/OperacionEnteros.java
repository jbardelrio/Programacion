package Switch;
import java.util.Scanner;
public class OperacionEnteros {
//Escribe un programa que pida dos números enteros. El usuario después indicará una operación: *, +, -, /
// El programa visulizará el resultado de esa operación, o error si no se corresponde con ninguna.
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int n1, n2;
		String respuesta;
		
		/*System.out.println("Introduce el primer número: ");
		n1 = teclado.nextInt();
		System.out.println("Introduce el segundo número: ");
		n2 = teclado.nextInt();
		System.out.println("¿Qué quieres hacer, sumar, restar, multiplicar o dividir?: ");
		respuesta = teclado.next();
		*/
		
		System.out.println("Indica la operación a realizar, primero un número, después la operación y luego el otro número: ");
		teclado.close();
		
		n1 = teclado.nextInt();
		respuesta = teclado.next();
		n2 = teclado.nextInt();
		
		if (respuesta.equals("+")) {
			System.out.println("El resultado de la suma es: " + (n1+n2));
		}else if (respuesta.equals("-")){
			System.out.println("El resultado de la resta es: " + (n1-n2));
		}else if (respuesta.equals("*")){
			System.out.println("El resultado de la multiplicación es: " + (n1*n2));
		}else if (respuesta.equals("/")){
			System.out.println("El resultado de la división es: " + (n1 / n2));
		}else{
			System.out.println("Error, no has indicado una operación disponible.");
		}


	}

}
