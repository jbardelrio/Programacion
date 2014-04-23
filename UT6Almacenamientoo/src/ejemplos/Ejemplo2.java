package ejemplos;
import java.util.Scanner;
//Escribe un programa que pida una cadena. Posteriormente, el programa
// dejará que el usuario inserte cinco subcadenas con el fin de informar
// si la primera cadena empieza o termina por cada una de las cinco subcadenas
public class Ejemplo2 {

	
	
	public static void main(String[] args) {
		
		String subcadenas [] = new String [5];
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Teclea la cadena: ");
		String cadena=teclado.nextLine();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Dime una subcadena: ");
			subcadenas[i]=teclado.nextLine();
		}
		for (int i = 0; i < subcadenas.length; i++) {
			if (cadena.startsWith(subcadenas[i])) {
				System.out.println("Comienza por " + subcadenas[i]);
			}else if (cadena.endsWith(subcadenas[i])){
				System.out.println("Acaba por " + subcadenas[i]);
			}else{
				System.out.println("No comienza ni termina por " + subcadenas[i]);
			}
			System.out.println();
		}
		
	}

}
