package Metodos;
import java.util.Scanner;
public class Deitel6_24 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		 int numero;

		 do{       
		 System.out.println("\nIntroduce un número entero mayor que cero: ");
		 numero = entrada.nextInt();
		 } while ( 0 > numero ); 
		 entrada.close();
		 
		 Perfecto(numero);
		
	}
	public static void Perfecto( int numero ){           
		 int sumadivisores = 0; 
		 
		 for ( int j = 1; j <= numero; j++ ){       
			 sumadivisores = 0;
	 
			 for ( int i = 1; i <= j/2 ; i++ ) 
			 
			 if( 0 == j % i )
				 sumadivisores += i; 
		 
			 if ( sumadivisores == j ){      
			 Imprime(j);
			 
			 }  
		 
		 }      
	 }           
	   
	 public static void Imprime( int perfecto ){            
		 
	 System.out.print("El " + perfecto + " es perfecto porque es la suma de sus divisores: ");
	  
	 for ( int divisores = 1; divisores <= perfecto/2; divisores++ ){   
		if (perfecto%divisores == 0)
		System.out.printf("\t%3d", divisores);
	 }
	 System.out.println("\n");
	 }              
	 
}     


