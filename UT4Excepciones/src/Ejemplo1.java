
public class Ejemplo1 {

	public static void main(String[] args) {
		int dividendo, divisor;
		
		//Todo lo de dentro del TRY es lo que vamos a controlar con la excepción
		try{
			dividendo= 10;
			divisor=0;
			System.out.println("Resultado: " + (dividendo/divisor));
		}
		//CATCH dice el error que queremos tratar. E es el objeto de la excepcion(cuando se crea un error crea
		//un objeto con esa excepcion). Podemos darle el nombre que queramos.
		//Este ejempl ocapturaria cualquier excepcion, pero podemos definir una en concreto o varias así:
		//Ejemplo: catch (ArithmeticException e)
		catch (Exception e) {
			//Aqui dentro le decimos lo que debe hacer cuando encuentre una excepción. No es buena práctica
			//el dejar esto en blanco, porque sino no nos enteramos del error que se ha producido.
		}

		System.out.println("Adiós");
	}

}
