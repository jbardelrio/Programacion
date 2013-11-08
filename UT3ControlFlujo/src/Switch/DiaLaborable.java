package Switch;
import java.util.Scanner;
import java.util.Scanner;

public class DiaLaborable {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero_dia;
		
		System.out.println("Dame el día de la semana (en número): ");
		numero_dia = teclado.nextInt();
		teclado.close();

			switch (numero_dia) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				System.out.println("Día laborable");
				break;
			case 6:
			case 7:
				System.out.println("Día festivo.");
				break;
			default:
				System.out.println("El número no está entre [1..7]");
				break;
			}
	}

}
