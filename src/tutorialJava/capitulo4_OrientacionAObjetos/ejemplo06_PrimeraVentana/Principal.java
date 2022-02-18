package tutorialJava.capitulo4_OrientacionAObjetos.ejemplo06_PrimeraVentana;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Principal {


	public static void main(String[] args) {
		JFrame ventana = new JFrame();
		ventana.setBounds(0, 0, 800, 600);
		
//		ventana.getContentPane().setBackground(Color.decode("#32b31b"));
		
		ventana.getContentPane().setLayout(new BorderLayout());

		MiCanvas canvas = new MiCanvas();
		canvas.setBackground(Color.PINK);
		ventana.getContentPane().add(canvas, BorderLayout.CENTER);
		
		JButton jbt = new JButton("Esto es un botón");
		ventana.getContentPane().add(jbt, BorderLayout.NORTH);
		
		JButton jbt2 = new JButton("Esto es otro botón");
		ventana.getContentPane().add(jbt2, BorderLayout.EAST);

		JCheckBox jcheck = new JCheckBox("Esto es un checkbox");
		ventana.getContentPane().add(jcheck, BorderLayout.SOUTH);
		
		JCheckBox jcheck2 = new JCheckBox("Esto es otro checkbox");
		ventana.getContentPane().add(jcheck2, BorderLayout.WEST);
		
		ventana.setVisible(true);
	}

}
