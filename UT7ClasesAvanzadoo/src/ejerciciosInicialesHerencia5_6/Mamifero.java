package ejerciciosInicialesHerencia5_6;

public class Mamifero extends Animal {

	private String nombreraza;
	
	public Mamifero(double peso, String fechanacimiento, String nombrecliente, String direccion, String nombreraza) {
		super(peso, fechanacimiento, nombrecliente, direccion);
		this.nombreraza=nombreraza;
	}

	
	public String getNombreraza() {
		return nombreraza;
	}


	public void setNombreraza(String nombreraza) {
		this.nombreraza = nombreraza;
	}


	public static void main(String[] args) {
		Mamifero m1 = new Mamifero(62, "11/11/11", "Alfonso", "Toledo", "ornitorrinco");
		System.out.println(m1);
	}

	@Override
	public String toString() {
		return super.toString() + " " + nombreraza;
	}
	
	
	
}
