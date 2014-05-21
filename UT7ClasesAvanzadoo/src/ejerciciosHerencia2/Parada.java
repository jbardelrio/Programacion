package ejerciciosHerencia2;

import java.util.Date;

public class Parada{

	private String ciudad;
	private String horabajada;
	private String horasubida;

	public Parada(String ciudad, String horabajada, String horasubida) {
		this.ciudad = ciudad;
		this.horabajada = horabajada;
		this.horasubida = horasubida;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getHorabajada() {
		return horabajada;
	}

	public void setHorabajada(String horabajada) {
		this.horabajada = horabajada;
	}

	public String getHorasubida() {
		return horasubida;
	}

	public void setHorasubida(String horasubida) {
		this.horasubida = horasubida;
	}

	@Override
	public String toString() {
		return "Parada [ciudad=" + ciudad + ", horabajada=" + horabajada
				+ ", horasubida=" + horasubida + "]";
	}
	

}
