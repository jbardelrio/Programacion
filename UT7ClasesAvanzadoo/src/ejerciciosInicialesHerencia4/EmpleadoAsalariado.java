package ejerciciosInicialesHerencia4;

public class EmpleadoAsalariado {

	public double salarioSemanal;
	
	public double getSalarioSemanal() {
		return salarioSemanal;
	}

	public void setSalarioSemanal(double salarioSemanal) {
		this.salarioSemanal = salarioSemanal;
	}

	public EmpleadoAsalariado() {
		
	}

	public static void main(String[] args) {
		Empleados e2 = new Empleados();
		System.out.println(Empleados.calculaSalarioSemanal(7, 2));
	}

}
