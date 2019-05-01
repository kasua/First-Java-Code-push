package com.class26;
/*
 *  Write program as a student class   that has instance variables name and address. 
 *  Create a constructor that will initialize those variables.
 *   Print name & address of given  student by the displayInfo method
 */


public class Task1 {
	String name;
	String Address;

	Task1(String name, String Address) {
		this.name = name;
		this.Address=Address;
	}
	
	public void displayinfo() {
		System.out.println("Student name "+name+" And address is "+Address);
	}
	
	public static void main(String[] args) {
		Task1 tt=new Task1("kasu Amera", "2010 sping run ct");
		tt.displayinfo();
		
	}
}









