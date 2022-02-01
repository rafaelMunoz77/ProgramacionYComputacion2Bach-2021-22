package tutorialJava.capitulo4_OrientacionAObjetos.ejemplo03_ArticulosDeSupermercado;

import java.util.Scanner;

public class Principal {


	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcionElegida;
		
		// Bucle que se ejecuta hasta que lo decida el usuario
		do {
			opcionElegida = menu();
			
			switch (opcionElegida) {
			case 1: // Se va a introducir un artículo comestible
				ArtComestible artComestible = new ArtComestible();
				
				System.out.println("Introduzca el código del artículo: ");
				artComestible.setCodigo(sc.nextInt());
				
				System.out.println("Introduzca el nombre del artículo: ");
				artComestible.setNombre(sc.next());
				
				System.out.println("Introduzca el precio del artículo: ");
				artComestible.setPrecio(sc.nextFloat());
				
				System.out.println("Introduzca la fecha de caducidad del artículo: ");
				artComestible.setFechaCaducidad(sc.next());
				
				System.out.println("Artículo comestible creado " + artComestible.toString());
				
			case 2: // Se va a introducir un artículo de limpieza
				ArtLimpieza artLimpieza = new ArtLimpieza();
				
				System.out.println("Introduzca el código del artículo: ");
				artLimpieza.setCodigo(sc.nextInt());
				
				System.out.println("Introduzca el nombre del artículo: ");
				artLimpieza.setNombre(sc.next());
				
				System.out.println("Introduzca el precio del artículo: ");
				artLimpieza.setPrecio(sc.nextFloat());
				
				System.out.println("Introduzca si el artículo es ingífugo: ");
				artLimpieza.setIgnifugo(sc.nextBoolean());
				
				System.out.println("Artículo de limpieza creado " + artLimpieza.toString());
				
			}
			
		} while (opcionElegida != 0);
	}

	
	/**
	 * 
	 * @return
	 */
	public static int menu () {
		int opcion;
		Scanner sc = new Scanner(System.in);
		
		String textoMenu = "\n\n\tMENÚ" +
				"\n0.- Salir" + 
				"\n1.- Crear artículo comestible" + 
				"\n2.- Crear artículo de limpieza";
		
		System.out.println(textoMenu);
		opcion = sc.nextInt();
		return opcion;		
	}
}
