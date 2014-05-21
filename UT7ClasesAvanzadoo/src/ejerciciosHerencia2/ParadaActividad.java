package ejerciciosHerencia2;

public class ParadaActividad extends Parada {

	public ParadaActividad(String ciudad, String horabajada, String horasubida) {
		super(ciudad, horabajada, horasubida);
	}

	private String nombreactividad;
	private int precioactividad;

	

	public String getNombreactividad() {
		return nombreactividad;
	}

	public void setNombreactividad(String nombreactividad) {
		this.nombreactividad = nombreactividad;
	}

	public int getPrecioactividad() {
		return precioactividad;
	}

	public void setPrecioactividad(int precioactividad) {
		this.precioactividad = precioactividad;
	}

	@Override
	public String toString() {
		return "ParadaActividad [nombreactividad=" + nombreactividad
				+ ", precioactividad=" + precioactividad + "]";
	}



	
}
