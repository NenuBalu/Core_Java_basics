package org.balaji.test.corejava.inheritance;

public class User {

	public static void main(String[] args) {
		GuestUser guest = new GuestUser();
		guest.read();
		
		DeveloperUser dev =  new DeveloperUser();
		dev.read();
		dev.write();
		
		AdminUser admin = new AdminUser();
		admin.read();
		admin.write();
		admin.delete();
		
	}

}
