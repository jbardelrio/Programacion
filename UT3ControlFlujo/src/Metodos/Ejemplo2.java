package Metodos;

public class Ejemplo2 {
//Método que imprima 10 líneas de números aleatorios
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				numaleatorio();
			}
			System.out.println();
		}
	}

	public static void numaleatorio() {
		
		int numero = (int) (Math.random()*10);
		
		System.out.print( numero );
	}
}
