package Switch;
import java.util.Scanner;
public class DiaSemanaSwitch {
	
//Esta soluci�n es con IF, despu�s la haremos con un switch
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero_dia;
		String letra_dia="";
		
		System.out.println("Dame el d�a de la semana (en n�mero): ");
		numero_dia = teclado.nextInt();
		teclado.close();
		
		switch (numero_dia){
		case 1: 
			letra_dia="Lunes";
			break;
		case 2:
			letra_dia="Martes";
			break;
		case 3:
			letra_dia="Mi�rcoles";
			break;
		case 4:
			letra_dia="Jueves";
			break;
		case 5:
			letra_dia="Viernes";
			break;
		case 6:
			letra_dia="S�bado";
			break;
		case 7:
			letra_dia="Domingo";
			break;
		default:
			System.out.println("El n�mero no est� entre [1..7]");
			letra_dia="";
		}
		if (!letra_dia.equals("")) {
			System.out.println("El d�a " + numero_dia + " corresponde al " + letra_dia);
		}
	}

}