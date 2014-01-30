import java.util.*;
public class LeeNumeros {
static Scanner teclado = new Scanner(System.in);
	public static float leerFloat() throws NumeroNegativo{
		float leido=0;
		try{
			leido = teclado.nextFloat();
			if (leido < 0) {
				throw new NumeroNegativo();
			}
		}catch (NullPointerException e){
		System.out.println("Error, Scanner no iniciado.");
		throw e; //El THROW se encarga de lanzar una excepci�n
		}catch(InputMismatchException e){
		
		}
	return leido;
	}
	public static void main(String[] args) {
		float numero = 0;
		boolean continuar = true;
		teclado= new Scanner(System.in);
	try{
		do {
			numero=leerFloat();
			System.out.println(numero);
		System.out.println(leerFloat());
		} while (numero > 0);
	}catch(NullPointerException e){
		System.out.println("No se pudo terminar el programa correctamente.");
	}catch(InputMismatchException e){
		System.out.println("No se pudo terminar el programa correctamente.");
	}catch(NumeroNegativo e){
		continuar = false;
	}

	}

}
