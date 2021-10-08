package tutorialJava.capitulo1;

import java.util.Scanner;

public class Ejemplo04_LecturaDeDatosDelUsuario {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un número entero: ");
		int numero1 = sc.nextInt();
		System.out.println("El número introducido es: " + numero1);
		
		System.out.println("Introduzca un número flotante: ");
		float numero2 = sc.nextFloat();
		System.out.println("El número introducido es: " + numero2);
	}


}
