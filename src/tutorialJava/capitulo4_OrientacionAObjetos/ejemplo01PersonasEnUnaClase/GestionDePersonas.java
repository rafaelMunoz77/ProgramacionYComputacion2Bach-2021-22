package tutorialJava.capitulo4_OrientacionAObjetos.ejemplo01PersonasEnUnaClase;

public class GestionDePersonas {

	public static void main(String[] args) {
		Persona rafa = new Persona();
		rafa.setAlturaCm(95);
		rafa.setAlturaCm(180);
		rafa.setNombre("Rafael Carlos");
		rafa.setColorPelo("Pelirrojo");
		System.out.println(rafa.toString());;
		
		Persona cristina = new Persona();
		cristina.setPesoKg(43);
		cristina.setAlturaCm(165);
		cristina.setNombre("Cristina");
		cristina.setColorPelo("Castaño");
		System.out.println(cristina.toString());
		
		Persona felipe = new Persona();
		felipe.setPesoKg(85);
		felipe.setAlturaCm(180);
		felipe.setNombre("Felipe");
		felipe.setColorPelo("Castaño");
		System.out.println(felipe.toString());
		
		Persona miguel = new Persona(175, 75, "Miguel", "Rubio");
		System.out.println(miguel.toString());
	}

}
