package Switch;
import java.util.Scanner;
public class OperacionEnterosSwitch {
//Escribe un programa que pida dos n�meros enteros. El usuario despu�s indicar� una operaci�n: *, +, -, /
// El programa visulizar� el resultado de esa operaci�n, o error si no se corresponde con ninguna.
	public static void main(String[] args) {
		
		
		int n1,n2;
		String respuesta;

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame una operaci�n en la forma: [numero operador numero]");
		System.out.println("Operadores: \n+-Sumar \n--Restar \n*-Multiplicar \n/-Dividir\n");
		
		n1= teclado.nextInt();
		respuesta = teclado.next();
		n2 = teclado.nextInt();
		
		switch (respuesta) {
		case "+":
			System.out.println("El resultado de la suma es: " + (n1+n2));
			break;
		case "-":
			System.out.println("El resultado de la resta es: " + (n1-n2));
			break;
		case "*":
			System.out.println("El resultado de la multiplicaci�n es: " + (n1*n2));
			break;
		case "/":
			System.out.println("El resultado de la divisi�n es: " + (n1 / n2));
			break;

		default:
			System.out.println("Error, no has indicado una operaci�n disponible.");
			
		}


	}

}