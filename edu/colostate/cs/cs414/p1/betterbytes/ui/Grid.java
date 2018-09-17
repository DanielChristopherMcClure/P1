package edu.colostate.cs.cs414.p1.betterbytes.ui;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import edu.colostate.cs.cs414.p1.betterbytes.utilities.Tools;

public class Grid {

	private int baseX = 15, baseY = 15;

	private int cellSize = 75;

	private ArrayList<Cell> cells = new ArrayList<Cell>();

	public Grid(int baseX, int baseY) {
		this.setBaseX(baseX);
		this.setBaseY(baseY);
		for (int x = 1; x <= 8; x++) {
			for (int y = 1; y <= 8; y++) {
				cells.add(new Cell(x, y, this.getCellSize(), this));
			}
		}
	}

	public int getBaseX() {
		return baseX;
	}

	public void setBaseX(int baseX) {
		this.baseX = baseX;
	}

	public int getBaseY() {
		return baseY;
	}

	public void setBaseY(int baseY) {
		this.baseY = baseY;
	}

	public ArrayList<Cell> getCells() {
		return this.cells;
	}

	public void paint(Graphics g) {
		this.paintCells(g);
		this.paintPieces(g);
	}

	public void paintCells(Graphics g) {
		for (Cell c : cells) {
			g.setColor(Color.DARK_GRAY);
			if (c.isWhiteCell()) {
				g.setColor(Color.GRAY);
			}
			g.fillRect(baseX + (c.getX() * this.getCellSize()), baseY + (c.getY() * this.getCellSize()),
					this.getCellSize(), this.getCellSize());
			g.setColor(Color.DARK_GRAY);
			g.drawRect(baseX + (c.getX() * this.getCellSize()), baseY + (c.getY() * this.getCellSize()),
					this.getCellSize(), this.getCellSize());
			if (c.isSelected()) {
				g.setColor(new Color(255, 255, 255, 105));
				g.fillRect(baseX + (c.getX() * this.getCellSize()) + 1, baseY + (c.getY() * this.getCellSize()) + 1,
						this.getCellSize() - 1, this.getCellSize() - 1);
				g.setColor(new Color(255, 255, 255, 200));
				g.drawRect(baseX + (c.getX() * this.getCellSize()) + 1, baseY + (c.getY() * this.getCellSize()) + 1,
						this.getCellSize() - 2, this.getCellSize() - 2);

			}
		}
	}

	public void paintPieces(Graphics g) {
		for (Cell c : getCells()) {
			if (c.hasPiece()) {
				// g.setColor(Color.BLUE);
				// g.fillRect(c.getRealX() + 10, c.getRealY() + 10, 20, 20);
				g.drawImage(c.getPiece().getIcon(), c.getRealX() - 6, c.getRealY() - 4, 86, 86, null);
			}
		}
	}

	public Cell getSelectedCell() {
		for (Cell c : this.getCells())
			if (c.isSelected())
				return c;
		return null;
	}

	public boolean isCellSelected() {
		for (Cell c : this.getCells())
			if (c.isSelected())
				return true;
		return false;
	}

	public void clearSelected() {
		for (Cell c : this.getCells())
			if (c.isSelected())
				c.setSelected(false);
	}

	public int getCellSize() {
		return cellSize;
	}

	public void setCellSize(int cellSize) {
		this.cellSize = cellSize;
	}

	public Cell getCell(int x, int y) {
		for (Cell c : this.cells)
			if (c.getX() == x && c.getY() == y)
				return c;
		return null;
	}

	public void movePiece(Piece p, Cell old, Cell nu) {
		if (p != null && old != null && nu != null) {
			//if(nu.hasPiece()) {
				
			//} else {
				nu.setPiece(p);
				old.setPiece(null);
			//}
		}
	}

}
