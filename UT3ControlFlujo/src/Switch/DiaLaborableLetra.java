package Switch;
import java.util.Scanner;

public class DiaLaborableLetra {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String dia;
		
		System.out.println("Dame el día de la semana (en letra): ");
		dia = teclado.nextLine();
		teclado.close();
		
			switch (dia.toLowerCase()) {
			case "lunes":
			case "martes":
			case "miercoles":
			case "jueves":
			case "viernes":
				System.out.println("Día laborable");
				break;
			case "sabado":
			case "domingo":
				System.out.println("Día festivo.");
				break;
			default:
				System.out.println("El día introducido no es correcto");
				break;
			}
	}

}
