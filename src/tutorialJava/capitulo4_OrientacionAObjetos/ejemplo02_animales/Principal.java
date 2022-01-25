package tutorialJava.capitulo4_OrientacionAObjetos.ejemplo02_animales;

public class Principal {

	public static void main(String[] args) {
		
		Perro toby = new Perro();
		toby.setColorPelo("Negro");
		toby.setNumeroPatas(4);
		toby.setAlturaOrejasCm(8);
		System.out.println(toby.toString());

		Perro blanca = new Perro("Blanco", 4, 6);
		System.out.println(blanca.toString());
		
		Mono cesar = new Mono("Marrón oscuro", 2, 160);
		System.out.println(cesar.toString());
		
		Oso yogui = new Oso();
		yogui.setColorPelo("Marrón");
		yogui.setNumeroPatas(2);
		yogui.setNumeroGarras(4);
		System.out.println(yogui.toString());
	}

}
