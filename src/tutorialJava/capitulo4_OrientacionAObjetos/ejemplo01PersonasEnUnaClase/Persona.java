package tutorialJava.capitulo4_OrientacionAObjetos.ejemplo01PersonasEnUnaClase;

public class Persona {
	
	// Declaración de las propiedades de cada persona
	private int alturaCm;
	private int pesoKg;
	private String nombre;
	private String colorPelo;
	
	// Acciones concretas que sirven para construir el objeto. Se llaman Constructores
	public Persona( ) {
		System.out.println("Se ha creado una persona");
	}

	public Persona (int newAlturaCm, int newPesoKg, String newNombre, String newColorPelo) {
		alturaCm = newAlturaCm;
		pesoKg = newPesoKg;
		nombre = newNombre;
		colorPelo = newColorPelo;
	}
	
	// Acciones que puede realizar una persona
	public String toString() {
		return "Las propiedades de la persona son alturaCm: " + alturaCm +
				" pesoKg: " + pesoKg + " nombre: " + nombre + " colorPelo: " + 
				colorPelo;
	}
	
	
	public void setAlturaCm (int newAlturaCm) {
		alturaCm = newAlturaCm;
	}
	
	public int getAlturaCm () {
		return alturaCm;
	}
	
	public void setPesoKg (int newPesoKg) {
		pesoKg = newPesoKg;
	}
	
	public int getPesoKg () {
		return pesoKg;
	}
	
	public void setNombre (String newNombre) {
		nombre = newNombre;
	}
	
	public String getNombre () {
		return nombre;
	}
	
	public void setColorPelo (String newColorPelo) {
		colorPelo = newColorPelo;
	}
	
	public String getColorPelo () {
		return colorPelo;
	}
}
