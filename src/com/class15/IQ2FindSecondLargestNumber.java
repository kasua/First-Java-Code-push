package com.class15;

public class IQ2FindSecondLargestNumber {

	public static void main(String[] args) {
		/*
		 * int arr[] = { 1000, 46, 1, 86, 292, 2 };
		 * 
		 * int min = arr[0];// 0 
		 * int secondLargest = 0;// 0 
		 * int largest = 0;// 0 
		 * for (int a : arr) { 
		 * if (a > largest) { 
		 * largest = a; 
		 * } 
		 * if (a < min) {
		 *  min = a; 
		 *  } 
		 * }
		 * for (int a : arr) { 
		 * if (a > secondLargest && a < largest) { secondLargest =a; 
		 *   } 
		 * } 
		 * System.out.println("min = " + min);
		 * System.out.println("Second Largest = " + secondLargest);
		 * System.out.println("Largest = " + largest);
		 */

		int arr[] = { 144, 46, 0, 86, 292, -1 };

		int largest = arr[0];
		int secondLargest = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}
			if (arr[i] > secondLargest && arr[i] != largest) {
				secondLargest = arr[i];
			}
		}
		System.out.println("2nd largest number is:" + secondLargest);
		System.out.println("largest number is:" + largest);

	}

}
