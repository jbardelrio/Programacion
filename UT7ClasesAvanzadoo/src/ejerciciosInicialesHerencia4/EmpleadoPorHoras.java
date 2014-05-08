package ejerciciosInicialesHerencia4;

public class EmpleadoPorHoras extends Empleados {

	public double precioHoras;
	public double horasTrabajadas;
	
	public EmpleadoPorHoras() {
		
	}

	public static void main(String[] args) {
		Empleados e1 = new Empleados();
		System.out.println(Empleados.calculaSalarioSemanal(11, 2));
	}

}
