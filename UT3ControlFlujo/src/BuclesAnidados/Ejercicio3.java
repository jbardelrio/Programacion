package BuclesAnidados;
import java.util.Scanner;
public class Ejercicio3 {
//Mejora el juego de piedra/papel/tijera haciendo dos cosas:
//Que se compruebe lo que el usuario escribe, y si no está {"piedra","papel","tijera"}
//vuelva a pedir que introduzca su elección.
//Al finalizar la partida, deberá preguntarse "¿Otra partida [s/n]?". 
//Si el usuario contesta que si, deberá volver a dejarnos jugar una nueva partida.

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String respuesta = "s";
		
		do {
			int maquina = 0;
			String jugada = "";
			String resultado = "";
			maquina = (int )(Math.random() * 3 + 1);
			switch (maquina) {
			case 1: resultado = "piedra";
				break;
			case 2: resultado = "papel";
				break;
			case 3: resultado = "tijera";	
				break;
			}
			
			System.out.println("Dime qué quieres sacar en tu jugada (piedra, papel o tijera): ");
			jugada = teclado.nextLine();
			jugada = jugada.toLowerCase();
			
			if (!(jugada.equals("piedra") || jugada.equals("papel") || jugada.equals("tijera"))) {
				System.out.println("Jugada no válida, por favor, elige piedra, papel o tijera: ");
				jugada = teclado.nextLine();
				jugada = jugada.toLowerCase();
			}
			
			if (jugada.equals("piedra")) {
				if (resultado.equals("piedra")) {
					System.out.println("Empate");	
				}else if (resultado.equals("papel")) {
					System.out.println("Pierdes");
				}else{
					System.out.println("Ganas");
				}	
			}
			if (jugada.equals("papel")) {
				if (resultado.equals("piedra")) {
					System.out.println("Ganas");
				}else if (resultado.equals("papel")) {
					System.out.println("Empate");
				}else{
					System.out.println("Pierdes");
				}
				
			}
			if (jugada.equals("tijera")){
				if (resultado.equals("piedra")) {
					System.out.println("Pierdes");
				}else if (resultado.equals("papel")) {
					System.out.println("Ganas");
				}else{
					System.out.println("Empate");
				}
			}
			
			System.out.println("Has elegido " + jugada + " y la máquina ha elegido " + resultado + ".");
			System.out.println();
			System.out.println("¿Hace otra partidita [s/n]?");
			respuesta = teclado.next();
		} while (respuesta.equals("s") || respuesta.equals("S"));
		System.out.println("Fin del juego.");
		teclado.close();
	}

}
