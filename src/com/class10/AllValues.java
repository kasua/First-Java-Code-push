package com.class10;

public class AllValues {

	public static void main(String[] args) { 
		                // 0    1    2    3    4    5  index is =5
		char[] grades = { 'A', 'B', 'C', 'D', 'E', 'F' };// size is 6

		for (int i = 0; i <= grades.length-1; i++) { //if leave out (-1),will get 6 then error= Arryoutofboundery.
			System.out.print(grades[i] + " , ");
		}
      System.out.println( "  ");
	}
}
