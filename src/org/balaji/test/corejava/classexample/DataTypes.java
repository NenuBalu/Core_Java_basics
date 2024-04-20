package org.balaji.test.corejava.classexample;

public class DataTypes {

	public static void main(String[] args) {
		// primitive date types byte only 3 digits can be stored
		byte b = 123;
		System.out.println(b);

		// short only 5 digits can be stored
		short s = 12345;
		System.out.println(s);
		// int can store till 10 digits
		int i = 1234567890;
		System.out.println(i);
		// long can store 19 num of digits but we need to mention l at the end
		long l = 1234567891234567891l;
		System.out.println(l);
		// addition multiplication subraction and division
		double var1 = 20;
		double var2 = 40;
		// add
		double addres = var1 + var2;
		System.out.println("addition of " + var1 + " and " + var2 + " is " + (var1 + var2));
		System.out.println("addition of " + var1 + " and " + var2 + " is " + addres);
		// subract
		double subres = var1 - var2;
		System.out.println("subraction of " + var1 + " and " + var2 + " is " + (var1 - var2));
		System.out.println("subraction of " + var1 + " and " + var2 + " is " + subres);
		// multiplication
		double mulres = var1 * var2;
		System.out.println("multiplication of " + var1 + " and " + var2 + " is " + (var1 * var2));
		System.out.println("multiplication of " + var1 + " and " + var2 + " is " + mulres);
		double divres = var1 / var2;
		System.out.println("division of " + var1 + " and " + var2 + " is " + (var1 / var2));
		System.out.println("divisiom of " + var1 + " and " + var2 + " is " + divres);

	}

}
