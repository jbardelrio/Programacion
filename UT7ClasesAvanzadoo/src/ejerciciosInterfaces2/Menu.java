package ejerciciosInterfaces2;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	//Atributos
	private ArrayList<String> opciones;
	//private String[] opciones;
	//private int num_opciones;
	private String titulo;
	private final static int MAX_OPCIONES=20;
	//Constructores
	public Menu() {
		//num_opciones = 0;
		//opciones=new String[MAX_OPCIONES];
		this.opciones = new ArrayList<String>(MAX_OPCIONES);
	}
	public Menu(String[] opciones, int num_opciones) {
		//this.num_opciones=num_opciones;
		//this.opciones=new String[MAX_OPCIONES];
		this.opciones = new ArrayList<String>(MAX_OPCIONES);
		for(int i=0; i<opciones.length; ++i){
			this.opciones.add(opciones[i]);
		}
	}
	//Métodos
	public void añadirOpcion(String nuevaOpcion){
		this.opciones.add(nuevaOpcion);
	}
	private void imprimir(){
		System.out.println(titulo);
		for(int i=0; i<titulo.length(); ++i){
			System.out.print("-");
		}
		System.out.println();
		for(int i=0; i<this.opciones.size(); ++i){
			System.out.println((i+1)+". "+this.opciones.get(i));
		}
	}
	public int mostrar(){
		Scanner entrada = new Scanner(System.in);
		int opcion;
		imprimir();
		
		System.out.print("Opción: ");
		opcion = entrada.nextInt();
		
		return opcion;
	}
	//Accesadores - Getters & Setters
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
}