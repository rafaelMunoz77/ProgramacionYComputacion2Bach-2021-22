package tutorialJava.capitulo2_condicionales.ejercicios.bloque01;

import java.util.Scanner;

public class Ejercicio02_MenorDeDosNumeros {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int num1, num2;
		
		System.out.println("Introduzca el primer número: ");
		num1 = sc.nextInt();

		System.out.println("Introduzca el segundo número: ");
		num2 = sc.nextInt();

		if (num1 < num2) {
			System.out.println("El menor es el " + num1);
		}
		else {
			if (num2 < num1) {
				System.out.println("El menor es el " + num2);
			}
			else {
				System.out.println("Los dos números son iguales");
			}
		}
		
	}

}
