package ejemplos;

public class PruebaAnimales {

	public static void main(String[] args) {
		
		Animal mimascota = new Animal();	
		mimascota.comer();
		
		Perro miperro = new Perro();
		miperro.comer();
		miperro.ladrar();//Perro tiene el método ladrar, pero MIMASCOTA NO porque es un animal, pero no un perro, por lo que arriba no podemos usar este método
	
		Husky cañete = new Husky();
		cañete.ladrar();//Este método ahora tira del constructor de la clase HUSKY en vez del de la clase PERRO porque le hemos sobreescrito con un override
		cañete.cerrarVentana();
	}

}
