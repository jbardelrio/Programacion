package WhileyDoWhile;
import java.util.Scanner;
public class Ejercicio6 {
//Modifica el ejercicio 3 de condicionales switch (operadores '+', '-', '*', '/') 
//de forma que permita hacer una operaci�n, volver� a pedir al usuario el operador,
//para, con los mismos n�meros, volver a hacer otra operaci�n. 
//El programa terminar� cuando se inserte un caracter que no es un operador.
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int n1,n2;
		String respuesta;
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
		}
		
		do {
			System.out.println("Dime un nuevo operador: ");
			respuesta = teclado.next();
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
			}
		} while (respuesta.equals("+") || respuesta.equals("-") || respuesta.equals("*") || respuesta.equals("/"));
	}		
}

		


	


