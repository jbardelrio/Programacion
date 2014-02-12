package EjerciciosIniciales;

public class Coche2 {

	public static void main(String[] args) {
		
		Coche fiatpunto = new Coche();

		System.out.println("Velocidad inicial: " + fiatpunto.getVelocidad() + " kmhora");

		int mas = 220;
		fiatpunto.acelera(mas);

		System.out.println("Velocidad al acelerar: " + fiatpunto.getVelocidad() + " kmhora");

		}

	}

