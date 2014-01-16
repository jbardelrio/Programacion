package Metodos;

import java.util.Scanner;

//Crear una aplicaci�n para redondear n�meros
// 2. Partiendo del anterior
//	a. Al comienzo se pedir� el n�mero de decimales a los que se quiere redondear
//	b. El m�todo redondea tendr� un segundo par�metro, para decirle los decimales que queremos
//Ejemplo de lo que se pide: cuantos decimales: 2
						//	 Dame n�: 3,333
						//	 redondeo: 3,33
public class Redondeador {
	
	public static int redondea(double a_redondear) { //Dentro del () es el tipo de variable que introducimos, el nombre es el que queramos
		return (int) Math.floor( a_redondear + 0.5 ); //Se le fuerza a int porque la funcion devuelve un n�mero real
		
	}
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double numero;
		do{
		
		System.out.println("Introduce el n�mero a redondear");
			numero = teclado.nextDouble();
		
		System.out.println(numero + " redondeado es: " + redondea(numero));
		
		} while (numero !=0.0);
	}
	
}
