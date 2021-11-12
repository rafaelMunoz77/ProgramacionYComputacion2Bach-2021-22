package tutorialJava.capitulo3_Bucles.ejercicios.bloque01;

import java.util.Scanner;

public class Ejercicio02_SumaDeTantosNumerosComoIndiqueUsuario {

	public static void main(String[] args) {
		int suma = 0, num, repeticiones;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca cuántos números desea incorporar a la suma: ");
		repeticiones = sc.nextInt();
		
		for (int i = 0; i < repeticiones; i++) {
			System.out.println("Introduzca un número");
			num = sc.nextInt();
			if (num > 10) {
				suma = suma + num;
			}
		}		

		System.out.println("La suma de los mayores de 10 vale: " + suma);
	}

}
