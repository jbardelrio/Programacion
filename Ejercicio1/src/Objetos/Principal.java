package Objetos;

public class Principal {

	public static void main(String[] args) {
		Clase1 objeto, objeto2;
		
		objeto = new Clase1();
		objeto2 = new Clase1();
		objeto.mensaje();
		objeto2.mensaje();
		
		Alumno juan, ramon;
		
		juan = new Alumno();
		ramon = new Alumno();
		juan.nombre="Juan";
		ramon.nombre="Ramon";
	}

}
