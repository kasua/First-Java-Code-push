package com.class11;

public class Task3SumArray {

	public static void main(String[] args) {
		
		//Create an array on integers and calculate the sum of all elements in an array.

		int sum = 0;

		int[] numbers = { 1,2,3,4,5 };
		
		for (int a = 0; a < numbers.length; a++) {

			sum = sum + numbers[a];

			System.out.println(sum);

		}
	}
}
