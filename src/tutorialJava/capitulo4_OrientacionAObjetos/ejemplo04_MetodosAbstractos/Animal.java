package tutorialJava.capitulo4_OrientacionAObjetos.ejemplo04_MetodosAbstractos;

public abstract class Animal {

	public Animal() {
	}

	public abstract void emiteSonido ();
	
	public void andar() {
		System.out.println("Andando");
	}
}
