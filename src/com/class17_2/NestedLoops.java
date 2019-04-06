package com.class17_2;

public class NestedLoops {

	public static void main(String[] args) {

		// for( int i=0;i<=5;i++) {
		// System.out.println(i);

		/*
		 * I want to print pattern 12345---> 4 rows & 5 columns 12345 12345 12345
		 */

		for (int i = 1; i < 5; i++) {
			for (int y = 1; y < 6; y++) {
				System.out.print(y);// 12345
			}
			System.out.println();
		}
		/*
		 * I want to print pattern 1111111---> rows=7 & columns=7 2222222 3333333
		 * 4444444 5555555 66666666 7777777
		 */

		for (int i = 1; i <= 7; i++) {
			for (int y = 1; y <= 7; y++) {
				System.out.print(y);// 1111111//2222222
			}
			System.out.println();
		}

		/*
		 * I want to print pattern 12345---> 4 rows & 5 columns 12345 12345 12345
		 */
		for (int a = 0; a < 4; a++) {
			for (int b = 0; b < 5; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		/*
		 * I want to print pattern 54321---> 4 rows & 5 columns 54321 54321 54321
		 */

		for (int c = 0; c < 4; c++) {
			for (int d = 0; d < 5; d++) {
				System.out.print(c + "" + d);
			}
			System.out.println();
		}

		/*
		 * I want to print pattern 55555---> 5 rows & 5 columns 66666 77777 88888
		 */
		for (int e = 0; e < 4; e++) {
			for (int f = 0; f < 5; f++) {
				System.out.print(e + "" +f);
			}
			System.out.println();
		}

	}

}
