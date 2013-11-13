package graphics;


public class SemaforoCalculos {

	public static void main(String[] args) {
		Rectangle caja,palo;
		Ellipse verde,ambar,rojo;
		int ancho, alto, centro_x,centro_y, diametro_disco;
		
		ancho=150;
		alto=300;
		centro_x=300;
		centro_y=300;
		diametro_disco=ancho/2;
		
		caja = new Rectangle(centro_x-ancho/2, centro_y-alto/2, ancho, alto);
		caja.draw();
		
		palo = new Rectangle(centro_x-ancho/5/2, centro_y+alto/2, ancho/5, alto);
		palo.draw();
		
		palo.fill();
		
		verde=new Ellipse(centro_x-diametro_disco/4, centro_y+diametro_disco/2, diametro_disco/2,  diametro_disco/2 );
		verde.setColor(new Color(0,200,0));
		ambar=new Ellipse(centro_x-diametro_disco/4, centro_y-diametro_disco/2, diametro_disco/2,  diametro_disco/2);
		ambar.setColor(new Color(255,255,0));
		rojo=new Ellipse(centro_x-diametro_disco/4, centro_y-diametro_disco*1.5, diametro_disco/2,  diametro_disco/2);
		rojo.setColor(new Color(255,0,0));

		verde.fill();
		ambar.fill();
		rojo.fill();

	}

}
