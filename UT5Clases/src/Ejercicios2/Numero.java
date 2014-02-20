package Ejercicios2;
/*
 * Ejercicio 5. Realiza una clase N�mero que almacene un n�mero entero y tenga las siguientes caracter�sticas:

    Constructor por defecto que inicializa a 0 el n�mero interno.
    Constructor que inicializa el n�mero interno.
    M�todo a�ade que permite sumarle un n�mero al valor interno.
    M�todo resta que resta un n�mero al valor interno.
    M�todo getValor. Devuelve el valor interno.
    M�todo getDoble. Devuelve el doble del valor interno.
    M�todo getTriple. Devuelve el triple del valor interno.
    M�todo setNumero. Inicializa de nuevo el valor interno.


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
	
	//M�todos
	public void a�ade(){
		
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
