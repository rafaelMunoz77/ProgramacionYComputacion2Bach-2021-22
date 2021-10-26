package tutorialJava.capitulo2_condicionales;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class EjemploMenu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion, numero1, numero2;
		
		System.out.println("Menú:");
		System.out.println("1.- Suma");
		System.out.println("2.- Resta");
		System.out.println("3.- Multiplicación");
		System.out.println("4.- División");
		
		System.out.println("Introduzca la opción: ");
		opcion = sc.nextInt();
		
		System.out.println("Introduzca el primer número: ");
		numero1 = sc.nextInt();
		System.out.println("Introduzca el segundo número: ");
		numero2 = sc.nextInt();
		
		
		switch(opcion) {
		case 1:
			System.out.println("La suma vale: " + (numero1 + numero2));
			break;
		case 2:
			System.out.println("La resta vale: " + (numero1 - numero2));
			break;
		case 3:
			System.out.println("La multiplicación vale: " + (numero1 * numero2));
			break;
		case 4:
			System.out.println("La división vale: " + (numero1 / numero2));
			break;
		}
	}

}
