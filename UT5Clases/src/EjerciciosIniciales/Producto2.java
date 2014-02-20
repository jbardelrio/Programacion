package EjerciciosIniciales;

public class Producto2 {

	public static void main(String[] args) {
		
		Producto produc1 = new Producto();

		produc1.setCodigo(1);
		produc1.setPrecio(100.00);
		produc1.setPorcentajedescuento(30);

		System.out.printf("Descuento que te ahorras: %.2f €\n", produc1.getPrecioTotal());
		double nuevoPrecio = 0;
		System.out.printf("Precio total aplicado el descuento: %.2f €\n", produc1.getPrecioTotal(nuevoPrecio));
		
	}

}
