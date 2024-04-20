package org.balaji.test.corejava.accessModifiers;

public class accessModifiersExample2 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		accessModifiersExample1 ac1 = new accessModifiersExample1();
		System.out.println(ac1.protected_var1="this is protected");
		System.out.println(ac1.public_var1="this is public");
		System.out.println(ac1.default_var1="this is default");
		ac1.default_method();
		ac1.protected_method();
		ac1.public_method();
	}

}
