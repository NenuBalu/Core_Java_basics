package org.balaji.test.corejava.abstraction;

public class hp extends sample {
	
	public static void main(String[] args) {
		hp h = new hp();
		h.copy();
		h.cut();
		h.paste();
		h.keyboard();
		
		lenovo l1 = new lenovo();
		l1.cut();
		l1.keyboard();
		
	}

	@Override
	public void cut() {
		System.out.println("this is undefined ::: cut code" );
		
	}

	@Override
	public void keyboard() {
		System.out.println("this is undefined ::: keyboard code");
		
	}
	

}
