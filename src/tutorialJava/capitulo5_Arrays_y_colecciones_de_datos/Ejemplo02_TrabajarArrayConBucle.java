package tutorialJava.capitulo5_Arrays_y_colecciones_de_datos;

public class Ejemplo02_TrabajarArrayConBucle {

	public static void main(String[] args) {
		// Declaro el array
		int array[] = new int[15000];
		
		// Inicializar los valores del array
		for (int i = 0; i < array.length; i++) {
			array[i] = 100 + i;
		}

		// Saco en consola los valores del array
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
