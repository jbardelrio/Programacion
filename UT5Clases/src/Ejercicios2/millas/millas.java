package Ejercicios2.millas;
import Ejercicios2.millasAMetros;;
public class millas {

	public static void main(String[] args) {
		millasAMetros conversion = new millasAMetros();
		
		
		System.out.println("100 millas en metros son: "+ conversion.millasTOmetros(100) + " metros.");
		System.out.println("100 metros en millas son: "+ conversion.millasAKilometros(100) + " millas.");
		

	}

}
