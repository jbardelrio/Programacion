package ejemplos;

public class Husky extends Perro{

	boolean blanco;//Puede tener otras propiedades y otros m�todos como este por ejemplo.
	
	public void cerrarVentana(){
		System.out.println("Znnnnn");
	}
	
	//Para redefinir se hace como vemos aqu� debajo
	public void ladrar() {
		super.ladrar();//El SUPER hace referencia al m�todo de la clase superior del que hereda, en este caso de la clase PERRO
		System.out.println("Auuuu!!");
	}
	
}
