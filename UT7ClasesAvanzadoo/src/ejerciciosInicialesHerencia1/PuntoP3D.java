package ejerciciosInicialesHerencia1;

public class PuntoP3D extends PuntoP {

	public int z;
	
	void p(){
		this.z=5;//Al heredar del PuntoP, donde X e Y son PRIVATE, solo puedo usar la Z de esta misma clase
		this.setX(6);//Como ahora hemos generado los getters y los setters en PUNTOP para X e Y, puedo acceder a ellos aún siendo privados de este modo
	}
	
	
	public int getZ() {
		return z;
	}


	public void setZ(int z) {
		this.z = z;
	}


	public static void main(String[] args) {
		
		PuntoP p1 = new PuntoP();
		
		PuntoP3D p2 = new PuntoP3D();
		
		p1.setX(5);
		p1.setY(4);
		
		p2.setX(5);
		p2.setY(4);
		p2.setZ(7);
		
		System.out.println(p1);
		System.out.println(p2);

	}

	@Override
	public String toString() {
		return "PuntoP3D [z=" + z + ", x=" + getX() + ", y=" + getY() 
				+ "]";
	}
	
	

}
