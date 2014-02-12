package EjerciciosIniciales;

public class Temperatura2{

public static void main(String[] args) {

	Temperatura temp = new Temperatura();

	temp.setCelsius(36);
	temp.setFahrenheit(100);

	System.out.println("Temperatura en º Celsius: " + temp.getCelsius());
	System.out.println("Temperatura en º Fahrenheit: " + temp.getFahrenheit());
	
	float fahrenheit = 572; 
	float celsius = 300; 

	System.out.println("Farenheit a celsius: " + Temperatura.fahrenheitToCelsius(fahrenheit));
	System.out.println("Celsius a fahrenheit: " + Temperatura.celsiusToFahrenheit(celsius));

}

}


