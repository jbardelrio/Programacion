package Metodos;

import java.util.Scanner;

public class Deitel6_23{     

public static void main(String args[]){        

	Scanner entrada = new Scanner(System.in);
	 double a;
	 double b;
	 double c;
	
	 System.out.print("\nIntroduzca tres numeros: \n");
	 a = entrada.nextDouble();
	 b = entrada.nextDouble();
	 c = entrada.nextDouble();
	 entrada.close();
	 
	 System.out.printf("\nEl menor es: %.2f\n", Deitel6_23.Minimo(a, b, c)); 

 } 
 
 public static double Minimo( double a, double b, double c ){      
	 return Math.min( a, Math.min( b, c ) );
 }  
 
}   


    
  