package ejerciciosInicialesHerencia5_6;

public class Reptil extends Animal {

	private String [] comida;
	
	public Reptil(double peso, String fechanacimiento, String nombrecliente, String direccion, String [] comida) {
		super(peso, fechanacimiento, nombrecliente, direccion);
		this.comida=comida;
	}

	public String toString() {
		return super.toString() + " " + comida;
	}

}
