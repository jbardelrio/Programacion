package Ejercicios2.finanzas;
import Ejercicios2.Finanzas;
public class PruebaFinanzas {

	public static void main(String[] args) {
		Finanzas cifra1;
		cifra1 = new Finanzas();
		Finanzas cifra2;
		cifra2 = new Finanzas();
		
		cifra1.setEuros(300);
		
		System.out.printf("300 euros son en dólares: %.2f $\n", cifra1.getEuros());
		
		cifra2.setCifravariable(1.5);
		cifra2.setEuros(100);
		
		System.out.printf("100 euros a 1.5 son en dólares: %.2f $\n", cifra2.getCifravariable());
		
		
		
		

	}

}
