package ejemplos;

public class Perro extends Animal{

	//AL poner el EXTENDS es como poner aquí esto que pusimos en la otra clase: "public String nombrecientifico;"

	public Perro(){
		this.nombrecientifico="canis lupus familiaris";
		System.out.println("Ha nacido un nuevo " + this.nombrecientifico);
	}
	
	public void ladrar(){
		System.out.println("Woof, woof");
	}
}
