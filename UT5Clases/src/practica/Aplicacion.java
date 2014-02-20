package practica;

class Cerebro {
	public Cerebro() {
		System.out.println("Pensando ...");
	}
}

class Persona{

	private String nombre;
	private Cerebro cerebro;
	
	public Persona(){
		System.out.println("Constructor ejecutándose !!");
	}
	
	public Persona(String nombre){
		this.nombre = nombre;
		
		 cerebro = new Cerebro();
	}
	
	public void escribeNombre(){
		System.out.println("Mi nombre es " + nombre);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
}

	public class Aplicacion {
		 
		public static void main(String[] args) {
		 
			System.out.println("¡Hola Mundo!");
			 
			Persona persona = new Persona("Juan");
			
			String nombre = persona.getNombre();
			
			nombre = nombre + " García";
			persona.setNombre(nombre);
			persona.escribeNombre();
	}
 
}


