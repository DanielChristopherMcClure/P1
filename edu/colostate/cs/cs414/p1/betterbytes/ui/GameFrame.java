package edu.colostate.cs.cs414.p1.betterbytes.ui;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JFrame;

public class GameFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private BufferPanel back = null;
	private ArrayList<Piece> pieces = new ArrayList<Piece>();

	public GameFrame(int width, int height) {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(width, height);
		this.back = new BufferPanel(this);
		this.add(back, BorderLayout.CENTER);
		this.setVisible(true);
		new Thread(back).start();
		this.setTitle("Tafl V" + 1);
	}

	public static void main(String[] arg0) {
		GameFrame gf = new GameFrame(800, 900);
		gf.setPiece(new Piece(PieceType.KING, false), 1, 1);

	}

	public BufferPanel getBufferPanel() {
		return this.back;
	}

	public boolean movePiece(int x, int y, int newX, int newY) {
		Cell old = this.getBufferPanel().getGrid().getCell(x, y);
		Piece oldp = old.getPiece();
		old.setPiece(null);
		for (Cell c : this.getBufferPanel().getGrid().getCells())
			if (c.getX() == newX && c.getY() == newY)
				c.setPiece(oldp);
		return true;
	}

	public void setPiece(Piece p, int x, int y) {
		for (Cell c : this.getBufferPanel().getGrid().getCells())
			if (c.getX() == x && c.getY() == y)
				c.setPiece(p);
	}

	public Cell getCell(int x, int y) {
		for (Cell c : this.getBufferPanel().getGrid().getCells())
			if (c.getX() == x && c.getY() == y)
				return c;
		return null;
	}

}
