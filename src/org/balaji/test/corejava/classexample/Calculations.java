package org.balaji.test.corejava.classexample;

public class Calculations {
	// instance vars or global vars
	int i = 100;
	int j = 200;
	public void addres () {
		int resadd= i+j;
		System.out.println("addition of " + i +  " " + j + " is " + resadd);
	}
	public static void mulres () {
		int i=100;
		int j=200;
		int resmul= i*j;
		System.out.println("multiplication of " + i +  " " + j + " is " + resmul);
	}
	public void subres () {
		int ressub= i-j;
		System.out.println("subraction of " + i + " " + j + " is " + ressub);
	}
	public static void divres () {
		int i = 1000;
		int j = 500;
		int resdiv= i/j;
		System.out.println("division of " + i + " " + j + " is " + resdiv);
	}
	public static void main(String[] args) {
		Calculations calc=new Calculations();
		calc.addres();
		Calculations.mulres();
		calc.subres();
	//	calc.divres(); this method can be called but only issue is 
		divres();
		
	}
}
