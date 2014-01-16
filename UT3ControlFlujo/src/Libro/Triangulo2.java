package Libro;
import java.util.Scanner;
public class Triangulo2 {

	public static void main(String[] args) {

        Scanner obj =new Scanner(System.in);
        char espacio=' ', asterisco='*';
        int x=0;
        System.out.println("Numero de filas que tendra: ");
        x=obj.nextInt();
        for(int i=1; i<=x; i++){
            for(int espacios=x-i; espacios>0; espacios--)
                System.out.print(espacio);
            for(int lineas=1; lineas<2*i; lineas++)
                System.out.print(asterisco);
            System.out.println("");
        }
	}

}