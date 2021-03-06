package repaso;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Escribir un m�todo llamado precioFinal que, dado un precio y una cantidad, devuelva el precio final 
 * resultado de aplicar el descuento del 2% si la cantidad es mayor que 6 y 4% si es mayor que 12. 
 * Si al m�todo se le pasan como par�metros n�meros no v�lidos, devolver� la excepci�n IllegalArgumentException.
 * Escribir tambi�n el c�digo que pruebe que funciona correctamente y tambi�n que devuelve la excepci�n
 * si los valores pasados no son correctos.
 */

public class Dos {

	public static double precioFinal(double precio, int cantidad){
		double precioTotal = 0, dto=1;
		
		if(cantidad <=0 || precio<=0)
			throw new IllegalArgumentException();
		
		if(cantidad>12) dto=0.96;
		else if(cantidad>6) dto=0.98;
		
		
		precioTotal=precio*dto*cantidad;
		return precioTotal;
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double precio=0;
		int cantidad=0;
		
		try{
		System.out.println("Dame el precio: ");
		precio = teclado.nextDouble();//DOUBLE ES N�MERO REAL !!!!!!!!!!!!!!!!!!!
		System.out.println("Dame la cantidad: ");
		cantidad = teclado.nextInt();
		}catch(InputMismatchException e){
			System.out.println("Debes introducir precios y cantidades num�ricos");
			System.exit(0);//CON ESTO SALDR�A DE LA APLICACI�N
		}
		try{
		System.out.println("El precio final es: " + precioFinal(precio, cantidad));
		}catch(IllegalArgumentException e){
			System.out.println("Se ha utilizado un precio o cantidad negativo no v�lido.");
		}
	}

}
