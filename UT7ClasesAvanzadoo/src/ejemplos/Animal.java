package ejemplos;

public class Animal extends Object {//Este EXTENDS OBJECT no hace falta ponerlo, lo hace de manera impl�cita

	public String nombrecientifico;
	public String nombrecomun;
	
	public Animal(){
		this.nombrecientifico="desconocido";
		System.out.println("Se ha creado un animal");
	}
	
	public void comer(){
		System.out.println("�am, �am");
	}
	
	
}
