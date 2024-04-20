package org.balaji.test.corejava.encapsulatiom;

public class student {

	private int rollNum;
	private String name;
	private boolean isattended;

	
	  public student(int rollNum) { 
		  this.rollNum = rollNum; 
	  }

	public void set_student_attendance(boolean flag) {
		if (!isattended)
			isattended = flag;
		System.out.println("student came?? :: "+flag);
		System.out.println("teacher assigned attendance");
	}

	public boolean get_student_attendance() {
		System.out.println("teacher accessd student attendance");
		return isattended;
	}

	public int getRollNum() {
		return rollNum;
	}

	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
