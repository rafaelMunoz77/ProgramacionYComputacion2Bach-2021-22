package tutorialJava.capitulo1.ejercicios.bloque01;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Consigo leer del teclado.
		
		System.out.println("Introduzca un número entero: ");
		int numEntero = sc.nextInt();
		System.out.println("El número entero es " + numEntero);
		
		System.out.println("Introduzca un número flotante: ");
		float numFlotante = sc.nextFloat();
		System.out.println("El número flotante es " + numFlotante);
		
		System.out.println("Introduzca un número double: ");
		double numDouble = sc.nextDouble();
		System.out.println("El número double es: " + numDouble);
		
	}

}
