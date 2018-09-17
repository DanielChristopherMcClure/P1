package edu.colostate.cs.cs414.p1.betterbytes.ui;

import java.awt.Graphics;
import java.awt.Image;

import edu.colostate.cs.cs414.p1.betterbytes.utilities.Tools;

public class Piece {

	private PieceType type = null;
	private boolean white = false;
	private Image[] kings = { Tools.getLocalImg("data/pieces/black_king.png"),
			Tools.getLocalImg("data/pieces/white_king.png") };

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
		switch (this.getType()) {
		case KING:
			if(isWhite())
				return kings[1];
			return kings[0];
		case ROOk:
			break;
		default:
			break;
		}
		return null;
	}

	public boolean isWhite() {
		return this.white;
	}

}
