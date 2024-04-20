package org.balaji.test.corejava.loops;

public class forloop {

	public static void main(String[] args) {
		
		for (int i=1; i<=10; i++) {
			
			System.out.println("i value is ::" + i);
		
		if (i==10 || i<5) {
			System.out.println("i value tadaaaaa is tennnnnnnnnnnnnnnn  ::" + i );
			//break;
			continue;
		}
		if (i==20) {
			System.out.println("i value will be not tennnnnnnnnnnnn:: " + i);
			break;
		}
		}
		System.out.println("===================================== end of the for loop ==================================");
		//0 to 100
		System.out.println("================================ begining of another for loop ===============================");
		for (int i=10; i>=0; i--) {
			System.out.println("i value is ::" + i);
		if (i==10 || i<5) {
			System.out.println("i value for second loop is ::"+ i);
		}
		
		}
		//with diff of 2
		for (int i=1; i<100; i+=2) {
			System.out.println("i value is ::" + i);
			
		}
	}

}
