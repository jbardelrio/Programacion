package repaso;

import java.util.InputMismatchException;
import java.util.Scanner;

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
		precio = teclado.nextDouble();//DOUBLE ES NÚMERO REAL !!!!!!!!!!!!!!!!!!!
		System.out.println("Dame la cantidad: ");
		cantidad = teclado.nextInt();
		}catch(InputMismatchException e){
			System.out.println("Debes introducir precios y cantidades numéricos");
			System.exit(0);//CON ESTO SALDRÍA DE LA APLICACIÓN
		}
		try{
		System.out.println("El precio final es: " + precioFinal(precio, cantidad));
		}catch(IllegalArgumentException e){
			System.out.println("Se ha utilizado un precio o cantidad negativo no válido.");
		}
	}

}
