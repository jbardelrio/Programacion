package Libro;

import java.util.Scanner;

import graphics2.*;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class JuegoAhorcado {
		
		
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
					switch (fallos) {
					case 1:
						base ();
						break;
					case 2:
						cabeza ();
						break;
					case 3:
						cuerpo ();
						break;
					case 4:
						brazos ();
						break;
					case 5:
						piernas ();
						break;

					default:
						break;
					}
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
		public static void base() {
			Rectangle rectangulo;
			rectangulo = new Rectangle(100, 75, 250, 25);
			rectangulo.fill();
			Rectangle rectangulo2;
			rectangulo2 = new Rectangle(100, 75, 25, 500);
			rectangulo2.fill();
			Rectangle rectangulo3;
			rectangulo3 = new Rectangle(50, 575, 150, 25);
			rectangulo3.fill();
		}
		public static void cabeza() {
			Ellipse cabeza;
			cabeza = new Ellipse(300, 100, 70, 70);
			cabeza.draw();
		}
		public static void cuerpo() {
			Rectangle cuello;
			cuello = new Rectangle(330, 170, 15, 25);
			cuello.fill();
			Rectangle cuerpo;
			cuerpo = new Rectangle(300, 195, 70, 100);
			cuerpo.fill();
		}
		public static void brazos() {
			Rectangle uno;
			uno = new Rectangle(240, 195, 60, 15);
			uno.fill();
			Rectangle dos;
			dos = new Rectangle(370, 195, 60, 15);
			dos.fill();
		}
		public static void piernas() {
			Rectangle cuerpo;
			cuerpo = new Rectangle(150, 150, 25, 200);
			cuerpo.fill();
		}
		
}


