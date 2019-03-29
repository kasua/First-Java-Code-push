package com.class9;

import java.util.Scanner;

public class Task5WhileIfelseIf {

	public static void main(String[] args) {
		/*
		 * Write a guessing game where the user has to guess a secret number between 1
		 * and 20. After every guess input, the program tells the user whether their
		 * number was too large or too small. The program will keep asking the user to
		 * enter the number until he finds the correct number. When the correct answer
		 * is found the system should display "Congratulations!!. You got it!"
		 * 
		 */

		Scanner myScanner;
		int a, b, input;
		b = 10;

		myScanner = new Scanner(System.in);
		System.out.println("Enter a guesing secret number between 1 and 20");
		input = myScanner.nextInt();

		while (input != b) {

			if (input < b) {
				System.out.println("your number  is too small");
				input = myScanner.nextInt();

			} else if (input > b) {
				System.out.println("your number is too big");
				input = myScanner.nextInt();

			}

		}
		System.out.println("Congratulations!!. You got it!");
	}

}
