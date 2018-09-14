package edu.colostate.cs.cs414.p1.betterbytes.ui;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Grid {

	private int baseX = 15, baseY = 15;

	private int cellSize = 55;

	private ArrayList<Cell> cells = new ArrayList<Cell>();

	public Grid(int baseX, int baseY) {
		this.setBaseX(baseX);
		this.setBaseY(baseY);
		for (int x = 1; x <= 8; x++) {
			for (int y = 1; y <= 8; y++) {
				cells.add(new Cell(x, y, this));
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
		g.setColor(Color.GREEN);
		for (Cell c : cells) {
			g.drawRect(baseX + (c.getX() * this.getCellSize()), baseY + (c.getY() * this.getCellSize()),
					this.getCellSize(), this.getCellSize());
		}
	}

	public int getCellSize() {
		return cellSize;
	}

	public void setCellSize(int cellSize) {
		this.cellSize = cellSize;
	}
	
	public Cell getCell(int x, int y) {
		for(Cell c : this.cells)
			if(c.getX() == x && c.getY() == y)
				return c;
		return null;
	}
	
}
