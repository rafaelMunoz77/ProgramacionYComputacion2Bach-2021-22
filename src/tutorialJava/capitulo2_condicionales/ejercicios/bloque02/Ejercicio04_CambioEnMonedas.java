package tutorialJava.capitulo2_condicionales.ejercicios.bloque02;

import java.util.Scanner;

public class Ejercicio04_CambioEnMonedas {

	public static void main(String[] args) {
		int cantidadAPagar, cantidadPagada, aDevolver;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca la cantidad a pagar: ");
		cantidadAPagar = sc.nextInt();
		System.out.println("Introduzca la cantidad pagada: ");
		cantidadPagada = sc.nextInt();
		
		aDevolver = cantidadPagada - cantidadAPagar;
		
		System.out.println((aDevolver / 100) + " monedas de 100");
		aDevolver = aDevolver % 100;
		System.out.println((aDevolver / 50) + " monedas de 50");
		aDevolver = aDevolver % 50;
		System.out.println((aDevolver / 25) + " monedas de 25");
		aDevolver %= 25;
		System.out.println((aDevolver / 5) + " monedas de 5");
		aDevolver %= 5;
		System.out.println(aDevolver + " monedas de 1");

	}

}
