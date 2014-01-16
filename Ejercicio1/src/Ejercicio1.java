import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		System.out.println("\n¿Cuál es su nombre?");
		Scanner teclado= new Scanner(System.in);
		String nombre;
		nombre=teclado.nextLine();
		teclado.close();
		System.out.println("\nBuenos días, su nombre es " + nombre + ".");
	}

}
