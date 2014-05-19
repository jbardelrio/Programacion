package ejemplos;


public class AnimalRegistrable implements Registrable{
	public int registrar(){
		int num_registro=(int)(Math.random() * 1000);
		System.out.println("Registrado con número: " + num_registro);
		return num_registro;
	}
	
}
