package Libro;

import java.awt.Font;
import java.util.Scanner;

import graphics2.*;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class JuegoAhorcado {
		
		
		public static void main(String[] args) {
			int tx = 10;
			Scanner entrada=new Scanner(System.in);
			JPasswordField jpf=new JPasswordField();
			JOptionPane.showConfirmDialog(null, jpf,"Palabra Secreta",JOptionPane.OK_OPTION);
			String palabra=String.valueOf(jpf.getPassword());
			StringBuffer adivinada=new StringBuffer();
			for(int i=0;i<palabra.length();i++) 
			{
				adivinada.append(" ");
			}
			for(int i=0;i<palabra.length();i++) 
			{
				Text lineas;
				lineas = new Text (tx, 30, "-");
				lineas.grow(20, 30);
				lineas.setColor(Color.RED);
				lineas.draw();
				tx = tx + 40;
			}

			
			int fallos=0;
			while(fallos<8 && !palabra.equals(adivinada.toString()))
			{
				Text numfallos;
				//mostrar en pantalla los guiones "adivinada"
				System.out.println(adivinada);
				//pido una letra
				char letra = JOptionPane.showInputDialog(null,"Teclea una letra").charAt(0);
				//Record de la palabra buscando la letra y haciendo cambios
				boolean cambios=false;
				for(int i=0;i<palabra.length();i++)
				{
					if(palabra.charAt(i)==letra)
					{
						adivinada.setCharAt(i, letra);
						Text adivin;
						adivin = new Text (50, 50,  ""+ adivinada + "" );
						adivin.grow(30, 30);
						adivin.draw();
						Canvas.pause();
						adivin.undraw();
						cambios=true;
					}
				}
				
				if(cambios==false)
				{
					fallos++;
					numfallos = new Text (350, 550, "Tienes " + fallos + " fallos");		
					numfallos.grow(50, 50);
					numfallos.setColor(Color.BLUE);
					numfallos.draw();
					Canvas.pause();
					numfallos.undraw();
					System.out.println("Tienes "+ fallos +" fallos");
					switch (fallos) {
					case 0:
						break;
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
						piernas1 ();
						break;
					case 6:
						piernas2 ();
						break;
					case 7:
						faltauno ();
						break;
					case 8:
						perdedor ();
						break;

					default:
						break;
					}
					
				}
				
			}//fin while
			if(fallos==8)
			{
				System.out.println("Eres el peor");
			}
			else
			{
				Text ganador;
				ganador = new Text (300, 300, "ERES EL MEJOR");
				ganador.grow(120, 140);
				ganador.setColor(Color.RED);
				ganador.draw();
				System.out.println("Eres el mejor");
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
			cabeza.setThickness(10f); 
			cabeza.setColor(Color.YELLOW);
			cabeza.draw();
			Ellipse ojo1;
			ojo1 = new Ellipse(320, 120, 5, 5);
			ojo1.setColor(Color.BLACK);
			ojo1.draw();
			Ellipse ojo2;
			ojo2 = new Ellipse(340, 120, 5, 5);
			ojo2.setColor(Color.BLACK);
			ojo2.draw();
			Rectangle boca;
			boca = new Rectangle (320, 140, 25, 5);
			boca.setColor(Color.RED);
			boca.draw();
		}
		public static void cuerpo() {
			Rectangle cuello;
			cuello = new Rectangle(330, 170, 15, 25);
			cuello.fill();
			Rectangle cuerpo;
			cuerpo = new Rectangle(300, 195, 70, 110);
			cuerpo.setColor(Color.GREEN);
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
		public static void piernas1() {
			Rectangle pierna1;
			pierna1 = new Rectangle(300, 300, 25, 100);
			pierna1.setColor(Color.BLUE);
			pierna1.fill();
		}
		public static void piernas2() {
			Rectangle pierna2;
			pierna2 = new Rectangle(345, 300, 25, 100);
			pierna2.setColor(Color.BLUE);
			pierna2.fill();
		}
		public static void faltauno() {
			Text faltauno;
			faltauno = new Text (400, 40, "UN FALLO MÁS Y ADIOS...");
			faltauno.grow(90, 70);
			faltauno.setColor(Color.RED);
			faltauno.draw();
		}
		public static void perdedor() {
			Text perdedor;
			perdedor = new Text (300, 300, "ERES EL PEOR");
			perdedor.grow(120, 140);
			perdedor.setColor(Color.RED);
			perdedor.draw();
		}
		
}


