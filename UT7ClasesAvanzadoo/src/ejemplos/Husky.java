package ejemplos;

public class Husky extends Perro{

	boolean blanco;//Puede tener otras propiedades y otros métodos como este por ejemplo.
	
	public void cerrarVentana(){
		System.out.println("Znnnnn");
	}
	
	//Para redefinir se hace como vemos aquí debajo
	public void ladrar() {
		super.ladrar();//El SUPER hace referencia al método de la clase superior del que hereda, en este caso de la clase PERRO
		System.out.println("Auuuu!!");
	}
	
}
