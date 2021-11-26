package tutorialJava.capitulo5_Arrays_y_colecciones_de_datos;

public class Ejemplo01_PrimerEjemploArray {

	public static void main(String[] args) {
		// Ejemplo de declaración de un arrar
		int array[] = new int[5];
		
		// Asignamos valores a los elementos del array
		array[0] = 89;
		array[1] = 61;
		array[2] = 7;
		array[3] = 52;
		array[4] = 21;
		
		// Obtenemos los valores del array
		System.out.println("Array[0]: " + array[0]);
		System.out.println("Array[1]: " + array[1]);
		System.out.println("Array[2]: " + array[2]);
		System.out.println("Array[3]: " + array[3]);
		System.out.println("Array[4]: " + array[4]);

	}

}
