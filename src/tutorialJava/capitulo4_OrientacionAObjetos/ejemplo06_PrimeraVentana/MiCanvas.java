package tutorialJava.capitulo4_OrientacionAObjetos.ejemplo06_PrimeraVentana;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class MiCanvas extends Canvas {

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
		g.setColor(Color.BLACK);
		g.fillRect(100, 150, 100, 75);
	}



}
