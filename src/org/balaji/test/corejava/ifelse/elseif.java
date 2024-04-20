package org.balaji.test.corejava.ifelse;

public class elseif {
	
	public static void elseifwithstring() {
		String week_day="sat";
		if (week_day.equals("mon")) {
			System.out.println("this is day 1 of the week");
		}else if (week_day.equals("tues")) {
			System.out.println("this is day 2 of the week");
		}else if (week_day.equals("wednes")) {
			System.out.println("this is day 3 of the week");
		}else if (week_day.equals("thurs")) {
			System.out.println("this is day 4 of the week");
		}else if (week_day.equals("fri")) {
			System.out.println("this is day 5 of the week");
		}else if (week_day.equals("sat")) {
			System.out.println("this is day 6 of the week");
		}else if (week_day.equals("sun")) {
			System.out.println("this is day 7 of the week");
		}
		
	}

	public static void main(String[] args) {
	elseifwithstring();
		int week_day=7;
		if (week_day==1) {
			System.out.println("this is monday");
		}
		else if (week_day==2){
			System.out.println("this is tuesday");	
		}
		else if (week_day==3){
			System.out.println("this is wed");	
		}
		else if (week_day==4){
			System.out.println("this is thu");	
		}
		else if (week_day==5){
			System.out.println("this is fri");	
		}
		else if (week_day==6){
			System.out.println("this is sat");	
		}
		else if (week_day==7){
			System.out.println("this is sun");	
		}
		else {
			System.out.println("enter a valid number");
		}
	}

}
