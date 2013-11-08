package Switch;
import java.util.Scanner;
public class DiaSemana {
	
//Esta solución es con IF, después la haremos con un switch
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero_dia;
		String letra_dia="";
		
		System.out.println("Dame el día de la semana (en número): ");
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
			letra_dia="Sábado";
		}
		else if (numero_dia==7){
			letra_dia="Domingo";
		}else{
			System.out.println("El número no está entre [1..7]");
		}
		if (!letra_dia.equals("")) {
			System.out.println("El día " + numero_dia + " corresponde al " + letra_dia);
		}

	}

}
