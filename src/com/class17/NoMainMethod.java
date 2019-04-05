package com.class17;

public class NoMainMethod {
	// methods and variables or data members are member of the class.

	String str;
	int num;

	void hello() {
		System.out.println("hello");
		System.out.println("hello frinds");
		System.out.println("hello");
		System.out.println("hello frinds");
	}

	void bye() {
		System.out.println("Bye");

	}

	public static void main(String[] args) {// method signature
		                   // new creating object
		NoMainMethod obj = new NoMainMethod();// method body

		obj.hello();// we calling a method hello
		obj.bye();
		
		}
	 void howAreYou() {
		 System.out.println("How are you?");
	 }
}
