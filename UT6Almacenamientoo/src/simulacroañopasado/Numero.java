package simulacroa�opasado;

import vectoresymatrices.Menu;
import vectoresymatrices.Pantalla;

/*
 * 4. (3 pts) Crea la clase Numero que permite llevar la cuenta de los n�meros dados en la cola de la charcuter�a. 
 * La clase almacenar� el n�mero que se est� atendiendo (sale en el marcador) y el �ltimo n�mero que se ha dado 
 * (el que se ha impreso). 
 * La clase tendr� los m�todos:
 * 
darNumero(): da el siguiente n�mero (lo imprime por pantalla).
atender(): muestra el n�mero del cliente que tiene ir al mostrador
mostrarCola(): muestra el n�mero de clientes haciendo colae imprime la lista de sus n�meros.

Crea un men� para poder coger/dar n�meros y ver la cola.

Ej:
________________
Menu: 
(1)Coger Numero
(2)Atender
(3)Ver cola
(4)Salir
_______________
1
*****
* 1 *
*****
_________________
1
*****
* 2 *
*****
__________________
3
Clientes sin atender: 2
1 
2 
_______________________
2
*N� 1* papese por el mostrador
_____________________
4
_____________________
 */


public class Numero {

	public static void main(String[] args) {
		Menu menuPrincipal;
		String[] opciones={"(1)Coger Numero",
					"(2)Atender",
					"(3)Ver cola",
					"(4)Salir",
					};
		Pantalla miPantalla= new Pantalla();
		
		menuPrincipal=new Menu(opciones,4);
		
		int respuesta;
		do {
			respuesta=menuPrincipal.imprimirYPreguntar();
			switch(respuesta){
			case 1:	
				break;
			case 2:					
				break;
			case 3:
				break;
			case 4:
				break;
			}
			
		} while (respuesta!=4);

	}

}
