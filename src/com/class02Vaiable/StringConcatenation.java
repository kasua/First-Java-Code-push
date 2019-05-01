package com.class02Vaiable;

public class StringConcatenation {

	public static void main(String[] args) {

		String name = "John";
		// my name is John;
		System.out.println("My name is  " + name);

		String day = ("Sunday");
		// sunday is a coding day

		System.out.println(day + "is a coding day");

		int num1 = 12;
		int num2 = 13;

//The value of num1__and the value of num2__.

		System.out.println("The value of num1 is " + num1 + " and value of num2 is " + num2 + ".");

		/*
		 * String name="John"; String LastName= "Smith"; char grade='B'; String city=
		 * "Fairfax"; String state='VA'; Long phoneNumber=9234567890l; print My name is
		 * __and my Last name is___ I am ____student I live in a city of ____ in a state
		 * of___ my classExamplePhone number is_____
		 */

		String firstName = "Mike";
		String LastName = "Jordan";
		char grade = 'A';
		String city = "Fairfax";
		String state = "VA";
		Long phoneNumber = 1234567890L;

		// My name is __and my Last name is___

		System.out.println("My name is " + name + " and my last name is  " + LastName + ".");

//I am ____student

		System.out.println("I am " + grade + "student");

//I live in a city of ____ in a state of___

		System.out.println("I live in city of " + city + " in a state of " + state);

// my classExamplePhone number is_____

		System.out.println("My classExamplePhone number is " + phoneNumber);

	}

 }
