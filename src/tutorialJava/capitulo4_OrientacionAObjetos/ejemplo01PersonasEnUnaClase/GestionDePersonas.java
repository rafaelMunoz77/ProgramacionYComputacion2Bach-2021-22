package tutorialJava.capitulo4_OrientacionAObjetos.ejemplo01PersonasEnUnaClase;

public class GestionDePersonas {

	public static void main(String[] args) {
		Persona rafa = new Persona();
		rafa.pesoKg = 95;
		rafa.alturaCm = 180;
		rafa.nombre = "Rafael Carlos";
		rafa.colorPelo = "Pelirrojo";
		rafa.imprimePropiedades();
		
		Persona cristina = new Persona();
		cristina.pesoKg = 43;
		cristina.alturaCm = 165;
		cristina.nombre = "Cristina";
		cristina.colorPelo = "Castaño";
		cristina.imprimePropiedades();
		
		Persona felipe = new Persona();
		felipe.pesoKg = 85;
		felipe.alturaCm = 180;
		felipe.nombre = "Felipe";
		felipe.colorPelo = "Castaño";
		felipe.imprimePropiedades();
		
		Persona miguel = new Persona(175, 75, "Miguel", "Rubio");
		miguel.imprimePropiedades();
	}

}
