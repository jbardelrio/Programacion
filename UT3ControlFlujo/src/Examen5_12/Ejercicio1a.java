package Examen5_12;
import java.util.Scanner;
public class Ejercicio1a {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int numero;
	    
	    System.out.print("Dame el tamaño de la figura:");
	    numero=entrada.nextInt();      
	    
	    for(int i=1;i<=numero;i++)
	    {
	    	for(int j=numero;j>=i;j--)
	    	{
	    		System.out.print("@");
	    	}
	    	
	    	System.out.println();
	    }

	}

}

