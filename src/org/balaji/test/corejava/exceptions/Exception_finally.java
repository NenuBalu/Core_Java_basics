package org.balaji.test.corejava.exceptions;

public class Exception_finally {
	public static void main(String[] args) {
		
	int i=100;
	int j=0;
	
	try {
		int res=i/j;
		System.out.println(res);
		
	}
	/*catch (Exception e) {
		System.out.println(e.getMessage());
		}*/
	finally {
		System.out.println("hello this is finally block execution");
	}
	System.out.println("i value is ::" + i);
	}
}
