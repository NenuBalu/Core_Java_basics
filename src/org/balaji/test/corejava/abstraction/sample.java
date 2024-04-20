package org.balaji.test.corejava.abstraction;

public abstract class sample implements Laptop{
	public void copy() {
		System.out.println("this is defined ::: copy");
	}
	public void paste() {
		System.out.println("this is defined ::: paste");
	}
	public abstract void cut();
	public abstract void keyboard();
}
