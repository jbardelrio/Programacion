package ejerciciosInicialesHerencia5_6;

/*
 * Debes crear una clase auxiliar Men� que permita hacer las funciones del men� t�pico de texto: 
 * mostrar las opciones, esperar una respuesta y devolverla. 
 * La clase Men� se utilizar� en el main para realizar una peque�a aplicaci�n que permita crear y borrar animales.
 */

import java.util.Scanner;

public class Menu {

	private String[] opciones;
	private int num_opciones;
	private String titulo;

	private final static int MAX_OPCIONES = 20;

	public Menu() {
		opciones = new String[MAX_OPCIONES];
		titulo = "Men�";
	}

	public Menu(String[] opciones, int num_opciones) {
		this.opciones = new String[MAX_OPCIONES];
		for (int i = 0; i < num_opciones; i++)
			this.opciones[i] = opciones[i];
		titulo = "Men�";
		this.num_opciones = num_opciones;
	}

	public void a�adirOpcion(String nuevaOpcion) {
		if (num_opciones < MAX_OPCIONES) {
			this.opciones[num_opciones] = nuevaOpcion;
			num_opciones++;
		}
	}

	public void imprimir() {
		System.out.println(titulo);
		for (int i = 0; i < titulo.length(); i++)
			System.out.print("-");
		System.out.println();
		for (int i = 0; i < num_opciones; i++)
			System.out.println((i + 1) + ". " + opciones[i]);
	}

	public int imprimirYPreguntar() {
		Scanner scn = new Scanner(System.in);
		int opcion;

		imprimir();
		System.out.println(" Opci�n: ");
		opcion = scn.nextInt();

		return opcion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

}
