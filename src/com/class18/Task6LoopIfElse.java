package com.class18;

import java.util.Scanner;

public class Task6LoopIfElse {

	public static void main(String[] args) {
		/*
		 * Ask a user to input a leap year. Give the user 10 chances to enter a correct
		 * leap year. As soon as the user enters the correct leap year exit the loop.
		 * 
		 */
		Scanner myScanner;
		int leapYear;

		myScanner = new Scanner(System.in);
		System.out.println(" Enter your leap year");
		leapYear = myScanner.nextInt();

		for (int x = 1; x <= 10; x++) {

			if (leapYear % 4 != 0) {
				System.out.println(leapYear + " is not a leapYear");

			} else if (leapYear % 4 == 0) {
				System.out.println(leapYear + " is a leapYear");
			}
		}
	}
}
