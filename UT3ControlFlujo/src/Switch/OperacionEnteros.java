package Switch;
import java.util.Scanner;
public class OperacionEnteros {
//Escribe un programa que pida dos n�meros enteros. El usuario despu�s indicar� una operaci�n: *, +, -, /
// El programa visulizar� el resultado de esa operaci�n, o error si no se corresponde con ninguna.
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int n1, n2;
		String respuesta;
		
		/*System.out.println("Introduce el primer n�mero: ");
		n1 = teclado.nextInt();
		System.out.println("Introduce el segundo n�mero: ");
		n2 = teclado.nextInt();
		System.out.println("�Qu� quieres hacer, sumar, restar, multiplicar o dividir?: ");
		respuesta = teclado.next();
		*/
		
		System.out.println("Indica la operaci�n a realizar, primero un n�mero, despu�s la operaci�n y luego el otro n�mero: ");
		teclado.close();
		
		n1 = teclado.nextInt();
		respuesta = teclado.next();
		n2 = teclado.nextInt();
		
		if (respuesta.equals("+")) {
			System.out.println("El resultado de la suma es: " + (n1+n2));
		}else if (respuesta.equals("-")){
			System.out.println("El resultado de la resta es: " + (n1-n2));
		}else if (respuesta.equals("*")){
			System.out.println("El resultado de la multiplicaci�n es: " + (n1*n2));
		}else if (respuesta.equals("/")){
			System.out.println("El resultado de la divisi�n es: " + (n1 / n2));
		}else{
			System.out.println("Error, no has indicado una operaci�n disponible.");
		}


	}

}
