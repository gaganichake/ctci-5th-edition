package org.ctci.chapter18.Question18_11;

public class Subsquare {
	public int row, column, size;
	public Subsquare(int r, int c, int sz) {
		row = r;
		column = c;
		size = sz;
	}
	
	public void print() {
		System.out.println("(" + row + ", " + column + ", " + size + ")");
	}
}