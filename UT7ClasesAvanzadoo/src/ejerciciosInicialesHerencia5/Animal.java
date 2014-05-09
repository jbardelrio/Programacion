package ejerciciosInicialesHerencia5;

/*
 * Realizar una jerarquía de clases necesaria para implementar la base de datos de una clínica veterinaria 
 * (solo la parte de animales). 
 * Las clases de animales deben ser: Animal, Mamífero, Perro, Gato, Reptil y Pez. 
 * De todas las mascotas se necesita saber su peso, nombre, fecha de nacimiento, asi como los datos del cliente 
 * (Nombre y Dirección) 
 * Tanto perros como gatos tienen un nombre de raza ('Persa','American Stanford', etc.). 
 * Los perros tienen además un número identificador, que va en el chip, 
 * además del atributo peligroso que almacenará si el perro es una raza catalogada como peligrosa o no. 
 * A los reptiles debemos además añadir como atributo una lista (array) con los nombres de los animales que come, 
 * por ejemplo {'insectos','ratón','pequeños reptiles'). 
 * Por su parte, los peces se guarda su número (en realidad la clase guardará los elementos) 
 * y si son tropicales o de agua fría.
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
