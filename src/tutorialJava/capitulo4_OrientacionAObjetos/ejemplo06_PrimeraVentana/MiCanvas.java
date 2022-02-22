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
		
		g.setColor(Color.decode("#cc8cfa"));
		g.fillOval(400, 400, 100, 100);
		
		g.setColor(Color.red);
		int x[] = new int[] {200, 300, 400};
		int y[] = new int[] {200, 300, 100};
		g.fillPolygon(x, y, 3);
	}



}
