package tutorialJava.capitulo5_Arrays_y_colecciones_de_datos.ejercicios.bloque05;

public class Ejercicio01_matrices {

	public static void main(String[] args) {
		int array[] = new int[] {23, 12, 67};
		
		// Declaración de una matriz de 3 x 3
		int matriz[][] = new int[][] {{1, 0, 0}, 
									  {0, 5, 0}, 
									  {0, 0, 9}};

		muestraMatriz(matriz);
		
		System.out.println("Matriz positiva: " + esMatrizPositiva(matriz));
		System.out.println("Matriz diagonal: " + esMatrizDiagonal(matriz));
	}

	
	/**
	 * 
	 * @param matriz
	 * @return
	 */
	public static boolean esMatrizDiagonal (int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if(i != j && matriz[i][j] != 0) {
					return false;
				}
			}
		}
		return true;
	}
	
	
	/**
	 * 
	 * @param matriz
	 * @return
	 */
	public static boolean esMatrizPositiva(int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] < 0) {
					return false;
				}
			}
		}
		return true;
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
