package org.balaji.test.corejava.inheritance;

public class AdminUser extends DeveloperUser {
	
	public void delete() {
		read();
		write();
		System.out.println("this is Delete operation");
	}
	public void read() {
		
		System.out.println("This read is from admin");
	}
}
