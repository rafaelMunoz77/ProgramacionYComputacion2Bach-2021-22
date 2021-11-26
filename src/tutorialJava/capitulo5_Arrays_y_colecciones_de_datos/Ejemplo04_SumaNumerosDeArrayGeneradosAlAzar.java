package tutorialJava.capitulo5_Arrays_y_colecciones_de_datos;

public class Ejemplo04_SumaNumerosDeArrayGeneradosAlAzar {

	public static void main(String[] args) {
		// Declaro el array
		int array[] = new int[5];
		// Variable "suma" que almacenará el resultado de la suma
		int suma = 0;
		
		// Inicializar los valores del array
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 100);
		}

		// Saco en consola los valores del array
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		// Suma los números, por ejemplo, 21, 33, 10, 9, 24
		for (int i = 0; i < array.length; i++) {
			suma = suma + array[i];
		}
		
		// Muestro en la consola el resultado
		System.out.println("Suma: " + suma);
	}

}
