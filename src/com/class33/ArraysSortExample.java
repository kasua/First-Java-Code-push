package com.class33;

//2. Create an array of Strings and using Arrays class  class sort the values of that array of Strings.
//class sort the values of that array of Strings.

// A sample Java program to sort an array of strings 
//in ascending and descending orders using Arrays.sort(). 

 import java.util.Arrays;
 import java.util.Collections;

 
 public class ArraysSortExample {
	public static void main(String[] args) {
		
		String arr[] = { "practice.School.org", "quiz.School.org", "code.Java.org" };

		// Sorts arr[] in ascending order
		
		Arrays.sort(arr);
		System.out.printf("Modified arr[] : " + Arrays.toString(arr));

		// Sorts arr[] in descending order
		Arrays.sort(arr, Collections.reverseOrder());

		System.out.printf("Modified arr[] :" +Arrays.toString(arr));
	}
}