package Ejemplos;

public class Contador {
	private long acumulador; //privado solo pueden acceder desde los métodos de la clase en cuestión
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
