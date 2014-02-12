package EjerciciosIniciales;
/*Ejercicio 1 Crear la clase Temperatura, que almacena una temperatura 
 * (atributo float que almacena la temperatura en grados celsius).
 *  La clase no tiene constructores, solo los métodos: 
 *  1. getCelsius()/setCelsius(float grados). 
 *  2. getFahrenheit()/setFahrnheit(float grados).
 */
public class Temperatura {

	private float celsius;
	private float Fahrenheit;

	public float getCelsius() {
		return celsius;
	}

	public void setCelsius(float celsius) {
		this.celsius = celsius;
	}

	public float getFahrenheit() {
		return Fahrenheit;
	}

	public void setFahrenheit(float fahrenheit) {
		Fahrenheit = fahrenheit;
	}

	//°C a °F 	Multiplica por 9, divide entre 5, después suma 32
	//°F a °C 	Resta 32, después multiplica por 5, después divide entre 9
	public static float celsiusToFahrenheit ( float celsius ) {

	return ((celsius * 9) / 5) + 32;
	}

	public static float fahrenheitToCelsius ( float fahrenheit ) {

	return (( fahrenheit - 32 ) * 5) / 9;
	}
}