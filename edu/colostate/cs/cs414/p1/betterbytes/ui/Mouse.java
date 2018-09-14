package edu.colostate.cs.cs414.p1.betterbytes.ui;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Mouse implements MouseListener, MouseMotionListener {

	private Point mouseLocation = new Point(-1, -1);

	@Override
	public void mouseDragged(MouseEvent e) {
		setLocation(new Point(e.getX(), e.getY()));

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		setLocation(new Point(e.getX(), e.getY()));

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		setLocation(new Point(e.getX(), e.getY()));

	}

	@Override
	public void mousePressed(MouseEvent e) {
		setLocation(new Point(e.getX(), e.getY()));

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		setLocation(new Point(e.getX(), e.getY()));

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		setLocation(new Point(e.getX(), e.getY()));

	}

	@Override
	public void mouseExited(MouseEvent e) {
		setLocation(new Point(e.getX(), e.getY()));

	}

	public Point getLocation() {
		return mouseLocation;
	}

	public void setLocation(Point mouseLocation) {
		this.mouseLocation = mouseLocation;
	}

}
