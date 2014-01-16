package Examen5_12;

import java.util.Scanner;
public class Ejercicio1c {

	public static void main(String[] args) {

        Scanner obj =new Scanner(System.in);
        char espacio=' ', arroba='@';
        int x=0;
        System.out.println("Dame el tamaño de la figura: ");
        x=obj.nextInt();
        for(int i=1; i<=x; i++){
            for(int espacios=x-i; espacios>0; espacios--)
                System.out.print(espacio);
            for(int lineas=1; lineas<2*i; lineas++)
                System.out.print(arroba);
            System.out.println("");
        }
	}

}