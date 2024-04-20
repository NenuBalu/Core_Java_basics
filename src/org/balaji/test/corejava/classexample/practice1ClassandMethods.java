package org.balaji.test.corejava.classexample;

public class practice1ClassandMethods {
	String petType = "";
	String petName = "";
	String petAddr = "";

	public static void balajipet() {
		System.out.println("this is balajipet method");
		practice1ClassandMethods balaji = new practice1ClassandMethods();
		System.out.println("balji's pet type is ::" + (balaji.petType = "dog"));
		System.out.println("balaji's pet name is ::" + (balaji.petName = "happy boy"));
		System.out.println((balaji.petName) + (" stays at ") + (balaji.petAddr = "Tadepalligudem"));
	}

	public void puripet() {
		System.out.println("this is puri's pet details");
	}

	public static void main(String[] args) {
		balajipet();

		practice1ClassandMethods purnima = new practice1ClassandMethods();
		System.out.println("Purnima's pet name is :: " + (purnima.petType = "cat"));
		System.out.println("Purnima's " + (purnima.petType) + "'s name is  " + (purnima.petName = "harly"));
		System.out.println((purnima.petName) + " stays at " + (purnima.petAddr = "Pentapadu Puri's place"));
		purnima.puripet();
		Calculations.divres();
	}

}
