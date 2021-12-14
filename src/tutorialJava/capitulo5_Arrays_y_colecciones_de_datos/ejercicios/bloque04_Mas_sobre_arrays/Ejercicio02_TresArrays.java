package tutorialJava.capitulo5_Arrays_y_colecciones_de_datos.ejercicios.bloque04_Mas_sobre_arrays;

public class Ejercicio02_TresArrays {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array1 = new int[5], array2 = new int[5];
		float medias[] = new float[5];
		
		// Inicializo los valores de los dos primeros arrays
		for (int i = 0; i < array1.length; i++) {
			array1[i] = obtenerNumeroAlAzar();
			array2[i] = obtenerNumeroAlAzar();
		}
		
		// Mostrar el array en pantalla
		muestraArray(array1);
		muestraArray(array2);
		
		// Calculo las medias de los dos primeros arrays
		for (int i = 0; i < array1.length; i++) {
			medias[i] = (array1[i] + array2[i]) / 2f;
		}
		
		// Muestro el array de medias
		for (int i = 0; i < medias.length; i++) {
			System.out.print(medias[i] + " ");
		}
	}
	
	
	/**
	 * 
	 * @param array
	 */
	public static void muestraArray (int array[]) {
		System.out.print("Array: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	
	
	/**
	 * 
	 * @return
	 */
	public static int obtenerNumeroAlAzar() {
		int numAzar = (int) Math.round(Math.random() * 100);
		return numAzar;
	}

}
