package ejerciciosHerencia2;

import java.util.Arrays;
import java.util.Date;

public class ParadaLibre extends Parada {

	

	public ParadaLibre(String ciudad, String horabajada, String horasubida) {
		super(ciudad, horabajada, horasubida);
	}

	@Override
	public String toString() {
		return "ParadaLibre [getCiudad()=" + getCiudad() + ", getHorabajada()="
				+ getHorabajada() + ", getHorasubida()=" + getHorasubida()
				+ "]";
	}


	

}
