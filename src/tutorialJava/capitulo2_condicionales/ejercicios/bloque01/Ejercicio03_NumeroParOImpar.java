package tutorialJava.capitulo2_condicionales.ejercicios.bloque01;

import java.util.Scanner;

public class Ejercicio03_NumeroParOImpar {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int num;
		
		System.out.println("Introduzca el número: ");
		num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("El número " + num + " es par");
		}
		else {
			System.out.println("El número " + num + " es impar");
		}
	}

}
