package EjerciciosIniciales;
import java.util.Scanner;

public class Oculto2 {

public static void main(String[] args) {
	
	int numerointro;
	Oculto numeroOculto = new Oculto();
	int minimo = 0;
	int maximo = 0;
	boolean continuar = true;
	
	Scanner teclado = new Scanner(System.in);

	do {
		System.out.print("�NOS DICES EL RANGO EL N�MEROS O LO ELIJO YO? S/N ");
		String respuesta = teclado.next();
		
		if(respuesta.equalsIgnoreCase("N")) {
			System.out.println("TRATA DE ADIVINAR UN N�MERO ENTRE 1 Y 100");
			numeroOculto = new Oculto();
			continuar = false;
		}else if (respuesta.equalsIgnoreCase("S")) {
			continuar = true;
			do {
				System.out.print("DIME EL RANGO M�NIMO Y M�XIMO: ");	
				minimo = teclado.nextInt();
				maximo = teclado.nextInt();
				continuar = false;
				
			} while ( continuar );	
				System.out.println("EL NUMERO EST� ENTRE" + minimo +" Y " + maximo);
				numeroOculto = new Oculto(minimo, maximo);
				continuar = false;	
		}else {
			System.out.println("ERROR, DIME SI O NO (S/N)");	
		}
	
	} while (continuar);

	continuar = true;

	do {
		
		do {	
			System.out.print("DIME UN N�MERO A VER SI HAY SUERTE: ");
			numerointro = teclado.nextInt();
			continuar = false;
		} while (continuar);
		
			continuar = true;
		
		switch(numeroOculto.pruebaNumero(numerointro)) {
			case -1:
				System.out.println("EL N�MERO QUE BUSCAS ES MAYOR");
				break;
			case 1:
				System.out.println("EL N�MERO QUE BUSCAS ES MENOR");
				break;
			case 0:
				System.out.printf("ENHORABUENA !! HAS ACERTADO.",
				numeroOculto.getOculto());
				continuar = false;
			break;
		}
	
	} while ( continuar );

	teclado.close();

}

}