package Ejercicios2;
/*
 * Ejercicio 4. Realiza una clase MiNumero que proporcione el doble, triple y cuádruple de un número 
 * proporcionado en su constructor (realiza un método para doble, otro para triple y otro para cuádruple). 
 * En este caso haz que la clase tenga un método main y comprueba los distintos métodos, 
 * sin necesidad de crear un método de prueba.
 */
public class MiNumero {
	private int numero;
	public MiNumero (){
		numero = 5;
	}

	public int doble (){
		return numero * 2;
	}
	public int triple (){
		return numero * 3;
			
		}
	public int cuadruple (){
		return numero * 4;
		
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public static void main(String[] args) {
		MiNumero numero1;
		numero1 = new MiNumero();
		
		System.out.println(numero1.getNumero());
		System.out.println(numero1.doble());
		System.out.println(numero1.triple());
		System.out.println(numero1.cuadruple());

	}

}
