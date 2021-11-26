package tutorialJava.capitulo5_Arrays_y_colecciones_de_datos;

public class Ejemplo03_TrabajarArrayConBucleYNumerosAlAzar {

	public static void main(String[] args) {
		// Declaro el array
		int array[] = new int[15];
		
		// Inicializar los valores del array
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 100);
		}

		// Saco en consola los valores del array
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
