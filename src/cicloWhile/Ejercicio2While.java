package cicloWhile;

import javax.swing.JOptionPane;

public class Ejercicio2While {
	public static void main(String[]args) {
		int contador=0,numero1=0,numero2=0,menu=0,suma=0;
		String nombre="",saludo="Hola bienvenido a nuestro menu!!";
		int repetidor=Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuantas veces quiere repetir el menu"));
			while(contador<repetidor){
				
			
			menu=Integer.parseInt(JOptionPane.showInputDialog("Por favor Ingrese una de las siguiente opciones :\n\n"
					+ "1. Saludar\n"
					+ "2. Pedir Nombre de una Persona\n"
					+ "3. Sumar 2 Numeros\n"
					+ "4. Salir\n"));
			switch(menu) {
			case 1:
				JOptionPane.showMessageDialog(null, saludo);
				break;
			case 2:
				nombre=JOptionPane.showInputDialog("Ingrese un nombre por favor!!");
				JOptionPane.showMessageDialog(null,"El nombre que ingresaste es: "+ nombre);
				break;
			case 3:
				numero1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero de la operacion"));
				numero2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero de la operacion"));
				suma=numero1+numero2;
				JOptionPane.showMessageDialog(null,"La suma de los numeros es"+suma);
				break;
			case 4:
				JOptionPane.showMessageDialog(null,"Gracias por trabajar con nosotros");
				break;
			default:
				break;
				
			}
			
			contador++;
			
			}
	}
}
