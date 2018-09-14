package edu.colostate.cs.cs414.p1.betterbytes.ui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

public class BufferPanel extends JPanel implements Runnable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Image img = null;
	private Mouse mouse = new Mouse();
	private GameFrame gf = null;
	private Grid grid = new Grid(15,15);

	public BufferPanel(GameFrame gf) {
		this.gf = gf;
	}

	public void paint(Graphics g) {
		g.setColor(Color.DARK_GRAY);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		g.setColor(Color.RED);
		g.drawString("Mouse: " + this.mouse.getLocation(), 15, 15);
		grid.setCellSize((int) (this.getWidth() * .09));
		grid.paint(g);
		for(Cell c : grid.getCells()) {
			if(c.hasPiece()) {
				g.setColor(Color.BLUE);
				g.fillRect(c.getRealX() + 10, c.getRealY() + 10, 20, 20);
			}
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
