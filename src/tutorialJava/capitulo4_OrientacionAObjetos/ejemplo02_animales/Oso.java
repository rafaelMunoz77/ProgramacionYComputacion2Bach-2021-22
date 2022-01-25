package tutorialJava.capitulo4_OrientacionAObjetos.ejemplo02_animales;

public class Oso extends Animal {

	int numeroGarras;

	
	
	
	
	public Oso() {
		super();
	}

	public Oso(String colorPelo, int numeroPatas, int numeroGarras) {
		super(colorPelo, numeroPatas);
		this.numeroGarras = numeroGarras;
	}

	public int getNumeroGarras() {
		return numeroGarras;
	}

	public void setNumeroGarras(int numeroGarras) {
		this.numeroGarras = numeroGarras;
	}

	@Override
	public String toString() {
		return "Oso [colorPelo=" + colorPelo + ", numeroPatas=" + numeroPatas + ", numeroGarras=" + numeroGarras + "]";
	}
	
	
}
