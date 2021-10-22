package tutorialJava.capitulo1.ejercicios.bloque01;

import java.util.Scanner;

public class Ejercicio04_IntercambioDeDosValores {

	public static void main(String[] args) {
		int num1, num2, aux;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca la primera variable: " );
		num1 = sc.nextInt();
		
		System.out.println("Introduzca la segunda variable: " );
		num2 = sc.nextInt();
		
		System.out.println("Num1: " + num1 + " - Num2: " + num2);
		
		aux = num1;
		num1 = num2;
		num2 = aux;

		System.out.println("Num1: " + num1 + " - Num2: " + num2);	
	}

}
