package For;
//Visualizar los 15 primeros números naturales del 15 al 1. 
//Primero utilizar una estructura while, luego una for.
public class Ejercicio2_while {

	public static void main(String[] args) {
		
		int numero=15;
		
		while (numero > 0) {
			System.out.print(numero + "\t");
			--numero;
		}
	}

}
