package Ejercicios2;
/*
 * Ejercicio 3. Realiza una clase Finanzas que convierta d�lares a euros y viceversa. 
 * Codifica los m�todos dolaresToEuros y eurosToDolares. 
 * Prueba que dicha clase funciona correctamente haciendo conversiones entre euros y d�lares. 
 *
 * La clase tiene que tener:
 * 
    Un constructor finanzas que establecer� el cambio D�lar-Euro en 1.36.
    Un constructor finanzas(double), el cual permitir� configurar el cambio D�lar-Euro.

 */
public class Finanzas {
	
	private double euros;
	private double cifravariable;
	private double dolares;
	
	public Finanzas(){
		euros = dolares * 1.36;
	}

	public Finanzas(double euros){
		euros = euros * cifravariable;
	}

	public double getEuros() {
		return euros = euros * 1.36;
	}

	public void setEuros(double euros) {
		this.euros = euros;
	}

	public double getCifravariable() {
		return euros = euros * cifravariable;
	}

	public void setCifravariable(double cifravariable) {
		this.cifravariable = cifravariable;
	}
	
	
}
