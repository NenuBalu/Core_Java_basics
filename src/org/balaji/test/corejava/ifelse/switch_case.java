package org.balaji.test.corejava.ifelse;

public class switch_case {

	static int day=4;
	public static void switchcaseint() {
		switch (day) {
		
		case 1:
			System.out.println("this is monday");
			break;
		case 2:
			System.out.println("this is tuesday");
			break;
		case 3:
			System.out.println("this is wed");
			break;
		case 4:
			System.out.println("this is thu");
			break;
		case 5:
			System.out.println("this is fri");
			break;
		case 6:
			System.out.println("this is sat");
			break;
		case 7:
			System.out.println("this is sun");
			break;
		default:
			System.out.println("invalid input");
		}
}
	public static void switchcasestring() {
		String day="sat";
		
		switch (day) {
		case "mon":
			System.out.println("this is day 1");
			break;
		case "tues":
			System.out.println("this is day 2");
			break;
		case "wed":
			System.out.println("this is day 3");
			break;
		case "thur":
			System.out.println("this is day 4");
			break;
		case "fri":
			System.out.println("this is day 5");
			break;
		case "sat":
			System.out.println("this is day 6");
			break;
		case "sun":
			System.out.println("this is day 7");
			break;
		default:
			System.out.println("enter a valid input");
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		switchcaseint();
		switchcasestring();
		
	}

}
