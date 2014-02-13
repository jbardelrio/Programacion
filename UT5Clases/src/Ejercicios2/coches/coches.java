package Ejercicios2.coches;
import Ejercicios2.Coche;
public class coches {

	public static void main(String[] args) {
		Coche coches;
		coches = new Coche("fiat","punto");
		
		System.out.println(coches.getMarca() + " " + coches.getModelo());

	}

}
