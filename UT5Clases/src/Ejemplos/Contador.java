package Ejemplos;

public class Contador {
	private long acumulador; //privado solo pueden acceder desde los m�todos de la clase en cuesti�n
							 //si es public puede ser accedido desde cualquier clase
	
	public long getContador(){
		return acumulador;
	}
	
	public void setContador(int contador){
		acumulador = contador;
	}
	
	public void incrementar() {
		acumulador++;
	}
}
