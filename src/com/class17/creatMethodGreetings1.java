package com.class17;

public class creatMethodGreetings1 {

	public static void main(String[] args) {
		creatMethodGreetings1 obj = new creatMethodGreetings1();
		obj.askHowAreYou("  "); //argument

	}

	void askHowAreYou(String name) {
		System.out.println("How are you " + name);
	}

	void askHowAreYou1(String name) { // parameter
		System.out.println("How are you " + name);
	}

	void askHowAreYou2(String name) {
		System.out.println("How are you " + name);
	}
	
	void askHowAreYou3(String name) {
		System.out.println("Hoe are you " + name);

	}

}