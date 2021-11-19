package tutorialJava.capitulo3_Bucles.ejercicios.bloque03;

import java.util.Scanner;

public class Ejercicio01_SumaYMediaDeNumerosDeUsuarioHastaCero {

	public static void main(String[] args) {
		// Declaración de variables
		Scanner sc = new Scanner(System.in);
		int num = 1, suma = 0;
		float media = 0;
		
		// Pido números dentro del bucle
		for (int i = 0; num != 0; i++) {
			// Pido el número
			System.out.println("Introduzca un número: ");
			num = sc.nextInt();
			
			// Agrego el número a la suma
			suma += num;
			
			// Calculo la media
			if (num != 0) {
				media = suma / (float) (i + 1);
			}
		}
		
		// Muestro la media
		System.out.println("La media vale: " + media);
	}

}
