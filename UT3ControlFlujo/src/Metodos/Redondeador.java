package Metodos;

import java.util.Scanner;

//Crear una aplicación para redondear números
// 2. Partiendo del anterior
//	a. Al comienzo se pedirá el número de decimales a los que se quiere redondear
//	b. El método redondea tendrá un segundo parámetro, para decirle los decimales que queremos
//Ejemplo de lo que se pide: cuantos decimales: 2
						//	 Dame nº: 3,333
						//	 redondeo: 3,33
public class Redondeador {
	
	public static int redondea(double a_redondear) { //Dentro del () es el tipo de variable que introducimos, el nombre es el que queramos
		return (int) Math.floor( a_redondear + 0.5 ); //Se le fuerza a int porque la funcion devuelve un número real
		
	}
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double numero;
		do{
		
		System.out.println("Introduce el número a redondear");
			numero = teclado.nextDouble();
		
		System.out.println(numero + " redondeado es: " + redondea(numero));
		
		} while (numero !=0.0);
	}
	
}
