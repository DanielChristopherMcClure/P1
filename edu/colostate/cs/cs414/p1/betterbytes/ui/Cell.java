package edu.colostate.cs.cs414.p1.betterbytes.ui;

import java.awt.Rectangle;

import edu.colostate.cs.cs414.p1.betterbytes.utilities.Tools;

public class Cell {

	private int x, y, size;
	private Piece holding = null;
	private Grid grid = null;
	private boolean selected = false;

	public Cell(int x, int y, int size, Grid grid) {
		this.setX(x);
		this.setY(y);
		this.setSize(size);
		this.grid = grid;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getSize() {
		return this.size;
	}

	public void setSelected(boolean s) {
		//Tools.log("Selected: " + this);
		this.selected = s;
	}

	public boolean isSelected() {
		return this.selected;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Piece getPiece() {
		return this.holding;
	}

	public void setPiece(Piece p) {
		this.holding = p;
	}

	public boolean hasPiece() {
		return this.getPiece() != null;
	}

	public boolean isWhiteCell() {
		return (this.getX() + this.getY()) % 2 == 0;
	}

	public int getRealY() {
		return grid.getBaseY() + (this.getY() * grid.getCellSize());
	}

	public int getRealX() {
		return grid.getBaseX() + (this.getX() * grid.getCellSize());
	}

	public Rectangle getBounds() {
		return new Rectangle(this.getRealX(), this.getRealY(), this.getSize(), this.getSize());
	}

	public boolean equals(Cell c) {
		return this.getX() == c.getX() && this.getY() == c.getY();
	}

	public String toString() {
		return "Grid Cell:" + this.getX() + ":" + this.getY();
	}

}
