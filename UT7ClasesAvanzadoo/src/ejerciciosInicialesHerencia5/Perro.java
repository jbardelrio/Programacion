package ejerciciosInicialesHerencia5;

public class Perro extends Mamifero {

	private int identificador;
	private boolean peligroso;
	
	public Perro(double peso, String fechanacimiento, String nombrecliente,String direccion, String nombreraza, int identificador, boolean peligroso) {
		super(peso, fechanacimiento, nombrecliente, direccion, nombreraza);
		this.identificador=identificador;
		this.peligroso=peligroso;
	}
	
	public String toString() {
		return super.toString() + " " + identificador + " " + peligroso;
	}

	public static void main(String[] args) {
		Perro p1 = new Perro(12, "10/10/09", "Alfonso", "Toledo", "york shire",1,false);
		System.out.println(p1);
	}
}
