package Libro;

import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class JuegoAhorcado {

		/**
		 * @param args
		 */
		public static void main(String[] args) {
			Scanner entrada=new Scanner(System.in);
			JPasswordField jpf=new JPasswordField();
			JOptionPane.showConfirmDialog(null, jpf,"Palabra Secreta",JOptionPane.OK_OPTION);
			String palabra=String.valueOf(jpf.getPassword());
			StringBuffer adivinada=new StringBuffer();
			for(int i=0;i<palabra.length();i++) 
			{
				adivinada.append("-");
			}
//			String palabra="MONTAÑA";
//			StringBuffer adivinada=new StringBuffer("-------");
			
			int fallos=0;
			while(fallos<8 && !palabra.equals(adivinada.toString()))
			{
				//mostrar en pantalla los guiones "adivinada"
				System.out.println(adivinada);
				//pido una letra
				System.out.print("Teclea una letra: ");
				char letra=entrada.nextLine().charAt(0);
				//recorrido de la palabra buscando la letra y haciendo cambios
				boolean cambios=false;
				for(int i=0;i<palabra.length();i++)
				{
					if(palabra.charAt(i)==letra)
					{
						adivinada.setCharAt(i, letra);
						cambios=true;
					}
				}
				if(cambios==false)
				{
					fallos++;
					System.out.println("Tienes "+fallos+" fallos");
				}
			}//fin while
			if(fallos==8)
			{
				System.out.println("Eres un negao");
			}
			else
			{
				System.out.println("Correcto: Eres el mejor");
			}
			
		

	}

}
