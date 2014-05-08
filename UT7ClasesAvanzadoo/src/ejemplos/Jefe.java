package ejemplos;

public class Jefe extends Empleado {
	
	private double complemento;
	private String departamento;

	public Jefe(String nombre, double sueldo, double complemento) {
		super(nombre, sueldo);
		
		this.complemento=complemento;
	}

	public double getSueldo() {
		double sueldo_total;
		sueldo_total = super.getSueldo() + this.complemento;
		return sueldo_total;
	}
	
	public static void main(String[] args){
		Jefe jefe = new Jefe("Anónimo",1000.0, 500.0);
	}
}
