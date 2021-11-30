package tutorialJava.capitulo5_Arrays_y_colecciones_de_datos.ejercicios.bloque01;

public class Ejercicio01_SumaMediaMayorMenorArrayGeneradoAlAzar {

	public static void main(String[] args) {
		int array[] = new int[150000];
		int suma = 0;
		float media, mayor = 0, menor = 0;

		// Inicializa los valores dentro del array
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 100);
		}

		// Calculo suma, media, mayor y menor
		for (int i = 0; i < array.length; i++) {
			suma = suma + array[i];
			if (i == 0) { // La primera iteración del bucle
				mayor = array[i];
				menor = array[i];
			}
			else { // El resto de iteraciones del bucle
				if (array[i] > mayor) {
					mayor = array[i];
				}
				if (array[i] < menor) {
					menor = array[i];
				}
			}
		}
		// Calculo de la media
		media = suma / (float) array.length;
		
		// Muestra los valores del array en la consola
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		
		System.out.println("\nLa suma de los números es: " + suma + 
				"\ny la media es: " + media + 
				"\ny el mayor es: " + mayor + " y el menor es: " + menor);
	}

}
