package tutorialJava.capitulo3_Bucles;

public class Ejemplo04_NumerosPrimosEntreLimitesConFor {

	public static void main(String[] args) {
		boolean numeroEsPrimo;
		
		for (int i = 1; i < 1000; i++) {
			
			numeroEsPrimo = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					numeroEsPrimo = false;
				}
			}

			// Cuando acabe el bucle for, tendre una variable booleana que me
			// indicará si el número es primo o no lo es
			if (numeroEsPrimo == true) {
				System.out.println("El número " + i + " es primo");
			}
			
			
			
		}
		
	}

}
