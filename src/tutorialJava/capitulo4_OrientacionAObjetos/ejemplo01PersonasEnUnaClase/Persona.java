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

	public Persona (int alturaCm, int pesoKg, String nombre, String colorPelo) {
		this.alturaCm = alturaCm;
		this.pesoKg = pesoKg;
		this.nombre = nombre;
		this.colorPelo = colorPelo;
	}
	
	// Acciones que puede realizar una persona
	public String toString() {
		return "Las propiedades de la persona son alturaCm: " + alturaCm +
				" pesoKg: " + pesoKg + " nombre: " + nombre + " colorPelo: " + 
				colorPelo;
	}
	
	
	public void setAlturaCm (int alturaCm) {
		this.alturaCm = alturaCm;
	}
	
	public int getAlturaCm () {
		return alturaCm;
	}
	
	public void setPesoKg (int pesoKg) {
		this.pesoKg = pesoKg;
	}
	
	public int getPesoKg () {
		return pesoKg;
	}
	
	public void setNombre (String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre () {
		return nombre;
	}
	
	public void setColorPelo (String colorPelo) {
		this.colorPelo = colorPelo;
	}
	
	public String getColorPelo () {
		return colorPelo;
	}
}
