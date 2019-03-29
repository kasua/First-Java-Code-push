package com.class1;


public class Largest {

	public static void main(String[] args) {
		// create an array of integer and find largest number

		int[] numbers = { 200, 20, 13, 4, 65 };

		int largest = numbers[0];

		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] > largest) {
				largest = numbers[i];
			}
		}
		System.out.print("The largest number is " + largest);
	}
}