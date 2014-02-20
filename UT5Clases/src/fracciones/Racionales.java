package fracciones;
/*
 * N�meros racionales:

Clase: Racional (que me permita crear un n�merop de ese tipo

Constructores: 
	Por defecto, si no le digo nada, el n�mero debe valer 1/1
	Otro constructor con los valores que le pase por par�metro

M�todos:
	get/set
	para poder sumar, restar, dividir y multiplicar 2 n�meros racionales
	"static Racional.sumar(Racional a, Racional B)"   o poner   "minumero.sumar(Racional otro)"
	toString()   Ej."1/2" 	para sacar la cadena de esa clase
	toFloatString()  Ej."0.5"

M�todo privado:
	simplificar()     Este lo que hace es simplificarla fracci�n al n�mero m�s peque�o sacando el mcd

Clase para probarlo: leer dos n�meros racionales, mostrar un men� para (sumar/restar/multiplicar/dividir)
hacer la operaci�n y mostrarla.
 */
public class Racionales {

	private int numerador;
	private int denominador;
	private int sumar;
	//Constructores:
	public Racionales() {
	     numerador=1;
	     denominador=1;
	  }
	  public Racionales(int num, int den) {
	     numerador=num;
	     denominador=den;
	  }
	//M�todos:
	public int getNumerador() {
		return numerador;
	}
	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}
	public int getDenominador() {
		return denominador;
	}
	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}
	  
	public void sumar(Racionales numerador, Racionales denominador){
		  this.sumar = (getNumerador() + getDenominador());
	  }
	
	public void restar(){
		   
	  }
	
	public void multiplicar(){
		   
	  }
	
	public void dividir(){
		   
	  }
	  
/*
Racional numero1;
numero1 = new Racional (7,23);
numero2 = new Racional(4/3);

numero1.suma(numero2);

public void suma(Racional numero){
	numero.getNumerador();
}
*/
}
