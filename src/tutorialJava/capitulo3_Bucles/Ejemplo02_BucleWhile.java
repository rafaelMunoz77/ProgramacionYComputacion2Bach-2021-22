package tutorialJava.capitulo3_Bucles;

import java.util.Scanner;

public class Ejemplo02_BucleWhile {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		//ejemploWhileCuentaAdelante();
		//ejemploWhilePideNumerosHastaCero();
		//ejemploDoWhilePideNumerosHastaCero();
		ejemploDoWhileMenu();
		
	}

	/**
	 * Es un ejemplo de una cuenta adelante con un while
	 */
	public static void ejemploWhileCuentaAdelante() {
		int i = 0;
		
		while (i < 10) {
			System.out.println("i: " + i);
			i++;
		}
	}
	
	/**
	 * 
	 */
	public static void ejemploWhilePideNumerosHastaCero() {
		Scanner sc = new Scanner(System.in);
		int num = 1;
		
		while (num != 0) {
			System.out.println("Introduzca número: ");
			num = sc.nextInt();
			
			System.out.println("Has introducido el: " + num);
		}
	}
	
	/**
	 * 
	 */
	public static void ejemploDoWhilePideNumerosHastaCero() {
		Scanner sc = new Scanner(System.in);
		int num;
		
		do {
			System.out.println("Introduzca número: ");
			num = sc.nextInt();
			
			System.out.println("Has introducido el: " + num);
		} while (num != 0);
	}
	
	
	/**
	 * 
	 */
	public static void ejemploDoWhileMenu () {
		Scanner sc = new Scanner(System.in);
		int opcion, num1, num2;
		
		do {
			System.out.println("\nMenú" +
					"\n0. Salir" + 
					"\n1. Sumar" +
					"\n2. Restar" +
					"\n\nIntroduzca opción: ");
			opcion = sc.nextInt();
			
			switch (opcion) {
			case 0:
				System.out.println("Adios");
				break;
			case 1:
				System.out.println("Introduzca el primer número: ");
				num1 = sc.nextInt();
				System.out.println("Introduzca el segundo número: ");
				num2 = sc.nextInt();
				System.out.println("El valor de la suma es: " + (num1 + num2));
			}
		} while (opcion != 0);
	}
}
