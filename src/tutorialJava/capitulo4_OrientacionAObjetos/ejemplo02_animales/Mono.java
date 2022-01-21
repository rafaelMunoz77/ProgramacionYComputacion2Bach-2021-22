package tutorialJava.capitulo4_OrientacionAObjetos.ejemplo02_animales;

public class Mono {
	
	private String colorPelo;
	private int numeroPatas;
	private int alturaCm;
	
	public Mono() {
		super();
	}

	public Mono(String colorPelo, int numeroPatas, int alturaCm) {
		super();
		this.colorPelo = colorPelo;
		this.numeroPatas = numeroPatas;
		this.alturaCm = alturaCm;
	}

	public String getColorPelo() {
		return colorPelo;
	}

	public void setColorPelo(String colorPelo) {
		this.colorPelo = colorPelo;
	}

	public int getNumeroPatas() {
		return numeroPatas;
	}

	public void setNumeroPatas(int numeroPatas) {
		this.numeroPatas = numeroPatas;
	}

	public int getAlturaCm() {
		return alturaCm;
	}

	public void setAlturaCm(int alturaCm) {
		this.alturaCm = alturaCm;
	}

	@Override
	public String toString() {
		return "Mono [colorPelo=" + colorPelo + ", numeroPatas=" + numeroPatas + ", alturaCm=" + alturaCm + "]";
	}
	
	
}
