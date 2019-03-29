package com.class10;

public class Task1Arry {

	public static void main(String[] args) {

		/*
		 * 1.Create an array of chars and store grades into it: A,B,C,D,E,F. Then print
		 * a grade B (use 2 different ways of creating an array).
		 */

		char[] grades = { 'A', 'B', 'C', 'D', 'E', 'F' };

		System.out.println(grades[1]);

		System.out.println(grades.length);

		char[] grades1= new char[6];
		

		grades1[0] = 'A';
		grades1[1] = 'B';
		grades1[2] = 'C';
		grades1[3] = 'D';
		grades1[4] = 'E';
		grades1[5] = 'F';
		System.out.println(grades1[1]);
		
		/*
		 * 3.Create an array of words: Java, Saturday, day, coding, is. 
		 * Print the following sentence using element of array: “Saturday is Java coding Day”.
		 *
		 */
		
		String[] words= {"Java", "Saturday", "Day", "Coding", "is"};
		System.out.println ( words[1]+""+words[4]+""+words[0]+""+words[3]+""+words[2]);

	}

}
