package Ejercicios2;
/*
 * Ejercicio 1. Crea una clase con un m�todo est�tico millasAMetros que toma como par�metro de entrada
 *  un valor en millas marinas y las convierte a metros.

Una vez tengas este m�todo escribe otro millasAKilometros que realice la misma conversi�n, 
pero esta vez exprese el resultado en kil�metros.

          Nota:1 milla marina equivale a 1852 metros.
 */
public class millasAMetros {


		private static final double metrosXmilla=1852;
		
		public static  double millasAMetros(double millas){
			return millas*metrosXmilla;
		}
		
		public static double millasAKilometros(double millas){
			return millas*metrosXmilla/1000.0;
		}
}
