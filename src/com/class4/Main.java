package com.class4;


import java.util.Scanner;


      class Main {

	public static void main(String[] args) {
	
	 	int num1, num2;

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the first number");
		num1 = input.nextInt();
		System.out.println("Please enter the second number");
		num2 = input.nextInt();

		if (num1 * num2 > 0) {
			System.out.println("True & it is positive");

		} else {
			System.out.println("False & it is negative");
		}

	}

}
