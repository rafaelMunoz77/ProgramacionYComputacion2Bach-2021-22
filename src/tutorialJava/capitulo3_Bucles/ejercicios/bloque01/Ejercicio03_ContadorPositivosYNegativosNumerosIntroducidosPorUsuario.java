package tutorialJava.capitulo3_Bucles.ejercicios.bloque01;

import java.util.Scanner;

public class Ejercicio03_ContadorPositivosYNegativosNumerosIntroducidosPorUsuario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int repeticiones, num, contadorPositivos = 0, contadorNegativos = 0;
		
		System.out.println("¿Cuántos números desea introducir? ");
		repeticiones = sc.nextInt();
		
		for (int i = 0; i < repeticiones; i++) {
			System.out.println("Introduzca un número: ");
			num = sc.nextInt();
			if (num > 0) {
				contadorPositivos++;
			}
			if (num < 0) {
				contadorNegativos++;
			}
		}
		
		System.out.println("Positivos: " + contadorPositivos + " - Negativos: " +
				contadorNegativos);

	}

}
