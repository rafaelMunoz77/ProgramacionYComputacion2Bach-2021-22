package tutorialJava.capitulo4_OrientacionAObjetos.ejemplo07_VentanaConListener;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MiWindowAdapter extends WindowAdapter {

	public MiWindowAdapter() {
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("Se cierra la ventana");
	}

	
}
