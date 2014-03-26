package vectoresymatrices;
import java.util.*;
/*
 * Ejercicio 5. Escribe un programa que pida 8 notas. El programa debe visualizar cuál es la nota más alta, 
 * luego la siguiente, y así sucesivamente. Si hay alguna nota repetida, se visualizará solo una vez.
 */
public class Ejercicio5 {

	public static int[] vectorMayorAMenor(int[] array) {
		int aux;
		
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] < array[j]) {
					aux = array[i];
					array[i] = array[j];
					array[j] = aux;
				}
				if(array[i] == array[j]){
					array[j] = 0;
				}
			}
		}
		
		return array;
}

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		int totalNotas = 8;
		int finalNotas = totalNotas;
		
		int guardarNotas[] = new int[totalNotas];
		
		System.out.println("Dime las notas: ");
		
		for (int i=0; i<totalNotas; i++){
			guardarNotas[i]= teclado.nextInt();
		}
		
		vectorMayorAMenor(guardarNotas);
		
		for (int i=0; i<totalNotas; i++){
			if (guardarNotas[i]==0){
				finalNotas--;
			}
		}
		
		int notasOrdenadas[] = new int [finalNotas];
		
		for (int i=0; i<finalNotas; i++){
			notasOrdenadas[i]=guardarNotas[i];
		}
		
		System.out.println("Las notas ordenadas: " + Arrays.toString(notasOrdenadas));


}

}
