package vectoresymatrices;

import java.util.Scanner;

/*
 * Ejercicio 6. Escribe un programa que obtenga la letra del DNI. 
 * El procedimiento para obtener la letra consiste en dividir el número del DNI por 23. 
 * La parte entera del resultado obtenido se multiplica por 23. 
 * Seguidamente, al DNI original se le resta el último resultado obtenido. 
 * Como resultado final de esta última operación dará un número que estará siempre comprendido entre 0 y 23. 
 * Según el valor de este último, se aplicará la siguiente tabla: 
 * 0=T 1=R 2=W 3=A 4=G 5=M 6=Y 7=F 8=P 9=D 10=X 11=B 12=N 13=J 14=Z 15=S 16=Q 17=V 18=H 19=L 20=C 21=K 22=E 23=O
 */
public class Ejercicio6 {

	
	
	
	 public static final String letraNIF = "TRWAGMYFPDXBNJZSQVHLCKE";
	 
	  public static String letraDNI(int dni) {
	    return String.valueOf(dni) + letraNIF.charAt(dni % 23);
	  }

	public static void main(String[] args) {
		int dni;
		System.out.println("Dime las 8 cifras del DNI: ");
		Scanner teclado = new Scanner (System.in);
		dni = teclado.nextInt();
		System.out.println("El NIF es: " + letraDNI(dni));
		
	}

}
