package edu.colostate.cs.cs414.p1.betterbytes.ui;

public class Cell {

	private int x, y;
	private Piece holding = null;
	private Grid grid = null;

	public Cell(int x, int y, Grid grid) {
		this.setX(x);
		this.setY(y);
		this.grid = grid;
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

	public int getRealY() {
		return grid.getBaseY() + (this.getY() * grid.getCellSize());
	}
	
	public int getRealX() {
		return grid.getBaseX() + (this.getX() * grid.getCellSize());
	}

}
