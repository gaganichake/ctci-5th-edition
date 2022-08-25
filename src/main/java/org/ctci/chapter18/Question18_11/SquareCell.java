package org.ctci.chapter18.Question18_11;

public class SquareCell {
	public int zerosRight;
	public int zerosBelow;
	public SquareCell(int right, int below) {
		zerosRight = right;
		zerosBelow = below;
	}
	
	public void setZerosRight(int right) {
		zerosRight = right;
	}
	
	public void setZerosBelow(int below) {
		zerosBelow = below;
	}
}
