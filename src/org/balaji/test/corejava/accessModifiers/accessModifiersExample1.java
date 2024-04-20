package org.balaji.test.corejava.accessModifiers;

public class accessModifiersExample1 {
	
	String default_var1;
	public String public_var1;
	private String private_var1="this is private var1";
	protected String protected_var1="";
	
	public void public_method() {
		int public_var= 100;
		System.out.println("this is public method" + public_var);
		
	}
	private void private_method() {
		int private_var2=10;
		
		System.out.println("this is private method" + private_var2);
		System.out.println(private_var1);
	}
	void default_method() {
		int default_var=200;
		System.out.println("this is default var" + default_var);
	}
	
	protected void protected_method() {
		int protected_var2=300;
		System.out.println("this is protected var" + protected_var2);
	}
	
	public static void main(String[] args) {
		accessModifiersExample1 a = new accessModifiersExample1();
		a.default_method();
		a.public_method();
		a.private_method();
		a.protected_method();
		//System.out.println(a.private_variable1="hello this is private var");
		System.out.println(a.public_var1="this is my job learning java");
		System.out.println(a.private_var1="this is private");
		System.out.println(a.protected_var1="this is protected var");
		System.out.println(a.default_var1="this is default var");
	}

}
