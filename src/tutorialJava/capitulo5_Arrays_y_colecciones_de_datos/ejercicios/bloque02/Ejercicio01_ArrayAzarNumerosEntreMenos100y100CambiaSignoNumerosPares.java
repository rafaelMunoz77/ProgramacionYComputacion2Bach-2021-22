package tutorialJava.capitulo5_Arrays_y_colecciones_de_datos.ejercicios.bloque02;

import java.util.Iterator;

public class Ejercicio01_ArrayAzarNumerosEntreMenos100y100CambiaSignoNumerosPares {

	public static void main(String[] args) {
		int array[] = new int[10];

		// Inicializo valores del array
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * (100 - (-100)) + (-100));
		}
		
		// Imprimo en consola los valores del array
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		// Cambio de signo los valores pares
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				array[i] = -array[i];
			}
		}

		// Imprimo en consola los valores del array
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
	}

}
