package Metodos;

import java.util.Scanner;

//Defina un método llamado hipotenusa que calcule la hipotenusa de un triçangulo rectángulo, 
//cuando se dan la longitud de los otros dos lados. El método debe tomar dos argumentos de tipo double y devolver
//la hipotenusa como un valor double.
public class Deitel6_15 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double lado1 = 0;
		double lado2 = 0;
		System.out.println("Dime un lado: ");
		lado1= teclado.nextDouble();
		System.out.println("Dime el otro lado: ");
		lado2= teclado.nextDouble();
		
		calcularhipo(lado1, lado2);

	}
	
	public static double calcularhipo (double lado1, double lado2){
		double lado1cuadrado;
		lado1cuadrado = Math.pow(lado1, 2);
		double lado2cuadrado;
		lado2cuadrado = Math.pow(lado2, 2);
		double sumacuadrado;
		sumacuadrado = lado1cuadrado + lado2cuadrado;
		double raiz;
		raiz = Math.sqrt(sumacuadrado);
		System.out.println("La hipotenusa es: " + raiz);
		return 0;
		
	}

}
