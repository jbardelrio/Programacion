package Switch;
import java.util.Scanner;
public class DiaSemana {
	
//Esta soluci�n es con IF, despu�s la haremos con un switch
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero_dia;
		String letra_dia="";
		
		System.out.println("Dame el d�a de la semana (en n�mero): ");
		numero_dia = teclado.nextInt();
		teclado.close();
		
		if (numero_dia==1) {
			letra_dia = "Lunes";
		}else if (numero_dia==2){
			letra_dia="Martes";
		}
		else if (numero_dia==3){
			letra_dia="Miercoles";
		}
		else if (numero_dia==4){
			letra_dia="Jueves";
		}
		else if (numero_dia==5){
			letra_dia="Viernes";
		}
		else if (numero_dia==6){
			letra_dia="S�bado";
		}
		else if (numero_dia==7){
			letra_dia="Domingo";
		}else{
			System.out.println("El n�mero no est� entre [1..7]");
		}
		if (!letra_dia.equals("")) {
			System.out.println("El d�a " + numero_dia + " corresponde al " + letra_dia);
		}

	}

}
