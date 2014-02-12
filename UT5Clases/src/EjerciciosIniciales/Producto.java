package EjerciciosIniciales;
/*
 * Ejercicio 4 Crear la clase Producto, que tiene como atributos el código
 * del producto (numérico), el precio y el tanto por ciento del descuento. 
 * Deben realizarse todos los métodos get/set.
 * Deben añadirse además los métodos getPrecioTotal, 
 * que tiene en cuenta el descuento, y getPrecioTotal(nuevoPrecio), 
 * que debe tener en cuenta el descuento actual para que aplicándoselo 
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