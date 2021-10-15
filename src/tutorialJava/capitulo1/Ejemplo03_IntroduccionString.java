package tutorialJava.capitulo1;

public class Ejemplo03_IntroduccionString {

	/**
	 * 
	 * @param args
	 */
	public static void main (String args[]) {
		
		String miCadenaDeTexto = "Mi clase de 2º de bachillerato";
		String otraCadenaDeTexto = "Otra cadena, otraaaa!!!";
		
		System.out.println("Mi cadena de texto: " + miCadenaDeTexto);
		System.out.println("Longitud de la cadena: " + miCadenaDeTexto.length());
		System.out.println("Localizando el carácter i: " + miCadenaDeTexto.indexOf('i'));
		System.out.println("Localizando el segundo carácter i: " + miCadenaDeTexto.indexOf('i', 2));
		System.out.println("Localizando el último carácter e: " + miCadenaDeTexto.lastIndexOf('e'));
		System.out.println("Subcadena: " + miCadenaDeTexto.substring(3));
		System.out.println("Otra subcadena: " + miCadenaDeTexto.substring(3, 6));
		System.out.println("En minúsculas: " + otraCadenaDeTexto.toLowerCase());
		System.out.println("En mayúsculas: " + otraCadenaDeTexto.toUpperCase());
	}
}
