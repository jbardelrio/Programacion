package Objetos2;

import java.util.Scanner;

public class Alumnos {
	
	public static void main(String[] args) {
	Scanner teclado=new Scanner(System.in);
	
    String nombre1, nombre2, nombre3;
    int edad;
    
    System.out.print("Nombre del primer alumno:");
    nombre1=teclado.nextLine();
    System.out.print("Nombre del segundo alumno:");
    nombre2=teclado.nextLine();
    System.out.print("nombre del tercer alumno:");
    nombre3=teclado.nextLine();
    System.out.print("Nombre del primer alumno:");
    edad=teclado.nextInt();
    System.out.print("El primer alumno se llama " + nombre1 + "y su edad es " + edad);
    teclado.close();
    System.out.print("El segundo alumno se llama " + nombre2 + "y su edad es " + edad);
    teclado.close();
    System.out.print("El tercer alumno se llama " + nombre3 + "y su edad es " + edad);
    teclado.close();
	}
}