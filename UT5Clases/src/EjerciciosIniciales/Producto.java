package EjerciciosIniciales;
/*
 * Ejercicio 4 Crear la clase Producto, que tiene como atributos el c�digo
 * del producto (num�rico), el precio y el tanto por ciento del descuento. 
 * Deben realizarse todos los m�todos get/set.
 * Deben a�adirse adem�s los m�todos getPrecioTotal, 
 * que tiene en cuenta el descuento, y getPrecioTotal(nuevoPrecio), 
 * que debe tener en cuenta el descuento actual para que aplic�ndoselo 
 * al precio, devuelva este 'nuevoPrecio'.
 */
public class Producto {

	private int codigo;
	private double precio;
	private int porcentajedescuento;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getPorcentajedescuento() {
		return porcentajedescuento;
	}

	public void setPorcentajedescuento(int porcentajedescuento) {
		this.porcentajedescuento = porcentajedescuento;
	}

	public double getPrecioTotal() {
	return ((getPrecio() * getPorcentajedescuento()) / 100);
	}

	public double getPrecioTotal( double nuevoPrecio ) {
	return nuevoPrecio = (getPrecio()- getPrecioTotal());
	}



}