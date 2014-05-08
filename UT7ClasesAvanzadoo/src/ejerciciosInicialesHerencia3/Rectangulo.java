package ejerciciosInicialesHerencia3;

import java.util.Scanner;

public class Rectangulo extends Cuadrado {
	
	private static int largo;
	private static int ancho;

	public Rectangulo(int ancho, int largo) {
		if (ancho > 0) {
			this.ancho=ancho;
		}else{
			this.ancho=5;
		}
		
		if (largo > 0) {
			this.largo=largo;
		}else{
			this.largo=5;
		}
	}

	
	public int getLargo() {
		return largo;
	}

	public void setLargo(int largo) {
		this.largo = largo;
	}

	public int getAncho() {
		return this.ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = super.getAncho();
	}

	public static int perimetroRectangulo(){
		//P = 2· a + 2· b
		int perimetro;
		return perimetro = (2 * ancho) + (2 * largo);
	}
	
	public static int areaRectangulo(){
		//A= a · b
		int area;
		return area = ancho * largo;
	}
	
	public static void horizontalVertical(){
		
		if (ancho > largo) {
			System.out.println("El rectángulo es horizontal");
		}else{
			System.out.println("El rectángulo es vertical");
		}
	}
	
	public void dibujarRectangulo(int ancho, int largo){
		
		for (int i=0;i < largo;i++){
			for(int j=0;j<ancho;j++){
				System.out.print("* ");
			}
				System.out.println("");
			} 
	}
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Rectangulo r1 = new Rectangulo(ancho, largo);

		//System.out.println("\nPor favor introduzca el ancho: ");
		//ancho = entrada.nextInt();
		System.out.println("\nPor favor introduzca el largo: ");
		largo = entrada.nextInt();

		r1.dibujarRectangulo(ancho, largo);

	}

}
