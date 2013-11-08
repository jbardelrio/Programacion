package Switch;
import java.util.Scanner;

public class DiaLaborableLetra {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String dia;
		
		System.out.println("Dame el d�a de la semana (en letra): ");
		dia = teclado.nextLine();
		teclado.close();
		
			switch (dia.toLowerCase()) {
			case "lunes":
			case "martes":
			case "miercoles":
			case "jueves":
			case "viernes":
				System.out.println("D�a laborable");
				break;
			case "sabado":
			case "domingo":
				System.out.println("D�a festivo.");
				break;
			default:
				System.out.println("El d�a introducido no es correcto");
				break;
			}
	}

}
