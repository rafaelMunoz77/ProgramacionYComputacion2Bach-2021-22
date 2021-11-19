package tutorialJava.capitulo3_Bucles.ejercicios.bloque02;

import java.util.Scanner;

public class Ejercicio01_MediaDeNumerosTantosComoIndiqueElUsuario {

	public static void main(String[] args) {
		// Declaración de variables
		int cantidadNumsAIntroducir, num, suma = 0;
		float media;
		Scanner sc = new Scanner(System.in);
		
		// Pido la cantidad de números al usuario
		System.out.println("Por favor, introduzca cantidad de números: ");
		cantidadNumsAIntroducir = sc.nextInt();
		
		// Bucle que se repite tantas veces como ha indicado el usuario
		for (int i = 0; i < cantidadNumsAIntroducir; i++) {
			System.out.println("Introduzca un número: ");
			num = sc.nextInt();
			// Agrego este número a la suma
			suma += num;	
		}
		
		// Cálculo de la media
		media = suma / (float) cantidadNumsAIntroducir;
		// Muestro el resultado
		System.out.println("Media: " + media);

	}

}
