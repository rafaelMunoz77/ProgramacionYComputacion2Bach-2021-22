package tutorialJava.capitulo4_OrientacionAObjetos.ejemplo06_PrimeraVentana;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class Principal {


	public static void main(String[] args) {
		JFrame ventana = new JFrame();
		ventana.setBounds(0, 0, 800, 600);
		ventana.setVisible(true);
		
		ventana.getContentPane().setBackground(Color.decode("#32b31b"));
		
		ventana.getContentPane().setLayout(new BorderLayout());
		JTextField jtf = new JTextField();
		ventana.getContentPane().add(jtf, BorderLayout.NORTH);
		

	}

}
