package tutorialJava.capitulo3_Bucles.ejercicios.bloque02;

import java.util.Scanner;

public class Ejercicio04_MultiplosDeUnNumeroHastaLimiteEstablecidoPorUsuario {

	public static void main(String[] args) {
		// Declaración de variables
		int num, limite;
		Scanner sc = new Scanner(System.in);
		
		// Pido el número al usuario
		System.out.println("Por favor, introduzca un número: ");
		num = sc.nextInt();

		// Pido el límite al usuario
		System.out.println("Por favor, introduzca un límite: ");
		limite = sc.nextInt();

		// Generar los múltiplo con un bucle for
		for (int i = 0; (num * i) < limite; i++) {
			System.out.println("Múltiplo de " + num + ": " + (num * i));
		}
	}

}
