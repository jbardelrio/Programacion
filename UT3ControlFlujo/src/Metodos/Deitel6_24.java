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
		 int sumafactores = 0; 
		 
		 for ( int j = 1; j <= numero; j++ ){       
			 sumafactores = 0;
	 
			 for ( int i = 1; i <= j/2 ; i++ ) 
			 
			 if( 0 == j % i )
				 sumafactores += i; 
		 
			 if ( sumafactores == j ){      
			 Imprime(j);
			 
			 }  
		 
		 }     
	 
	 }           
	   
	 public static void Imprime( int perfecto ){            
		 
	 System.out.print("El " + perfecto + " es perfecto porque es la suma de: ");
	  
	 for ( int factores = 1; factores <= perfecto/2; factores++ ){   
		if (perfecto%factores == 0)
		System.out.printf("\t%3d", factores);
	 }
	 
	 System.out.println("\n");

	 }              
	 
}     


