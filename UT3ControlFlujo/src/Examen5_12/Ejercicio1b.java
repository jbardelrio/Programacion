package Examen5_12;
import java.util.Scanner;
public class Ejercicio1b {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int numero;
		int x=0;
		char espacio=' ', arroba='@';
	    
	    System.out.print("Dame el tamaño de la figura:");
	    numero=entrada.nextInt();      
	    
	    for(int i=1;i<=numero;i++)
	    {
	    	 for(int espacios=x-i; espacios>0; espacios++)
	                System.out.print(espacio);
	    	for(int j=numero;j>=i;j--)
	    	{
	    		System.out.print("@");
	    	}
	    	System.out.println();
	    }

	}

}

