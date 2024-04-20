package org.balaji.test.corejava.encapsulatiom;

public class teacher {
	
	public static void main(String[] args) {
	
		student s1 = new student(101);
		s1.set_student_attendance(false); 	
		s1.get_student_attendance();
		s1.setName("Balaji Bathina");
		s1.getName();
		s1.getRollNum();
		s1.setRollNum(101);
	}
	
}
