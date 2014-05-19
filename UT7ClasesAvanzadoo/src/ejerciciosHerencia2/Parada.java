package ejerciciosHerencia2;

import java.util.Date;

public class Parada{

	private String ciudad;
	private Date horabajada;
	private Date horasubida;

	public Parada(String ciudad, Date horabajada, Date horasubida) {
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

	public Date getHorabajada() {
		return horabajada;
	}

	public void setHorabajada(Date horabajada) {
		this.horabajada = horabajada;
	}

	public Date getHorasubida() {
		return horasubida;
	}

	public void setHorasubida(Date horasubida) {
		this.horasubida = horasubida;
	}

	@Override
	public String toString() {
		return "Parada [ciudad=" + ciudad + ", horabajada=" + horabajada
				+ ", horasubida=" + horasubida + "]";
	}
	

}
