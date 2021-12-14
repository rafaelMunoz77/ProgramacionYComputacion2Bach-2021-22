package tutorialJava.capitulo5_Arrays_y_colecciones_de_datos.ejercicios.bloque04_Mas_sobre_arrays;

import java.util.Scanner;

public class Ejercicio03_EliminarElementoDeArray {

	public static void main(String[] args) {
		int array[] = new int[10];
		int posicionAEliminar;
		
		// Inicializo sus valores
		for (int i = 0; i < array.length; i++) {
			array[i] = Ejercicio02_TresArrays.obtenerNumeroAlAzar();
		}

		// Muestro el array
		Ejercicio02_TresArrays.muestraArray(array);
		
		// Pregunto al usuario
		posicionAEliminar = pideEnteroAlUsuario();
		
		// Desplazo los números a la derecha de la posición que me han dado
		for (int i = posicionAEliminar + 1; i < array.length; i++) {
			array[i-1] = array[i];
		}

		// Sobrescribo con un valor al azar la última posición del array
		array[array.length-1] = Ejercicio02_TresArrays.obtenerNumeroAlAzar();
		
		// Muestro el array
		Ejercicio02_TresArrays.muestraArray(array);
	
	}
	
	
	public static int pideEnteroAlUsuario () {
		Scanner sc = new Scanner(System.in);
		int entero;
		System.out.println("Introduzca un entero: ");
		entero = sc.nextInt();
		return entero;
	}

}
