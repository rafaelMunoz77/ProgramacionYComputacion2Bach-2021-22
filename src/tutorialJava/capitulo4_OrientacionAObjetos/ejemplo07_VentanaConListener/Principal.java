package tutorialJava.capitulo4_OrientacionAObjetos.ejemplo07_VentanaConListener;

import javax.swing.JFrame;

public class Principal {


	public static void main(String[] args) {
		JFrame ventana = new JFrame("Mi segunda ventana");

		MiWindowAdapter windowAdapter = new MiWindowAdapter();
		ventana.addWindowListener(windowAdapter);
		
		MiMouseAdapter mouseAdapter = new MiMouseAdapter();
		ventana.addMouseListener(mouseAdapter);
		ventana.addMouseMotionListener(mouseAdapter);
		
		ventana.setBounds(0, 0, 800, 600);
		ventana.setVisible(true);
		
	}

}
