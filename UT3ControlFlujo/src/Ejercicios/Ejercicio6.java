package Ejercicios;
import java.util.Scanner;
public class Ejercicio6 {
/*
 * El juego de piedra/papel/tijera. Haz un programa para jugar a piedra/papel/tijera 
 * con el ordenador. Solo una ronda por ejecución.
 *  
 * para obtener un número aleatorio en Java entre 1 y 3
 * resultado = (int )(Math.random() * 3 + 1);
 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String jugada = "";
		int maquina = 0;
		String resultado = "";
		
		maquina = (int )(Math.random() * 3 + 1);
		switch (maquina) {
		case 1: resultado = "piedra";
			break;
		case 2: resultado = "papel";
			break;
		case 3: resultado = "tijera";	
			break;
		default:
			break;
		}
		System.out.println("Dime qué quieres sacar en tu jugada (piedra, papel o tijera): ");
		jugada = teclado.nextLine();
		teclado.close();
		if (jugada.toLowerCase().equals("piedra")) {
			if (resultado.equals("piedra")) {
				System.out.println("Empate");	
			}else if (resultado.equals("papel")) {
				System.out.println("Pierdes");
			}else{
				System.out.println("Ganas");
			}	
		}
		if (jugada.toLowerCase().equals("papel")) {
			if (resultado.equals("piedra")) {
				System.out.println("Ganas");
			}else if (resultado.equals("papel")) {
				System.out.println("Empate");
			}else{
				System.out.println("Pierdes");
			}
			
		}
		if (jugada.toLowerCase().equals("tijera")){
			if (resultado.equals("piedra")) {
				System.out.println("Pierdes");
			}else if (resultado.equals("papel")) {
				System.out.println("Ganas");
			}else{
				System.out.println("Empate");
			}
		}
		System.out.println("Has elegido " + jugada + " y la máquina ha elegido " + resultado + ".");
	}

}
