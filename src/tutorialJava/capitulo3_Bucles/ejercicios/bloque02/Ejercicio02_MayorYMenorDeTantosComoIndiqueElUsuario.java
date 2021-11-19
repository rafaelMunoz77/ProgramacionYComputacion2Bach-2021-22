package tutorialJava.capitulo3_Bucles.ejercicios.bloque02;

import java.util.Scanner;

public class Ejercicio02_MayorYMenorDeTantosComoIndiqueElUsuario {

	public static void main(String[] args) {
		// Declaración de variables
		int cantidadNumsAIntroducir, num, mayor = 0, menor = 0;
		Scanner sc = new Scanner(System.in);
		
		// Pido la cantidad de números al usuario
		System.out.println("Por favor, introduzca cantidad de números: ");
		cantidadNumsAIntroducir = sc.nextInt();
		
		
		// Bucle que se repite tantas veces como ha indicado el usuario
		for (int i = 0; i < cantidadNumsAIntroducir; i++) {
			System.out.println("Introduzca un número: ");
			num = sc.nextInt();
			
			// Cuando la i es igual a cero se trata de la primera vez que
			// este bucle se ejecuta
			if (i == 0) {
				mayor = num;
				menor = num;
			}
			// En el resto de los casos sigo el algoritmo normal
			else {
				// Compruebo si el número introducido es mayor que el actual mayor
				if (num > mayor) {
					mayor = num;
				}
				// Hago lo mismo con el menor
				if (num < menor) {
					menor = num;
				}
			}
			
		}
		
		// Sacar el consola el mayor y el menor
		System.out.println("Mayor: " + mayor + " - Menor: " + menor);
		

	}

}
