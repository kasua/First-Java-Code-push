package com.class09;

import java.util.Scanner;

public class Task1ForLoopIFElse {

	public static void main(String[] args) {
		/*
		 * 1. Write a program that reads a range set of integers,(start & end point)
		 * provided by a user and then prints the sum of the even and odd integers.
		 * 
		 */

		int sum = 0;
		int sum1 = 0;
		Scanner scan;
		int startRange;
		int endRange;

		scan = new Scanner(System.in);
		System.out.println("Please enter start number");
		startRange = scan.nextInt();
		System.out.println("Please enter end number");
		endRange = scan.nextInt();

		if (startRange < endRange) {

			for (int i = startRange; i <= endRange; i++) {
				if (i % 2 == 0) {
					sum = sum + i;

				} else {
					sum1 = sum1 + i;
				}
			}
			System.out.println("sum of even number " + sum);

			System.out.println("sum of old number " + sum1);

		}
	}
}