package tutorialJava.capitulo4_OrientacionAObjetos.ejemplo03_ArticulosDeSupermercado;

public class ArtComestible extends Articulo {

	private String fechaCaducidad;
	
	
	public ArtComestible() {
	}

	public ArtComestible(String nombre, int codigo, float precio, String fechaCaducidad) {
		super(nombre, codigo, precio);
		this.fechaCaducidad = fechaCaducidad;
	}



	public String getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	
}
