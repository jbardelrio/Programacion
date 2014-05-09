package ejerciciosInicialesHerencia5;

/*
 * Realizar una jerarqu�a de clases necesaria para implementar la base de datos de una cl�nica veterinaria 
 * (solo la parte de animales). 
 * Las clases de animales deben ser: Animal, Mam�fero, Perro, Gato, Reptil y Pez. 
 * De todas las mascotas se necesita saber su peso, nombre, fecha de nacimiento, asi como los datos del cliente 
 * (Nombre y Direcci�n) 
 * Tanto perros como gatos tienen un nombre de raza ('Persa','American Stanford', etc.). 
 * Los perros tienen adem�s un n�mero identificador, que va en el chip, 
 * adem�s del atributo peligroso que almacenar� si el perro es una raza catalogada como peligrosa o no. 
 * A los reptiles debemos adem�s a�adir como atributo una lista (array) con los nombres de los animales que come, 
 * por ejemplo {'insectos','rat�n','peque�os reptiles'). 
 * Por su parte, los peces se guarda su n�mero (en realidad la clase guardar� los elementos) 
 * y si son tropicales o de agua fr�a.
 */

public class Animal {
	
	private double peso;
	private String fechanacimiento;
	private String nombrecliente;
	private String direccion;
	
	public Animal(double peso, String fechanacimiento, String nombrecliente, String direccion) {
		this.peso=peso;
		this.fechanacimiento=fechanacimiento;
		this.nombrecliente=nombrecliente;
		this.direccion=direccion;
	}
	
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getFechanacimiento() {
		return fechanacimiento;
	}

	public void setFechanacimiento(String fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}

	public String getNombrecliente() {
		return nombrecliente;
	}

	public void setNombrecliente(String nombrecliente) {
		this.nombrecliente = nombrecliente;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public static void main(String[] args) {
		
		
	}
	
	@Override
	public String toString() {
		return "Animal: peso=" + peso + ", fechanacimiento=" + fechanacimiento
				+ ", nombrecliente=" + nombrecliente + ", direccion="
				+ direccion + " ";
	}
	
	

}
