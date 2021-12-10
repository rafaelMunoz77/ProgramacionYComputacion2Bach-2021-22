package tutorialJava.capitulo5_Arrays_y_colecciones_de_datos.ejercicios.bloque03_Ordenacion;

public class OrdenacionPorBurbuja {

	public static void main(String[] args) {
		int array[] = new int[8];
		int aux;
		boolean hayIntercambios;
		
		// Inicializo el array
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 100);
		}

		// Muestro en pantalla
		System.out.print("Array: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		// Algoritmo de la burbuja
		do {
			hayIntercambios = false;
			for (int i = 0; i < (array.length-1); i++) {
				if (array[i + 1] < array[i]) {
					aux = array[i];
					array[i] = array[i+1];
					array[i+1] = aux;
					hayIntercambios = true;
				}
			}
		} while (hayIntercambios == true);
		
		
		// Muestro en pantalla
		System.out.print("Array: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
	}

}
