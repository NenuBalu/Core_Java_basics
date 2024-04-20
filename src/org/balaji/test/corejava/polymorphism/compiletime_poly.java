package org.balaji.test.corejava.polymorphism;

public class compiletime_poly {
	public void add() {
		System.out.println("add funcion");
	}
	public void add(int a, int b) {
		System.out.println("add function with int a and int b");
		System.out.println(a + b);
	}
	public void add (String a, int b) {
		System.out.println("add function with string a and int b. this is method overloading concept");
		System.out.println(a + b);
	}
	public void add (int a , int b, int c) {
		System.out.println("here we are adding 3 vars so we can use same method with diff num of vars");
		System.out.println(a + b + c);
	}
	public void add (int b, String a) {
		System.out.println("here the second method and this one contains same params but in diff order");
		System.out.println(b + a);
		System.out.println(a + b);
	}
	public static void main (String[] args) {
		
		compiletime_poly c = new compiletime_poly();
		c.add();
		c.add(100,20);
		c.add(100, "hello");
		c.add(100, 200, 300);
		c.add("a", 222);
	}

}
