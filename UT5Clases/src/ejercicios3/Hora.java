package ejercicios3;
/*
 * Ejercicio 1 Escribe una clase llamada Hora que tenga como atributos la hora, los minutos y los segundos 
 * (números enteros). Un constructor inicializará estos datos a 0 y otro los inicializará a valores pasados
 *  por parámetro. Un método de la clase devolverá la cadena con formato: 12:45:32. 
 *  Otro método, que tendrá un argumento de tipo Hora, sumará dicha hora a la propia. Por ejemplo:

[...]
mihora=new Hora(12,45,32);
unahoraycuarto=new Hora(1,15,0);
mihora.suma(unahoraycuarto);
System.out.println(mihora.aCadena());
[...]

14:00:32

Para probar la clase crea un main() con dos objetos inicializados a una hora determinada. 
Crea otro sin inicializar y súmale las dos anteriores. Visualiza el valor de las dos horas y el resultante.
 */
public class Hora {

	private int hor;
	private int min;
	private int seg;
	
	public Hora() {
		hor = 0;
		min = 0;
		seg = 0;
	}
	public Hora(int hor, int min, int seg) {
		if ( hor>=0 && hor<=24 && min>=1 && min<=60 && seg >=1 && seg<=60)
        {   this.hor = hor;
            this.min = min;
            this.seg = seg;
        }
        else{
            this.hor = 0;
            this.min = 0;
            this.seg = 0;
        }
	}
	
	public int getHor() {
		return hor;
	}
	public void setHor(int hor) {
		if ( hor>=0 && hor<=24)  this.hor = hor;
        else this.hor=0;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		if (  min>=1 && min<=60 )
        {  
        this.min = min;
        }
     else this.min = 0;
	}
	public int getSeg() {
		return seg;
	}
	public void setSeg(int seg) {
		if (  seg>=1 && seg<=60 )
        {  
        this.seg = seg;
        }
     else this.seg = 0;
	}
	
	public String toString(){
		return ""+this.hor+":"+this.min+":"+this.seg;
	}


	
	private Hora suma(int hor, int min, int seg) {
		Hora mihora;
		mihora=new Hora(12,45,32);
		
		return mihora;
			
		
	}
	
	public static void main(String[] args) {
		Hora unahoraycuarto;
		unahoraycuarto=new Hora(1,15,0);
		
		//System.out.println(Hora.suma(unahoraycuarto));
	}
	
}
