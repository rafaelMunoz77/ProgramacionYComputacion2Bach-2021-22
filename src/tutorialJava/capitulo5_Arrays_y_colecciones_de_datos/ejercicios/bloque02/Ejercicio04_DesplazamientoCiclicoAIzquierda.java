package tutorialJava.capitulo5_Arrays_y_colecciones_de_datos.ejercicios.bloque02;

public class Ejercicio04_DesplazamientoCiclicoAIzquierda {
	
	public static void main (String args[]) {
		int array[] = new int[] {1, 2, 3, 4, 5};
		int aux;
		
		// Imprimir en la consola antes de la rotación
		System.out.print("Array: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		// Rotación cíclica
		aux = array[array.length-1];
		for (int i = array.length - 2; i >= 0; i--) {
			array[i + 1] = array[i];
		}
		array[0] = aux;

		// Imprimir en la consola después de la rotación
		System.out.print("Array: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	
	}
}
