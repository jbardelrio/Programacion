package ejerciciosInicialesHerencia4;

/*
 * Diseña una jerarquia de clases con la superclase Empleado, que incluye subclases para EmpleadoPorHoras y EmpleadoAsalariado. 
 * Los atributos que comparten son el nombre y ocupación del empleado, más los get/set apropiados para estos atributos. 
 * Los empleados asalariados tienen un salario semanal, y los métodos correspondientes get/set. 
 * El empleado por horas tiene un precio por hora y las horas trabajadas. 
 * Debe haber un método calculaSalarioSemanal que se puede aplicar a ambos.
 */

public class Empleados extends Object{
	
	public String nombre;
	public String ocupacion;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getOcupacion() {
		return ocupacion;
	}

	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}

	public Empleados() {
		
	}

	public static double calculaSalarioSemanal(int precioHoras, int horasTrabajadas){
		double salario;
		return salario = precioHoras * horasTrabajadas;	
	}

}
