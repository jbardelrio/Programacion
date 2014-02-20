package Ejercicios2;

public class Peso extends Object {
	
private double peso;

public Peso(double peso, String unidad){
	this.peso = peso * factorConversion(unidad);	
}

private double factorConversion(String unidad){
	
	double factor;
	
	switch(unidad){
	case "lb": factor = 453/1000.0;
	break;
	case "li": factor = 14.59;
	break;
	case "oz": factor = (28.35/1000);
	break;
	case "p": factor = (1.55/1000);
	break;
	case "k": factor = 1;
	break;
	case "g": factor = 1000.0;
	break;
	case "q": factor = 43.3;
	break;
	default: factor = 1;
	}
	return factor;
}

	@Override
	public String toString() {
		return "Peso: " + peso + " kg";
	}

	public double getLibras(){
		return peso/factorConversion("lb");
	}
	public double getLingotes(){
		return peso/factorConversion("li");
	}
	public double getPeso(String medida){
		return peso/factorConversion(medida);
	}

	public static void main(String[] args) {
		Peso camion;
		camion = new Peso(3000, "li");
		
		System.out.println("Peso del camión en medida inicial: " + camion.getPeso("k") + " kg.");
		System.out.println("Peso del camión en lingotes: " + camion.getLingotes() + " li.");
		System.out.println("Peso del camión en onzas: " + camion.getPeso("oz") + " oz.");
		System.out.println("Peso del camión en libras: " + camion.getLibras() + " lb.");

		System.out.println(camion);
	}

}
