package Examendeprueba;
import java.util.Scanner;
public class Ejercicio3a {

	public static void main(String[] args) {
		
		
		String frases[] = new String[40];
		Scanner teclado = new Scanner(System.in);
		int longitud = frases.length;
		int rand1 = (int) (Math.random() * frases.length); 
		int rand2 = (int) (Math.random() * frases.length);
		int rand3 = (int) (Math.random() * frases.length);
		String respuesta = "";
		do {
			for (int i = 0; i < frases.length; i++) {
			
				System.out.println("Dame un verso: ");
				frases [i] = teclado.nextLine();
				if (frases[i].equals("*")) {
					break;
				}
			}
			
			System.out.println(longitud);
			System.out.println(frases[rand1] + frases[rand2] + frases[rand3]);
		
			
			do {
				  System.out.println("\n¿Otro Haiuku [s/n]?");
				  respuesta=teclado.next();
				} while (!respuesta.equals("s") && !respuesta.equals("n"));
			
		} while (respuesta.equals("s"));
			}	

	}


