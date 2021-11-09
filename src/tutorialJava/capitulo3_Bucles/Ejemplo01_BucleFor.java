package tutorialJava.capitulo3_Bucles;

public class Ejemplo01_BucleFor {

	public static void main(String[] args) {
		
		// Cuenta adelante
		System.out.println("Cuenta adelante: ");
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		// Cuenta atrás
		System.out.println("Cuenta hacia atrás");
		for (int i = 10; i >= 0; i--) {
			System.out.println(i);
		}
		
		// Generación de números al azar del 0 al 100
		System.out.println("Generació de números al azar");
		for (int i = 0; i < 10; i++) {
			int numAzar = (int) Math.round(Math.random() * 100);
			System.out.println("Número al azar: " + numAzar);
		}

	
		// Generación de números al azar entre un mínimo y un máximo
		int minimo = -10, maximo = 10;
		System.out.println("Generació de números al azar");
		for (int i = 0; i < 10; i++) {
			int numAzar = (int) Math.round(Math.random() * (maximo - minimo) + minimo);
			System.out.println("Número al azar: " + numAzar);
		}
	
		// Suma de números generados al azar
		System.out.println("Suma de números generados al azar entre 0 y 100");
		int suma = 0;
		for (int i = 0; i < 10; i++) {
			int numAzar = (int) Math.round(Math.random() * 100);
			System.out.println("Número al azar: " + numAzar);
			suma += numAzar;
		}
		System.out.println("La suma vale: " + suma);
	}

}
