package tutorialJava.capitulo1;

public class Ejemplo03_IntroduccionString {

	/**
	 * 
	 * @param args
	 */
	public static void main (String args[]) {
		
		String cadenaCarac = "Tutorial de Lenguaje de ProgramaciÃ³n Java 8."; // CreaciÃ³ de una cadena de caracteres
		 
		System.out.println("Valor de cadenaCarac: " + cadenaCarac);  // Imprime una cadena de caracteres
		System.out.println("Longitud de cadenaCarac: " + cadenaCarac.length()); // Imprime l alongitud de una cadena
		System.out.println("LocalizaciÃ³n por caracteres: " + cadenaCarac.indexOf("Lenguaje")); // Ã�ndice en el que encontramos una cadena
		System.out.println("LocalizaciÃ³n por Ã­ndices: " + cadenaCarac.charAt(12)); // CarÃ¡cter encontrado en el Ã­ndice 12, empezando por 0 
		System.out.println("Uso de subcadenas: " + cadenaCarac.substring(12, 20)); // Obtener una subcadena dentro de una cadena
		System.out.println("Uso de toLower: " + cadenaCarac.toLowerCase()); // Convertir una cadena de caracteres en minÃºscula
		System.out.println("Uso de toUpper: " + cadenaCarac.toUpperCase()); // Convertir una cadena de caracteres en mayÃºscula.
	}
}
