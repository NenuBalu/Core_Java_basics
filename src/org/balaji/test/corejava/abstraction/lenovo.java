package org.balaji.test.corejava.abstraction;

public class lenovo extends sample {

	@Override
	public void cut() {
		System.out.println("this is undefined ::: lenovo cut code" );
		
	}

	@Override
	public void keyboard() {
		System.out.println("this is undefined ::: lenovo keyboard code");
		
	}
	public static void main(String[] args) {
		
		Laptop l = new lenovo();
		l.cut();
		l.keyboard();
		l.copy();
		l.paste();
	}
}
