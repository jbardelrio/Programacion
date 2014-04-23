package arrays2d;

import java.util.Scanner;

/**
 * Ejercicio 10. Desarrolla una pequeña aplicación que use un array bidimensional como pantalla, cada casilla es un pixel que por defecto se caracteriza por el carácter *.

* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *

El programa tendrá un menú:

    Elegir carácter.
    Cuadrado.
    Rectángulo.
    Triángulo.
    Círculo.
    Mostrar pantalla.

El funcionamiento es el siguiente:

    Pedimos al usuario que inserte el caracter a usar (por defecto será '@').
    Dibuja un cuadrado pidiendo coordenadas esquina izquierda.
    Dibuja un rectángulo pidiendo coordenadas esquina izquierda.
    Dibuja un triángulo pidiendo coordenadas vértice superior.
    Dibuja un rectángulo pidiendo coordenadas centro.
    Imprime pantalla.

Para las opciones 2,3,4,5 se pedirá también el tamaño del elemento.

Así por ejemplo, si se dice que use el '+', posicón 1,1 y tamaño 3.

* * * * * * * * * *
* + + + * * * * * *
* + * + * * * * * *
* + + + * * * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *

 * 
 * 
 * @author root
 *
 */


public class Diez {

	
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
