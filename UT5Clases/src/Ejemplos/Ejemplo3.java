package Ejemplos;

public class Ejemplo3 {

	public static void main(String[] args) {
		Cuenta  mi_cuenta;
		mi_cuenta=new Cuenta();
		mi_cuenta.ingresar(1000);
		
		System.out.println(mi_cuenta.getSaldo());
	}

}
//Hacer que la cuenta también guarde el número de movimientos que ha habido en la cuenta