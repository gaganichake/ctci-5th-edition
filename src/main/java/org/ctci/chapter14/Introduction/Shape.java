package org.ctci.chapter14.Introduction;

public abstract class Shape {
	public void printMe() {
		System.out.println("I am a shape.");
	}
	
	public abstract double computeArea();
}
