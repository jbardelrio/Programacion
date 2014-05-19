package ejemplosinterfaces;

public interface Precio {//Los métodos dentro de las interfaces han de ser PÚBLICOS. Hay que implementarlos en las otras clases.

	//Las interfaces pueden llevar atributos como este de abajo, son CONSTANTES:
	public static final double recargo = 1.1;//Factor de conversión entre euros y otra moneda. Mutiplica los euros por 1.1
	
	public double getPrecio();
}
