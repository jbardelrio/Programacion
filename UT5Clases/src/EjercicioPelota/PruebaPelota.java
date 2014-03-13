package EjercicioPelota;
import graphics2.*;
public class PruebaPelota{
public static void main(String[] args) throws InterruptedException{

Pelota p;
p=new Pelota();
p.setLimites(10,10,410,400);
(new Rectangle(10,10,400,400)).draw();
//p.setPaso(5);
p.dibuja();

	while (true) {
	p.mueve();
	Thread.sleep(50);
	}
	
}
}