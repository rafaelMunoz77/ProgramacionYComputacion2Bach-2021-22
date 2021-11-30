package tutorialJava.capitulo5_Arrays_y_colecciones_de_datos.ejercicios.bloque01;

public class Ejercicio02_VisualizarArrayOrdenInverso {

	public static void main(String[] args) {
		int array[] = new int[10]; 
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 100);
		}

		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		for (int i = array.length-1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}
	}

}
