package org.balaji.test.corejava.Datatypes;

public class calc {
	int a =  10;
	int b = 20;
	
	public static void with_static () {
		System.out.println("result of with static");
	}
	
	public void non_static () {
		System.out.println("result of non static");
	}
	
	public static int static_with_int () {
		System.out.println("this is the result of static with int we can return a value");
		int res=100;
		return res;
	}
	public int nonstatic_int() {
		System.out.println("this is the result of non static with int");
		int i = 1000;
		return i;
	}
	public static void main(String[] args) {
		calc hello = new calc();
		
		with_static();
		
		hello.non_static();
		
		static_with_int();
		
		hello.nonstatic_int();
		
		

	}

}
