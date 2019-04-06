package com.class17;

public class creatingMethodGreetings1 {

	public static void main(String[] args) {
		creatingMethodGreetings1 obj = new creatingMethodGreetings1();
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
		System.out.println("How are you " + name);

	}

}