package org.balaji.test.corejava.stringclassexamples;

import java.util.stream.IntStream;

public class string_class_examples {
	static String surname=" Bathina";
	public void stringclass1() {
		char ch =surname.charAt(10);
		System.out.println(ch);
	}
	public void string_class2() {
		IntStream a=surname.chars();
		System.out.println(a);
	}
	public static void main(String[] args) {
		String fullname = "Chandra Sekhar Ayyappa Balaji";
		char ch =fullname.charAt(10);
		System.out.println(ch);
		// uppercase to change all chars to upper case
		String nameupper =fullname.toUpperCase();
		System.out.println(nameupper);
		//length to find the length
		System.out.println(fullname.length());
		//indexof to get the index of any word or char where the char is or the word is
		int indexOfText = fullname.indexOf("a");
		System.out.println(indexOfText);
		//replace replace the string with empty with spaces
		String replacetext=fullname.replace(" ", "");
		System.out.println(replacetext);
		// length find the length of the replaced text we can also store the replaced string with existing string.
		System.out.println(replacetext.length());
		//equals to check if two strings are equal
		System.out.println(fullname.equals(replacetext));
		//replacetext to check if two strings are equal ignoring case senstive
		System.out.println(fullname.equalsIgnoreCase(replacetext));
		//concatination to add two strings 
		String entirename=fullname.concat(surname);
		System.out.println(entirename);
		//starts with to check if the string starts with specific keyword or char
		boolean startswith=entirename.startsWith("Ch");
		System.out.println(startswith);
		System.out.println(entirename.startsWith("Ch"));
		//ends with to check with ends with 
		boolean endswith=entirename.endsWith("na");
		System.out.println(endswith);
		//to char array
		char [] array1=entirename.toCharArray();
		System.out.println(array1);
		// remove unwanted spaces
		String course="    selenium    ";
		System.out.println(course);
		System.out.println(course.trim());
		//split with a char and  create a array
		String splittedname[]=entirename.split("y");
		System.out.println(splittedname[0]);
		System.out.println(splittedname[2]);
		// to check if the string is empty or not
		System.out.println(entirename.isEmpty());
		
	}

}
