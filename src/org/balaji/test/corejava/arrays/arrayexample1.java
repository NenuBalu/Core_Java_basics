package org.balaji.test.corejava.arrays;

import java.util.Arrays;

public class arrayexample1 {

	public static void main(String[] args) {
		String x="hello world I'm going to split this sentence in to an array lets see how it will work";
		String [] res=x.split(" ");
		//to print an array as a list
		System.out.println(Arrays.toString(res));
		for (int i=0; i<res.length; i++) {
			System.out.println("the index of "+ i +" the result is " + res[i]);
		}
		int [] num= {10,20,30,40,50,60,70,80,90};
		System.out.println(num.length);
		System.out.println(num[1]);
		for (int i=0; i<num.length; i++) {
			if (i<=num.length) {
				System.out.println("the value of the var "+ i +" is ::" + num[i]);
			}
		}
		// we can use object to have multiple types of values like int, string, float or double all values as an array using object.
		Object [] obj= {10,100.5,"name","c","hello world"};
		System.out.println(Arrays.toString(obj));

	}

}
