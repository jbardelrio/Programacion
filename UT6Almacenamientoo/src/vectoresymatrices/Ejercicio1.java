package vectoresymatrices;
/*
 * Ejercicio 1. Declara y crea un tipo de variable que sea capaz de contener el número de alumnos matriculados 
 * en 4 institutos en 5 niveles de estudios: ESO, BACHILLERATO, CGM, CGS, PCPI.
 * 
 * Instituto 	ESO	 BACHILLERATO	CGM		CGS	 PCPI
 * 	IES1		200
 *  IES2		201
 *  IES3		203
 */
public class Ejercicio1 {

	
	
	public static void main(String[] args) {
		
		int[][] numalumnos;
		numalumnos = new int[3][5];
		
		numalumnos[0][0]=11;
		numalumnos[0][1]=23;
		numalumnos[0][2]=32;
		numalumnos[0][3]=45;
		numalumnos[0][4]=70;
		
		numalumnos[1][0]=13;
		numalumnos[1][1]=35;
		numalumnos[1][2]=34;
		numalumnos[1][3]=55;
		numalumnos[1][4]=30;
		
		numalumnos[2][0]=24;
		numalumnos[2][1]=22;
		numalumnos[2][2]=45;
		numalumnos[2][3]=61;
		numalumnos[2][4]=11;

		for (int i = 0; i < numalumnos.length; i++) { 
			for (int j = 0; j < numalumnos[i].length; j++) { 
				System.out.print(numalumnos[i][j]+ " ");
			}
			System.out.println();
		}
		
	}

}
