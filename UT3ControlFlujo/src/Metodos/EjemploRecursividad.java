package Metodos;
//Con esto vamos a conseguir el error StackOverFlow que se produce cuando la pila se desborda
//En este ejemplo hacemos que un método se llame a sí mismo para una multiplicación
public class EjemploRecursividad {

	public static int multiplica(int a, int b){
		int resultado;
		
		if (b==1) resultado = a;
		else resultado = a + multiplica(a,b-1);
	
		return resultado;
	}
	
	public static void main(String[] args) {
		int a, b;
		
		a = 4;
		b = 7;
		
		System.out.println(multiplica(a,b));
	}

}