package Libro;

import java.util.Scanner;
public class ArrayRomanos{
public static void main(String args[]){
int x, i;
	int Vn[]={ 1000, 900, 500, 400,
	 100, 90, 50, 40,
	 10, 9, 5, 4, 1 };
	 String Vc[]={"m","cm","d","cd",
	"c","xc","l","xl",
	 "x","ix","v","iv","i"};
	 
 Scanner in = new Scanner( System.in );
 
 System.out.println("Escribe el número : ");
 	while( true ){	
			 x = in.nextInt();
			if( x==0 )
			break;
			 System.out.printf( "%-4d ", x);
			 i = 0;
		while( x>0 ){
			if( x>=Vn[i] ){
			
			 x = x - Vn[i];
			 }
			else
			 i++;
		 }
		 System.out.print("En números romanos es : " + Vc[i] );
		 System.out.println();
 	}
 }
}