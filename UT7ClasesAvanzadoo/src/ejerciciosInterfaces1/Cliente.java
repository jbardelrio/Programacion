package ejerciciosInterfaces1;

import java.util.Scanner;

public class Cliente implements Persona {
	//Atributos
	private String nombre;
	private String direccion;
	
	@Override
	public void pedirDatos() {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Dame el nombre:");
		this.nombre=entrada.nextLine();
		System.out.println("Dame la direcci�n:");
		this.direccion=entrada.nextLine();
		
	}
	
	@Override
	public void visualizarDatos() {
		System.out.println("Cliente de " + dato);
		System.out.println("Nombre: "+this.nombre+" "+"Direcci�n: "+this.direccion);
	}
}
