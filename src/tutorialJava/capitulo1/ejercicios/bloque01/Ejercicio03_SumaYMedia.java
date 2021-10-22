package tutorialJava.capitulo1.ejercicios.bloque01;

import java.util.Scanner;

public class Ejercicio03_SumaYMedia {

	public static void main(String[] args) {
		int num1, num2, num3, suma;
		float media;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca el primer número: ");
		num1 = sc.nextInt();

		System.out.println("Introduzca el segundo número: ");
		num2 = sc.nextInt();
		
		System.out.println("Introduzca el tercer número: ");
		num3 = sc.nextInt();
	
		suma = num1 + num2 + num3;
		System.out.println("La suma es: " + suma);

		media = suma / 3f;
		System.out.println("La media es: " + media);
	}

}
