package vectoresymatrices;

import java.util.Arrays;

import vectoresymatrices.Pantalla;

public class Pantalla {

	private char caracter;
	private char[][] lienzo;
	private final int NUM_FILAS=8,NUM_COLUMNAS=10;
	
	/**
	 * Contruye un objeto pantalla de 10x8, con el caracter de dibujo
	 * por defecto '@'
	 */
	public Pantalla() {
		caracter='@';
		lienzo=new char[NUM_FILAS][NUM_COLUMNAS];
		for(char[] fila:lienzo) 
		{
			Arrays.fill(fila, '*');
		}
	}
	
	/**
	 * Imprime por consola la pantalla
	 */
	public void mostrar() {
		for(char[] fila:lienzo) {
			for(char elemento:fila) {
				System.out.print(elemento + " ");
			}
			System.out.println();
		}
	}
	
	/**
	 * Devuelve el caracter de dibujo actual
	 * @return Caracter de dibujo
	 */
	public char getCaracter() {
		return caracter;
	}

	/**
	 * Permite poner un nuevo caracter de dibujo
	 * @param caracter nuevo caracter de dibujo
	 */
	public void setCaracter(char caracter) {
		this.caracter = caracter;
	}
	
	/**
	 * Dibuja un cuadrado en la pantalla
	 * @param x posici贸n x de la esquina superior izquierda [1..10]
	 * @param y posici贸n y de la esquina superior izquierda [1..8]
	 * @param tama帽o tama帽o del cuadrado
	 */
	public void cuadrado(int x, int y, int tama駉) {
		lineaHorizontal(x, x+tama駉-1, y);
		lineaHorizontal(x, x+tama駉-1, y+tama駉-1);
		lineaVertical(y, y+tama駉-1, x);
		lineaVertical(y, y+tama駉-1, x+tama駉-1);
	}
	
	/**
	 * Dibuja un rectangulo en la pantalla
	 * @param x posici贸n x de la esquina superior izquierda [1..10]
	 * @param y posici贸n y de la esquina superior izquierda [1..8]
	 * @param tama帽oX largo del rect谩ngulo
	 * @param tama帽oY alto del rectangulo
	 */
	public void rectangulo(int x, int y, int tama駉X, int tama駉Y) {
		lineaHorizontal(x, x+tama駉X-1, y);
		lineaHorizontal(x, x+tama駉X-1, y+tama駉Y-1);
		lineaVertical(y, y+tama駉Y-1, x);
		lineaVertical(y, y+tama駉Y-1, x+tama駉X-1);
	}
	
	/**
	 * Dibuja un triangulo isosceles en la pantalla
	 * @param x posici贸n x de la esquina superior [1..10]
	 * @param y posici贸n y de la esquina superior [1..8]
	 * @param altura altura del triangulo
	 * 
	 */
	public void triangulo(int x, int y, int altura) {
		int apertura=0;
	    for(int j=y;j<(y+altura) && j<=NUM_FILAS && j>0;j++){
	    	int x1=x-apertura;
	    	int x2=x+apertura;
	    	if (x1>0 && x1<=NUM_COLUMNAS) {
	        	lienzo[j-1][x1-1]=caracter;
	    	}
	    	if (x2>0 && x2<=NUM_COLUMNAS) {
	        	lienzo[j-1][x2-1]=caracter;
	    	}
	    	apertura++;
	    }
		lineaHorizontal(x-apertura, x+apertura, y+altura);

	}
	
	/**
	 * Dibuja un circulo en la pantalla
	 * @param x posici贸n x del centro [1..10]
	 * @param y posici贸n y del centro [1..8]
	 * @param radio radio del circulo
	 * 
	 */
	public void circulo(int x, int y, int radio) {
		radio = radio-1;
		int d = (5 - radio * 4)/4;
		int i = 0;
		int j = radio;
 
		do {
			setPunto(x + i,y + j);
			setPunto(x + i,y - j);
			setPunto(x - i,y + j);
			setPunto(x - i,y - j);
			setPunto(x + j,y + i);
			setPunto(x + j,y - i);
			setPunto(x - j,y + i);
			setPunto(x - j,y - i);
			if (d < 0) {
				d += 2 * i + 1;
			} else {
				d += 2 * (i - j) + 1;
				j--;
			}
			i++;
		} while (i <= j);
	}
	
	
	private void setPunto(int x, int y){
		if (y>0 && y<=NUM_FILAS && x>0 && x<=NUM_COLUMNAS)
		  lienzo[y-1][x-1]=caracter;
	}
	
	private void lineaHorizontal(int x1, int x2, int y) {
		if (y>0 && y<=NUM_FILAS) {
        for(int i=x1;i<=x2 && i<=NUM_COLUMNAS;i++){
        	lienzo[y-1][i-1]=caracter;
		}
		}
	}
	
	private void lineaVertical(int y1, int y2, int x) {
		if (x>0 && x<=NUM_COLUMNAS) {
        for(int i=y1;i<=y2 && i<=NUM_FILAS;i++){
        	lienzo[i-1][x-1]=caracter;
		}
		}
	}

	public static void main(String[] args) {
		Pantalla p;
		
		p=new Pantalla();
		
		p.setCaracter('C');
		//p.cuadrado(1, 2, 4);
		p.setCaracter('R');
		//p.rectangulo(2, 3, 6, 4);
		p.setCaracter('T');
		//p.triangulo(7, 4, 3);
		p.setCaracter('O');
		p.circulo(8, 3, 3);

		p.mostrar();
	}
}
