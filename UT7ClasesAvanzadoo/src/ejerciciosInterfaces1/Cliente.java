package ejerciciosInterfaces1;

import java.util.Scanner;

public class Cliente implements Persona {

	private String nombre;
	private int codcliente;
	
	public Cliente(String nombre, int codcliente) {
		this.nombre = nombre;
		this.codcliente = codcliente;
	}


	public void pedirDatos() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca el nombre del cliente: ");
		String nombre = teclado.next();
		System.out.println("Introduzca el código del cliente: ");
		int codcliente = teclado.nextInt();
	}


	public void visualizarDatos() {
	
		System.out.println("Cliente [nombre=" + nombre + ", codcliente=" + codcliente + " " + empresa + "]");
	}

	public static void main(String[] args) {
	
	Cliente C1 = new Cliente ("Coca-Cola", 002);
	C1.visualizarDatos();
	
	}
	
}
