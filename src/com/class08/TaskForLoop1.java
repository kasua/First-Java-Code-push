package com.class08;

public class TaskForLoop1 {

	public static void main(String[] args) {
		// TaskForAndForEachLoop 1
		/*
		 * 1.Print numbers from 1 to 100 2.Print numbers from 100 to 1 3.Print odd
		 * numbers from 1 to 20 (2 ways) 4.Print even numbers from 20 to 1 (2 ways)
		 * 5.Print even numbers between 20 and 50 (2 ways) 6.Print odd numbers between
		 * 20 and 50 (2 ways)
		 * 
		 */
		for (int a = 1; a <= 100; a++) {
			System.out.println(a);
		}
		// TaskForAndForEachLoop 2
		for (int b = 100; b >= 1; b--) {
			System.out.println(b);
		}
		// TaskForAndForEachLoop 3
		for (int c = 1; c <= 20; c += 2) {
			System.out.println(c);
		}
		// TaskForAndForEachLoop 4

		for (int d = 20; d >= 1; d -= 2) {
			System.out.println(d);
		}
		// TaskForAndForEachLoop 5

		for (int e = 20; e <= 51; e += 2) {
			System.out.println(e);
		}
		// TaskForAndForEachLoop 6

		for (int f = 19; f <= 50; f += 2) {
			System.out.println(f);

		}

	}
}
