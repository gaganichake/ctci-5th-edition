package org.ctci.chapter7.Question7_5;

public class Line {
	public Point start;
	public Point end;
	public Line(Point start, Point end) {
		this.start = start;
		this.end = end;
	}
	
	public String toString() {
		return "Line from " + start.toString() + " to " + end.toString();
	}
}
