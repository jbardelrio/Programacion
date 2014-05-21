package ejerciciosInterfaces1;

import java.util.Scanner;

public class Empleado implements Persona{

	private String nombre;
	private String puesto;
	private int codempleado;
		
	public Empleado(String nombre, String puesto, int codempleado) {
		this.nombre = nombre;
		this.puesto = puesto;
		this.codempleado = codempleado;
	}

	public void pedirDatos() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca el nombre del empleado: ");
		String nombre = teclado.next();
		System.out.println("Introduzca el puesto del empleado: ");
		String puesto = teclado.next();
		System.out.println("Introduzca el código del cliente: ");
		int codcliente = teclado.nextInt();
	}
	
	public void visualizarDatos() {

		System.out.println( "Empleado [nombre=" + nombre + ", puesto=" + puesto
				+ ", empresa=" + empresa + ", codempleado=" + codempleado + "]");

	}

	public static void main(String[] args) {
		Empleado E1 = new Empleado ("Alfonso", "Telefonista", 001);
		E1.visualizarDatos();
		
	}
	
}
