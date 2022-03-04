package tutorialJava.capitulo4_OrientacionAObjetos.ejemplo07_VentanaConListener;

import javax.swing.JFrame;

public class Principal {


	public static void main(String[] args) {
		JFrame ventana = new JFrame("Mi segunda ventana");

		MiWindowAdapter adapter = new MiWindowAdapter();
		ventana.addWindowListener(adapter);
		
		ventana.setBounds(0, 0, 800, 600);
		ventana.setVisible(true);
		
	}

}
