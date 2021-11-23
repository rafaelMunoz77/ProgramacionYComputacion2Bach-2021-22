package tutorialJava.capitulo3_Bucles;

import java.util.Scanner;

public class Ejemplo03_NumerosPrimosConFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		boolean numeroEsPrimo = true;
		
		System.out.println("Dame el número: ");
		num = sc.nextInt();
		
		
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				numeroEsPrimo = false;
			}
		}

		// Cuando acabe el bucle for, tendre una variable booleana que me
		// indicará si el número es primo o no lo es
		if (numeroEsPrimo == true) {
			System.out.println("El número " + num + " es primo");
		}
		else {
			System.out.println("El número " + num + " es compuesto");
		}
	}

}
