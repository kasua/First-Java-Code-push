package com.class08;

public class TaskForLoopSum {

	public static void main(String[] args) {

		int sum = 0;

		for (int i = 1; i <= 5; i++) {
			sum = sum + i;
		}

		System.out.println(sum); // 15

		/* Find sum of all even numbers from 1 to 100 inclusive */

		  int sum1 = 0;
		 
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				sum1 = sum1 + i;
		}
		System.out.println(sum1);
	}
 }
}
