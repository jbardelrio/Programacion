package repaso;

import java.util.Scanner;

/*
 * Escribir un método llamado precioFinal que, dado un precio y una cantidad, devuelva el precio final 
 * resultado de aplicar el descuento del 2% si la cantidad es mayor que 6 y 4% si es mayor que 12. 
 * Si al método se le pasan como parámetros números no válidos, devolverá la excepción IllegalArgumentException.
 * Escribir también el código que pruebe que funciona correctamente y también que devuelve la excepción
 * si los valores pasados no son correctos.
 */

public class Ejercicio2 {
	double precio;
	int cantidad;

	public static double precioFinal(double precio, int cantidad){
		double descuento = 0;
		double preciofinal = 0;
		if(cantidad == 0 || precio == 0){
			
		}
		else if (cantidad > 6) {
			descuento = (precio * cantidad) * 2 /100;
			preciofinal = (precio * cantidad) - descuento;
		}else if(cantidad > 12){
			descuento = (precio * cantidad) * 4 /100;
			preciofinal = (precio * cantidad) - descuento;	
		}else{
			preciofinal = (precio * cantidad);
		}
	
		return preciofinal;
		
	}
	
	public Ejercicio2() {
		
	}

	public static void main(String[] args) {
		double precio = 0;
		int cantidad = 0;
		boolean leido = false;
		
		Scanner teclado=new Scanner(System.in);
	do {
		try{
		System.out.println("Dime precio y cantidad: ");
		precio=teclado.nextDouble();
		cantidad=teclado.nextInt();
		leido = true;
		}catch(IllegalArgumentException IA){
			System.out.println("Error de número o números.");
		}
	} while (!leido);	
		System.out.println("Precio final: " + precioFinal(precio, cantidad));

	}

}
