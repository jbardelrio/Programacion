package Ejercicios2;
/*
 * Ejercicio 1. Crea una clase con un m�todo est�tico millasAMetros que toma como par�metro de entrada
 *  un valor en millas marinas y las convierte a metros.

Una vez tengas este m�todo escribe otro millasAKilometros que realice la misma conversi�n, 
pero esta vez exprese el resultado en kil�metros.

          Nota:1 milla marina equivale a 1852 metros.
 */
public class millasAMetros {

		private static float millas;

		
		public static float millasTOmetros(float millas) {
			return (float) (millas * 1852);
		}

		public static float millasAKilometros(float kilometros) {
			return (float) (kilometros / 0.62137);
		}
	
	
	
}
