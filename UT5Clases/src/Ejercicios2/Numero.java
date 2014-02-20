package Ejercicios2;
/*
 * Ejercicio 5. Realiza una clase Número que almacene un número entero y tenga las siguientes características:

    Constructor por defecto que inicializa a 0 el número interno.
    Constructor que inicializa el número interno.
    Método añade que permite sumarle un número al valor interno.
    Método resta que resta un número al valor interno.
    Método getValor. Devuelve el valor interno.
    Método getDoble. Devuelve el doble del valor interno.
    Método getTriple. Devuelve el triple del valor interno.
    Método setNumero. Inicializa de nuevo el valor interno.


 */
public class Numero {
	private int numero;
	
	//Contructores
	public Numero(){
		numero = 0;
	}
	public Numero(int numero){
		numero = this.numero;
	}
	
	//Métodos
	public void añade(){
		
	}
	public void resta(){
		
	}
	public int getValor(){
		return numero;
	}
	public int getDoble(){
		return numero * 2;
	}
	public int getTriple(){
		return numero * 3;
	}
	public int setNumero(){
		return numero;
	}
	
	public static void main(String[] args) {
		Numero numero1;
		numero1 = new Numero();
		
		
		System.out.println(numero1.getDoble());

	}

}
