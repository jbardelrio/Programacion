package ejerciciosHerencia2;

import java.util.Arrays;
import java.util.Date;

public class ParadaActividad extends Parada {

	public ParadaActividad(String ciudad, Date horabajada, Date horasubida) {
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
