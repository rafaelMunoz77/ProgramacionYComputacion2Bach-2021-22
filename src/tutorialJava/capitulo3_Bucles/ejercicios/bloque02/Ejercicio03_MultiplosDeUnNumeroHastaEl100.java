package tutorialJava.capitulo3_Bucles.ejercicios.bloque02;

import java.util.Scanner;

public class Ejercicio03_MultiplosDeUnNumeroHastaEl100 {

	public static void main(String[] args) {
		// Declaración de variables
		int num;
		Scanner sc = new Scanner(System.in);
		
		// Pido el número al usuario
		System.out.println("Por favor, introduzca un número: ");
		num = sc.nextInt();

		// Generar los múltiplo con un bucle for
		for (int i = 0; (num * i) < 100; i++) {
			System.out.println("Múltiplo de " + num + ": " + (num * i));
		}
	}

}
