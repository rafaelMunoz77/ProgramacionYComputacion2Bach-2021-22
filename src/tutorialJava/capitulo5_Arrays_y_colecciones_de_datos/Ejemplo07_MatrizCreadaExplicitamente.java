package tutorialJava.capitulo5_Arrays_y_colecciones_de_datos;

public class Ejemplo07_MatrizCreadaExplicitamente {

	public static void main(String[] args) {
		int array[] = new int[] {23, 12, 67};
		
		// Declaración de una matriz de 3 x 3
		int matriz[][] = new int[][] {{10, 20, 30}, 
									  {40, 50, 60}, 
									  {70, 80, 90}};

		muestraMatriz(matriz);
	}

	
	/**
	 * 
	 * @param matriz
	 */
	public static void muestraMatriz (int matriz[][]) {
		// Visualizar los elementos de la matriz en la consola
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}
}
