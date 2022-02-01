/**
 * 
 */
package tutorialJava.capitulo4_OrientacionAObjetos.ejemplo03_ArticulosDeSupermercado;

/**
 * @author Tecnología
 *
 */
public class ArtLimpieza extends Articulo {

	private boolean ignifugo;
	
	/**
	 * 
	 */
	public ArtLimpieza() {
	}

	/**
	 * @param nombre
	 * @param codigo
	 * @param precio
	 */
	public ArtLimpieza(String nombre, int codigo, float precio, boolean ignifugo) {
		super(nombre, codigo, precio);
		this.ignifugo = ignifugo;
	}

	@Override
	public String toString() {
		return "ArtLimpiza [nombre=" + nombre + ", codigo=" + codigo + ", precio=" + precio + ", ignifugo=" + ignifugo
				+ "]";
	}

	public boolean isIgnifugo() {
		return ignifugo;
	}

	public void setIgnifugo(boolean ignifugo) {
		this.ignifugo = ignifugo;
	}

	
}
