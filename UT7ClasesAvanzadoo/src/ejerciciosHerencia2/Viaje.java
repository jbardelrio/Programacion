package ejerciciosHerencia2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Calendar; 
import java.util.Locale;

public class Viaje  {
	
	static long milisegundos_dia = 24 * 60 * 60 * 1000;
	private int codigo;
	private String nombre;
	private String horaini;
	private String horafin;
	private int numparadas;
	private Parada [] paradas;
	private static double totalHoras=0;
	private static double costeviaje;
	
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
	public int getNumparadas() {
		return numparadas;
	}
	public void setNumparadas(int numparadas) {
		this.numparadas = numparadas;
	}
	public static double getTotalHoras() {
		return totalHoras;
	}
	public static void setTotalHoras(double totalHoras) {
		Viaje.totalHoras = totalHoras;
	}
	public static double getCosteviaje() {
		return costeviaje;
	}
	public static void setCosteviaje(double costeviaje) {
		Viaje.costeviaje = costeviaje;
	}
	
	
	@Override
	public String toString() {
		return "Viaje [codigo=" + codigo + ", nombre=" + nombre + ", horaini="
				+ horaini + ", horafin=" + horafin + ", numparadas="
				+ numparadas + ", paradas=" + Arrays.toString(paradas) + "Coste viaje=" + costeviaje + "]";
	}
	public void añadirParada(Parada p){	
		
		paradas[this.numparadas] = p;
		++this.numparadas;
	
	}
	
	public void quitarParada(Parada p){	
		
		paradas[this.numparadas] = p;
		--this.numparadas;
	
	}
				
	/* Numero total de horas que hay entre las dos Fechas */ 
	public static double cantidadTotalMinutos(Calendar fechaInicial ,Calendar fechaFinal){ 
		totalHoras=((fechaFinal.getTimeInMillis()-fechaInicial.getTimeInMillis())/1000/60); 
		return totalHoras/60; 
	}
	
	public static Date StringToDate(String fecha,String caracter,int op){ 
		String formatoHora=" HH:mm:ss"; 
		String formato="yyyy"+caracter+"MM"+caracter+"dd"+formatoHora; 
		if(op==1) 
		formato="yyyy"+caracter+"dd"+caracter+"MM"+formatoHora; 
		else if(op==2) 
		formato="MM"+caracter+"yyyy"+caracter+"dd"+formatoHora; 
		else if(op==3) 
		formato="MM"+caracter+"dd"+caracter+"yyyy"+formatoHora; 
		else if(op==4) 
		formato="dd"+caracter+"yyyy"+caracter+"MM"+formatoHora; 
		else if(op==5) 
		formato="dd"+caracter+"MM"+caracter+"yyyy"+formatoHora; 
		SimpleDateFormat sdf = new SimpleDateFormat(formato, Locale.getDefault()); 
		Date fechaFormato=null; 
		try { sdf.setLenient(false); fechaFormato=sdf.parse(fecha); 
		} catch (ParseException ex) {
			
		} return fechaFormato; 
	
	}
	
	public static double coste(int numparadas, double totalHoras, int precioactividad){
	
		/*Un método coste() en la clase Viaje que calcula el precio mínimo del viaje, que incluye:

		    50€ por cada hora del viaje.
		    10€ por cada parada.
		    El precio de las actividades en el caso de una ParadaActividad.*/
		
		costeviaje = (numparadas * 10) + (totalHoras * 50) + precioactividad;
		return costeviaje;

	}
	public static void main(String[] args) { 
		//llamamos el metodo StringToDate para convertir la cadena en un objeto de la clase date
		Date horaini= Viaje.StringToDate("2014/10/09 19:59:44", "/", 0);
		Date horafin= Viaje.StringToDate("2014/10/09 22:35:46", "/", 0); 
		//Creamos una instancia de la clase calendar
		Calendar calFechaInicial=Calendar.getInstance();
		Calendar calFechaFinal=Calendar.getInstance(); 
		//Le pasamos el objeto Date al metodo setTime
		calFechaInicial.setTime(horaini); 
		calFechaFinal.setTime(horafin); 

		System.out.println("Numero Total de Horas entre las dos Fechas: "+ cantidadTotalMinutos(calFechaInicial,calFechaFinal));
		
		System.out.println("Coste del viaje: " + coste(10, 2.6, 12));
				
	} 
	
}
