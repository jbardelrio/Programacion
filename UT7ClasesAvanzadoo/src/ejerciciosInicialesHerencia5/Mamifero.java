package ejerciciosInicialesHerencia5;

public class Mamifero extends Animal {

	private String nombreraza;
	
	public Mamifero(double peso, String fechanacimiento, String nombrecliente, String direccion) {
	
	}

	public static void main(String[] args) {
		Mamifero m1 = new Mamifero(62, "11/11/11", "Alfonso", "Toledo");
		System.out.println(m1);
	}
}
