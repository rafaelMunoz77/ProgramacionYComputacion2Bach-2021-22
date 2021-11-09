package tutorialJava.capitulo2_condicionales.ejercicios.bloque02;

import java.util.Scanner;

public class Ejercicio02_CalculadoraAvanzada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		int opcion;
		
		System.out.println("Menú de la calculadora");
		System.out.println("\n1.- Potencia");
		System.out.println("2.- Raíz");
		System.out.println("3.- Módulo");
		System.out.println("\n\tIntroduzca opción: ");
		
		opcion = sc.nextInt();
		
		switch (opcion) {
		case 1: // Cálculo de la potencia
			System.out.println("Introduzca la base de la potencia: ");
			num1 = sc.nextInt();
			System.out.println("Introduzca el exponente: ");
			num2 = sc.nextInt();
			System.out.println("La potencia vale: " + Math.pow(num1, num2));
		case 2: // Raíz
			System.out.println("Introduzca el radicando: ");
			num1 = sc.nextInt();
			System.out.println("Introduzca el índice: ");
			num2 = sc.nextInt();
			System.out.println("El radical vale: " + Math.pow(num1, 1f / num2));
		case 3: // Módulo de la división entera
			System.out.println("Introduzca el dividendo: ");
			num1 = sc.nextInt();
			System.out.println("Introduzca el divisor: ");
			num2 = sc.nextInt();
			System.out.println("El módulo vale: " + (num1 % num2));
		}
	}

}
