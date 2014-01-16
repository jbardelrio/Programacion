package Objetos3;

import java.util.Scanner;

public class Alumnos2 {
	
	public void mensaje(){
	Scanner teclado=new Scanner(System.in);
	
    String nombre1, nombre2, nombre3;
    int edad1, edad2, edad3;
    double media;
   
   
    System.out.print("Nombre del primer alumno:");
    nombre1=teclado.nextLine();
    System.out.print("Nombre del segundo alumno:");
    nombre2=teclado.nextLine();
    System.out.print("Nombre del tercer alumno:");
    nombre3=teclado.nextLine();
    
    System.out.print("Edad del primer alumno:");
    edad1=teclado.nextInt(); 
    System.out.print("Edad del segundo alumno:");
    edad2=teclado.nextInt();
    System.out.print("Edad del tercer alumno:");
    edad3=teclado.nextInt();
    
    teclado.close();
    
    media = (edad1 + edad2 + edad3) / 3;
    
    System.out.print("\nEl primer alumno se llama " + nombre1 + " y su edad es " + edad1 + " años.");
    System.out.print("\nEl segundo alumno se llama " + nombre2 + " y su edad es " + edad2 + " años.");
    System.out.print("\nEl tercer alumno se llama " + nombre3 + " y su edad es " + edad3 + " años.");
    System.out.print("\nLa edad media de los tres alumnos es de " + media +" años.");
   
	}
}