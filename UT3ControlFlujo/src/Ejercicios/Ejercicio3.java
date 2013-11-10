package Ejercicios;
import java.util.Scanner;
public class Ejercicio3 {
//Una tienda hace un descuento del 10% por compras menores de 20€, un 20% por compras entre 20 y 50€ y
//un 25% si la compra es mayor. Escribe un programa que pida el precio de un producto y muestre
//su precio final en las rebajas.
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double precio_inicial;
		double precio_final;
		
		System.out.println("Dime el precio inicial del producto: ");
		precio_inicial = teclado.nextDouble();
		teclado.close();

		if (precio_inicial < 20) {
			precio_final = precio_inicial - (precio_inicial * 10) / 100;
			System.out.println("El precio con descuento es: " +precio_final);
		}else if (precio_inicial >= 20 && precio_inicial <= 50) {
			precio_final = precio_inicial - (precio_inicial * 20) / 100;
			System.out.println("El precio con descuento es: " +precio_final);
		}else{
			precio_final = precio_inicial - (precio_inicial * 25) / 100;
			System.out.println("El precio con descuento es: " + precio_final);
		}
	}

}




