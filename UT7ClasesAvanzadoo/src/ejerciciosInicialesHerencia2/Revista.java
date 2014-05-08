package ejerciciosInicialesHerencia2;

public class Revista extends Publicacion {

	private int numero;
		
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return super.toString() + " " + this.numero;
	}
}
