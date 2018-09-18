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

	public GameFrame(int width, int height) {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(width, height);
		this.back = new BufferPanel(this);
		this.add(back, BorderLayout.CENTER);
		this.setVisible(true);
		new Thread(back).start();
		this.setTitle("Tafl V" + 1);
		this.setResizable(false);
	}

	public static void main(String[] arg0) {
		GameFrame gf = new GameFrame(750, 800);
		gf.placePiece(new Piece(PieceType.KING, true), 1, 7);
		gf.placePiece(new Piece(PieceType.KING, true), 2, 5);
		gf.placePiece(new Piece(PieceType.KING, false), 3, 3);
		gf.placePiece(new Piece(PieceType.KING, true), 5, 8);
		gf.placePiece(new Piece(PieceType.KING, false), 4, 7);
		gf.placePiece(new Piece(PieceType.KING, true), 6, 6);
		gf.placePiece(new Piece(PieceType.KING, false), 7, 3);
		gf.placePiece(new Piece(PieceType.KING, true), 8, 4);

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

	public void placePiece(Piece p, int x, int y) {
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
