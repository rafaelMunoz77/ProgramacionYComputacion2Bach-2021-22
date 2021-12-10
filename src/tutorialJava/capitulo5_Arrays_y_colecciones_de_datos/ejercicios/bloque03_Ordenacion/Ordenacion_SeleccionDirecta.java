package tutorialJava.capitulo5_Arrays_y_colecciones_de_datos.ejercicios.bloque03_Ordenacion;

public class Ordenacion_SeleccionDirecta {

	public static void main(String[] args) {
		int array[] = new int[100];
		int menorDelIntervalo, posicionDelMenor;

		// Inicializo el array
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 100);
		}

		// Muestro en pantalla el array antes de ordenar
		System.out.print("Array: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		// Comenzamos con la selección directa
		for (int i = 0; i < array.length; i++) {
			menorDelIntervalo = array[i];
			posicionDelMenor = i;
			for (int j = i; j < array.length; j++) {
				if (array[j] < menorDelIntervalo) {
					menorDelIntervalo = array[j];
					posicionDelMenor = j;
				}
			}
			// Cuando acabo el bucle de la "j" sé que en la variable
			// "posicionDelMenor" tengo cargado el valor de la posición que
			// ocupa el menor valor explorado por la variable j
			int aux = array[i];
			array[i] = array[posicionDelMenor];
			array[posicionDelMenor] = aux;
		}

		
		
		// Muestro en pantalla el array después de ordenar
		System.out.print("Array: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
	}
	

}
