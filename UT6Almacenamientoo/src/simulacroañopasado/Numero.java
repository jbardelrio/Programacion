package simulacroañopasado;

import vectoresymatrices.Menu;
import vectoresymatrices.Pantalla;

/*
 * 4. (3 pts) Crea la clase Numero que permite llevar la cuenta de los números dados en la cola de la charcutería. 
 * La clase almacenará el número que se está atendiendo (sale en el marcador) y el último número que se ha dado 
 * (el que se ha impreso). 
 * La clase tendrá los métodos:
 * 
darNumero(): da el siguiente número (lo imprime por pantalla).
atender(): muestra el número del cliente que tiene ir al mostrador
mostrarCola(): muestra el número de clientes haciendo colae imprime la lista de sus números.

Crea un menú para poder coger/dar números y ver la cola.

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
*Nº 1* papese por el mostrador
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
