package org.balaji.test.corejava.classexample;

public class test {
	//states
	int age;
	String name="";
	String address="";
	
	public static void testOne() {
		System.out.println("this is test 1");
		test balu=new test();
		System.out.println("Balu stays at ::"+ (balu.address="Tadepalligudem"));
		System.out.println("Balu's age is ::"+ (balu.age=26));
		System.out.println("Balu's full name is ::"+ (balu.name="Balaji Bathina"));
	}
	
	public void testTwo() {
		System.out.println("this is test 2");
	}
	
			

	public static void main(String[] args) {
		
		System.out.println("this is main method");
		/*
		 * test balu=new test(); System.out.println("Balu stays at ::"+
		 * (balu.address="Tadepalligudem")); System.out.println("Balu's age is ::"+
		 * (balu.age=26)); System.out.println("Balu's full name is ::"+
		 * (balu.name="Balaji Bathina"));
		 */
		/*
		 * balu.testOne(); balu.testTwo();
		 */
		//testOne();
	    test balu=new test();
		System.out.println("Poori stays at ::"+ (balu.address="Pentapadu"));
		System.out.println("Poori's age is ::"+ (balu.age=26));
		System.out.println("Poori's full name is ::"+ (balu.name="Poornima Pattigulla"));
		balu.testTwo();
		testOne();
	
	}

}
