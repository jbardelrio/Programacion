import java.util.InputMismatchException;
import java.util.Scanner;


public class Ejemplo1 {

	public static void main(String[] args) {
		int dividendo=0, divisor=0;
		Scanner teclado = new Scanner(System.in);
		//Todo lo de dentro del TRY es lo que vamos a controlar con la excepción
		try{
			dividendo = teclado.nextInt();
			divisor = teclado.nextInt();
		}
		catch (InputMismatchException e){
			//El "ERR" es lo mismo que System.out.println pero para errores solamente, lo imprime en rojo. 
			//Puedes usar el que quieras.
			System.err.println("Error, no es número entero.");
			//Esto hace que se salga del programa. Con el cero no ves el error, si pusieramos "-1" veríamos el error
			System.exit(0);
			
			}
		try{
			System.out.println("Resultado: " + (dividendo/divisor));
		}
		//CATCH dice el error que queremos tratar. E es el objeto de la excepcion(cuando se crea un error crea
		//un objeto con esa excepcion). Podemos darle el nombre que queramos.
		//Este ejempl ocapturaria cualquier excepcion, pero podemos definir una en concreto o varias así:
		//Ejemplo: catch (ArithmeticException e)
		catch (ArithmeticException error) {
			//Aqui dentro le decimos lo que debe hacer cuando encuentre una excepción. No es buena práctica
			//el dejar esto en blanco, porque sino no nos enteramos del error que se ha producido.
			System.err.println("Error, división por cero.");
			//Esto hace que nos imprima el mensaje de error. En este caso nos dice "/ by cero" porque 
			//hemos dividido por cero.
			System.out.println(error.getMessage());
		}
		catch (Exception e){
			System.out.println("Error inesperado.");
			//Esto hace que nos imprima el mensaje de error
			System.out.println(e.getMessage());
		}

		System.out.println("Adiós");
	}

}
