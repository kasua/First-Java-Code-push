
package com.class11;

public class Largest {
	
	public static void main(String[] args) {
		// Create an array of integers and find the largest number

		int[] numbres = { 2, 40, 60, 8 ,-2};
		int largest = numbres[0];
		for (int i = 0; i < numbres.length; i++) { // create integer largest to compare with the first element
													// if(numbers[i]>largest) {
													// Then when a larger number is found in the array, it becomes
													// largest=numbers[i];
													// the largest }
		}
		System.out.println("The largest numbres is:" + largest);
	}

}
