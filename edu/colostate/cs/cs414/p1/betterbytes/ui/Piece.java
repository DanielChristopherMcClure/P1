package edu.colostate.cs.cs414.p1.betterbytes.ui;

import java.awt.Image;

public class Piece {

	private PieceType type = null;
	private boolean white = false;

	public Piece(PieceType type, boolean isWhite) {
		this.setType(type);
		this.white = isWhite;
	}

	public PieceType getType() {
		return type;
	}

	public void setType(PieceType type) {
		this.type = type;
	}

	public Image getIcon() {
		return null;
	}

	public boolean isWhite() {
		return this.white;
	}

}
