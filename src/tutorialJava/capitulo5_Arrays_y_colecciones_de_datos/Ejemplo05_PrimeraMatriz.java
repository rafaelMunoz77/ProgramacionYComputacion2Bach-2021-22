package tutorialJava.capitulo5_Arrays_y_colecciones_de_datos;

public class Ejemplo05_PrimeraMatriz {

	public static void main(String[] args) {
		// Declaración de una matriz de 3 x 3
		int matriz[][] = new int[3][3];

		// Inicializar los valores dentro de la matriz
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = (int) Math.round(Math.random() * 100);
			}
		}
		
		System.out.println("Matriz inicializada");
		
		// Visualizar los elementos de la matriz en la consola
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}

}
