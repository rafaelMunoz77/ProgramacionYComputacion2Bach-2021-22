package tutorialJava.capitulo4_OrientacionAObjetos.ejemplo07_VentanaConListener;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MiMouseAdapter extends MouseAdapter {

	@Override
	public void mouseClicked(MouseEvent e) {
		super.mouseClicked(e);
		System.out.println("Se ha hecho clic");
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		super.mouseMoved(e);
		System.out.println("X: " + e.getX() + " - Y: " + e.getY());
	}



}
