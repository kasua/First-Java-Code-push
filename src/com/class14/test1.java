package com.class14;

import java.util.Arrays;
import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {

		/*
		 * String str, rev = ""; 
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * System.out.println("Enter a string:"); 
		 *    str = sc.nextLine();
		 * 
		 * int length = str.length();
		 * 
		 * for ( int i = length - 1; i >= 0; i-- ) {
		 *      rev = rev + str.charAt(i);
		 * 
		 * if (str.equals(rev)) { 
		 * System.out.println(str+ " is a palindrome"); 
		 * }else {
		 * System.out.println(str+" is not a palindrome");
		 *
		 * }
		 * 
		 * System.out.println("------------------------------   ");
		 */

		/*
		 * int num = 0;
		 * 
		 * Scanner input = new Scanner(System.in);
		 * System.out.println("Please enter a number to check"); 
		 *    num = input.nextInt();
		 * 
		 * if (num % 2 != 0 || num >= 2) { 
		 * System.out.println("This is a prime number");
		 * 
		 * } else {
		 * 
		 * System.out.println("This is not a prime number"); }
		 */

		// using for loop

		/*
		 * int n = 10, 
		 * t1 = 0, 
		 * t2 = 1;
		 * 
		 * System.out.print("First " + n + " terms: ");
		 * 
		 * for (int i = 1; i <= n; ++i) { 
		 * System.out.print(t1 + " + ");
		 * 
		 * int sum = t1 + t2;
		 * 
		 * t1 = t2; 
		 * t2 = sum; or }
		 */
		// using while loop

		int i = 1, n = 10, t1 = 0, t2 = 1;
		System.out.print("First " + n + " terms: ");

		while (i <= n) {
			System.out.print(t1 + " + ");

			int sum = t1 + t2;
			t1 = t2;
			t2 = sum;

			i++;
		}
		System.out.println("-----------------------------------");

		String a = "Syntax";
		String b = "School";
		a = b + a;
		b = a.replace(b, "");
		a = a.replace(b, "");
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
		System.out.println("---------------------------");

		int [] arr= { 14, 46, 47, 86, 92, 52, 48, 36, 66, 85 };
		
		int largest = arr[0];
		int secondLargest = arr[0];

		System.out.println("The given array is:");
		for (int x = 0; x < arr.length; x++) {
			
			System.out.print(arr[x] + ",");
		}
		for (int x = 0; x < arr.length; x++) {

			if (arr[x] > largest) {
				secondLargest = largest;
				largest = arr[x];

			} else if (arr[x] > secondLargest) {
				secondLargest = arr[x];

			}
		}

		System.out.println(" Second largest number is:" + secondLargest);
		
		
		Arrays.sort(arr);
		System.out.println("Minimum = " + arr[0]);
		System.out.println("Maximum = " + arr[arr.length-1]);

	}

}
