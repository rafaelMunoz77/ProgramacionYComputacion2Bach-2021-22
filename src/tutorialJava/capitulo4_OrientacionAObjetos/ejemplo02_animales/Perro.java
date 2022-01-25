package tutorialJava.capitulo4_OrientacionAObjetos.ejemplo02_animales;

public class Perro extends Animal {

	private int alturaOrejasCm;
	
	public Perro() {
		super();
	}

	public Perro(String colorPelo, int numeroPatas, int alturaOrejasCm) {
		super(colorPelo, numeroPatas);
		this.alturaOrejasCm = alturaOrejasCm;
	}


	public int getAlturaOrejasCm() {
		return alturaOrejasCm;
	}

	public void setAlturaOrejasCm(int alturaOrejasCm) {
		this.alturaOrejasCm = alturaOrejasCm;
	}

	@Override
	public String toString() {
		return "Perro [colorPelo=" + colorPelo + ", numeroPatas=" + numeroPatas + ", alturaOrejasCm=" + alturaOrejasCm
				+ "]";
	}


	
	
}
