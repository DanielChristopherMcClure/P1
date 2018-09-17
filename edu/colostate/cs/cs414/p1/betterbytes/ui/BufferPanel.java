package edu.colostate.cs.cs414.p1.betterbytes.ui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

import edu.colostate.cs.cs414.p1.betterbytes.utilities.Tools;

public class BufferPanel extends JPanel implements Runnable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Image img = null;
	private Mouse mouse = new Mouse(this);
	private GameFrame gf = null;
	private Grid grid = new Grid(-50, -50);
	private Image background = Tools.getLocalImg("data/background.png");

	public BufferPanel(GameFrame gf) {
		this.gf = gf;
	}

	public void paint(Graphics g) {
		g.setColor(Color.DARK_GRAY);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		this.paintBackGround(g);
		g.setColor(Color.RED);
		g.drawString("Mouse: " + this.mouse.getLocation(), 15, 15);
		grid.paint(g);		
	}

	public void paintBackGround(Graphics g) {
		if (this.background != null) {
			g.drawImage(background, 0, 0, 950, 845, null);
		}
	}

	@Override
	public void run() {
		this.addMouseListener(getMouse());
		this.addMouseMotionListener(getMouse());
		while (true) {
			if (this.getParent() != null) {
				this.img = this.createImage(super.getWidth(), super.getHeight());
				this.paint(this.img.getGraphics());
				this.getGraphics().drawImage(img, 0, 0, null);
			}
		}
	}

	public Mouse getMouse() {
		return this.mouse;
	}

	public Grid getGrid() {
		return this.grid;
	}

}
