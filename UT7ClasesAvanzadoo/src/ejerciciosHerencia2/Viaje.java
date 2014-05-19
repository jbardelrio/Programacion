package ejerciciosHerencia2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;


public class Viaje implements Coste {

	private int codigo;
	private String nombre;
	private String horaini;
	private String horafin;
	private int numparadas;
	private Parada [] paradas;
	private long duracionviaje;
	
	public Viaje(int codigo, String nombre, String horaini, String horafin, String[] paradas) {
		
		this.codigo = codigo;
		this.nombre = nombre;
		this.horaini = horaini;
		this.horafin = horafin;
		this.paradas = new Parada [10];
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getHoraini() {
		return horaini;
	}
	public void setHoraini(String horaini) {
		this.horaini = horaini;
	}
	public String getHorafin() {
		return horafin;
	}
	public void setHorafin(String horafin) {
		this.horafin = horafin;
	}
	public Parada[] getParadas() {
		return paradas;
	}
	public void setParadas(Parada[] paradas) {
		this.paradas = paradas;
	}
	
	@Override
	public String toString() {
		return "Viaje [codigo=" + codigo + ", nombre=" + nombre + ", horaini="
				+ horaini + ", horafin=" + horafin + ", paradas="
				+ Arrays.toString(paradas) + "]";
	}
	
	public void añadirParada(Parada p){	
		
		paradas[this.numparadas] = p;
		++this.numparadas;
	
	}
	
	public void quitarParada(Parada p){	
		
		paradas[this.numparadas] = p;
		--this.numparadas;
	
	}
	
	public int getCoste() {
		
		return codigo ;
	}
	
	public static int fechasDiferenciaEnDias(Date fechaInicial, Date fechaFinal) {

		DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
		String fechaInicioString = df.format(fechaInicial);
		try {
		fechaInicial = df.parse(fechaInicioString);
		}
		catch (ParseException ex) {
		}

		String fechaFinalString = df.format(fechaFinal);
		try {
		fechaFinal = df.parse(fechaFinalString);
		}
		catch (ParseException ex) {
		}

		long fechaInicialMs = fechaInicial.getTime();
		long fechaFinalMs = fechaFinal.getTime();
		long diferencia = fechaFinalMs - fechaInicialMs;
		double dias = Math.floor(diferencia / (1000 * 60 * 60 * 24));
		return ( (int) dias);
	}
	
	public static Date aDate(String strFecha){
		
		SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy/MM/dd");
		Date fecha = null;

		try {
		fecha = formatoDelTexto.parse(strFecha);
		} catch (java.text.ParseException ex) {
		ex.printStackTrace();
		}
		return fecha;

		}
	
	
	public static void main(String[] args) {
		
		
		
	}
}
