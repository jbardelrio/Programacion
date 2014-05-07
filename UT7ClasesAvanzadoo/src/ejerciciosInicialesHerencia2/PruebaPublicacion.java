package ejerciciosInicialesHerencia2;

public class PruebaPublicacion {

	public static void main(String[] args) {
		
		Publicacion p1 = new Publicacion();
		p1.setEditor("Bergamín");
		p1.setFecha("07/05/2012");
		
		Revista r1 = new Revista();
		r1.setNumero(11);
		
		Libro l1 = new Libro();
		l1.setAutor("León Felipe");
		l1.setISBN("SEF23294832821");
		
		System.out.println(p1);
		System.out.println(r1);
		System.out.println(l1);

	}

	
}
