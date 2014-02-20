package Ejemplos;

public class Real {

	private double numero;
	
	public Real(double numero){
		this.numero = numero;
	}
	
	
	public void suma(Real otro){
		this.numero = this.numero + otro.getNumero();
	}
	
	public static Real suma(Real uno, Real dos){
		Real resultado;
		resultado = new Real(uno.getNumero()+dos.getNumero());
		return resultado;
	}
	
	public double getNumero() {
		return numero;
	}

	public void setNumero(double numero) {
		this.numero = numero;
	}

	public static void main(String[] args) {
		
		Real numero1, numero2;
		
		numero1=new Real(7.0);
		numero2=new Real(5.0);
		
		numero1.suma(numero2);
		
		System.out.println("Resultado " + numero1.getNumero());

		Real suma;
		suma = Real.suma(numero1, numero2);
		
	
	}

}
