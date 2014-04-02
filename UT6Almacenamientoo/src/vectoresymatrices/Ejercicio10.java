package vectoresymatrices;

import java.util.Scanner;

import vectoresymatrices.Menu;
import vectoresymatrices.Pantalla;

/*
 * Ejercicio 10. Desarrolla una peque�a aplicaci�n que use un array bidimensional como pantalla, 
 * cada casilla es un pixel que por defecto se caracteriza por el car�cter *.

* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *
El programa tendr� un men�:

Elegir car�cter.
Cuadrado.
Rect�ngulo.
Tri�ngulo.
C�rculo.
Mostrar pantalla.
El funcionamiento es el siguiente:

Pedimos al usuario que inserte el caracter a usar (por defecto ser� '@').
Dibuja un cuadrado pidiendo coordenadas esquina izquierda.
Dibuja un rect�ngulo pidiendo coordenadas esquina izquierda.
Dibuja un tri�ngulo pidiendo coordenadas v�rtice superior.
Dibuja un rect�ngulo pidiendo coordenadas centro.
Imprime pantalla.
Para las opciones 2,3,4,5 se pedir� tambi�n el tama�o del elemento.

As� por ejemplo, si se dice que use el '+', posic�n 1,1 y tama�o 3.

* * * * * * * * * *
* + + + * * * * * *
* + * + * * * * * *
* + + + * * * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *
 */
public class Ejercicio10 {

	

	private static char leerCaracter(String mensaje) {
		System.out.print(mensaje+": ");
		Scanner teclado=new Scanner(System.in);
		
		while(true){
			try {
				return teclado.nextLine().charAt(0);
			} catch (Exception e)
			{
				System.out.print("No se ha podido leer " + mensaje);
			}
		}
	}
	
	private static int leerEntero(String mensaje) {
		System.out.print(mensaje+": ");
		Scanner teclado=new Scanner(System.in);
		
		while(true){
			try {
				return teclado.nextInt();
			} catch (Exception e)
			{
				System.out.print("No se ha podido leer " + mensaje);
			}
		}
	}
	
	public static void main(String[] args) {
		Menu menuPrincipal;
		String[] opciones={"Elegir car�cter",
					"Cuadrado",
					"Rect�ngulo",
					"Tri�ngulo",
					"C�rculo",
					"Mostrar pantalla",
					"Salir"};
		Pantalla miPantalla= new Pantalla();
		
		menuPrincipal=new Menu(opciones,7);
		
		int respuesta;
		do {
			respuesta=menuPrincipal.imprimirYPreguntar();
			switch(respuesta){
			case 1:
				miPantalla.setCaracter(leerCaracter("Caracter"));
				break;
			case 2:
				miPantalla.cuadrado(
						leerEntero("posici�n x"),
						leerEntero("posici�n y"), 
						leerEntero("tama�o"));
				break;
			case 3:
				miPantalla.rectangulo(
						leerEntero("posici�n x"),
						leerEntero("posici�n y"), 
						leerEntero("ancho"),
						leerEntero("alto"));
				break;
			case 4:
				miPantalla.triangulo(
						leerEntero("posici�n x"),
						leerEntero("posici�n y"),
						leerEntero("alto"));
				break;
			case 5:
				miPantalla.circulo(
						leerEntero("posici�n x"),
						leerEntero("posici�n y"),
						leerEntero("radio"));
				break;
			case 6:
				miPantalla.mostrar();
				break;
			}
			
		} while (respuesta!=7);

	}


}
