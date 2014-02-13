package Ejercicios2.millas;
import Ejercicios2.millasAMetros;
public class millas {

	public static void main(String[] args) {
		
		millasAMetros conversion;
		conversion = new millasAMetros();
			
		System.out.println("100 millas en metros son: "+ conversion.millasAMetros(100) + " metros.");
		System.out.println("100 millas en kilómetros son: "+ conversion.millasAKilometros(100) + " millas.");
		

	}

}
