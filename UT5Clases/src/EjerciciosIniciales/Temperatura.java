package EjerciciosIniciales;
/*Ejercicio 1 Crear la clase Temperatura, que almacena una temperatura 
 * (atributo float que almacena la temperatura en grados celsius).
 *  La clase no tiene constructores, solo los m�todos: 
 *  1. getCelsius()/setCelsius(float grados). 
 *  2. getFahrenheit()/setFahrnheit(float grados).
 */
public class Temperatura {

	private float celsius;
	private float fahrenheit;
	private float grados;

	public float getCelsius() {
		return celsius;
	}

	public void setCelsius(float grados) {
		this.grados = grados;
	}

	public float getFahrenheit() {
		return fahrenheit;
	}

	public void setFahrenheit(float fahrenheit) {
		this.fahrenheit = fahrenheit;
	}

	//�C a �F 	Multiplica por 9, divide entre 5, despu�s suma 32
	//�F a �C 	Resta 32, despu�s multiplica por 5, despu�s divide entre 9
	public static float celsiusToFahrenheit ( float celsius ) {

	return ((celsius * 9) / 5) + 32;
	}

	public static float fahrenheitToCelsius ( float fahrenheit ) {

	return (( fahrenheit - 32 ) * 5) / 9;
	}
}