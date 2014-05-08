package ejerciciosInicialesHerencia2;

public class Libro extends Publicacion {

	private String autor;
	private String ISBN;
	
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	@Override
	public String toString() {
		return super.toString() + " " + this.autor + " " + this.ISBN;
	}
	
}
