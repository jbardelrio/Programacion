package ejerciciosInicialesHerencia5;

public class Pez extends Animal {
	
	private String tropicalOfrio;
	private int numero;

	public Pez(double peso, String fechanacimiento, String nombrecliente, String direccion, String tropicalOfrio, int numero) {
		super(peso, fechanacimiento, nombrecliente, direccion);
		this.tropicalOfrio=tropicalOfrio;
		this.numero=numero;
	}
	
	public String toString() {
		return super.toString() + " " + tropicalOfrio + " " + numero;
	}

	public static void main(String[] args) {
		Pez pez1 = new Pez(01, "03/01/14", "Gabri", "Toledo","tropicales",111);
		System.out.println(pez1);
	}

}
