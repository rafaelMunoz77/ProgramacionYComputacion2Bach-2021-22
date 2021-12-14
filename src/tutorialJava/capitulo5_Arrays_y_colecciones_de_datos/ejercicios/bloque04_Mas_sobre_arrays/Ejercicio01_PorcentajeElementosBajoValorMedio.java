package tutorialJava.capitulo5_Arrays_y_colecciones_de_datos.ejercicios.bloque04_Mas_sobre_arrays;

public class Ejercicio01_PorcentajeElementosBajoValorMedio {

	public static void main(String[] args) {
		int array[] = new int[10];
		int suma = 0, contador = 0;
		float media;
		
		// Inicializo los valores del array
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 100);
		}
		
		// Muestro el array
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		// Calculo el valor medio
		for (int i = 0; i < array.length; i++) {
			suma += array[i]; 
		}
		media = suma / (float) array.length;
		System.out.println("La media vale: " + media);

		// Calculo los números bajo el valor medio
		for (int i = 0; i < array.length; i++) {
			if (array[i] < media) {
				contador++;
			}
		}
		// Tengo calculados en "contador" el número de elemntos bajo la media
		System.out.println("Porcentaje de números bajo la media: " + (contador * 100 / (float) array.length) + "%");
	}

}
