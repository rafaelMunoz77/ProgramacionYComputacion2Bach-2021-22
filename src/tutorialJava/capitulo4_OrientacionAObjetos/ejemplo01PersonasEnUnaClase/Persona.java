package tutorialJava.capitulo4_OrientacionAObjetos.ejemplo01PersonasEnUnaClase;

public class Persona {
	
	// Declaración de las propiedades de cada persona
	int alturaCm;
	int pesoKg;
	String nombre;
	String colorPelo;
	
	// Acciones concretas que sirven para construir el objeto. Se llaman Constructores
	public Persona( ) {
	}

	public Persona (int newAlturaCm, int newPesoKg, String newNombre, String newColorPelo) {
		alturaCm = newAlturaCm;
		pesoKg = newPesoKg;
		nombre = newNombre;
		colorPelo = newColorPelo;
	}
	
	// Acciones que puede realizar una persona
	public void imprimePropiedades() {
		System.out.println("Las propiedades de la persona son alturaCm: " + alturaCm +
				" pesoKg: " + pesoKg + " nombre: " + nombre + " colorPelo: " + colorPelo);
	}
}
