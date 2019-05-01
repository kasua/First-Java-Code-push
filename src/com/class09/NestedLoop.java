package com.class09;

public class NestedLoop {

	public static void main(String[] args) {
		
		//outer loop
		for (int i = 0; i < 3; i++) {
             
			/*inner loop 
			*if outer loop is true then the iteration is continue 
			*until it became false then go back to outer loop & print
			*
			*/
			for (int y = 0; y < 3; y++) {

				System.out.println("I am inner loop"+y);
			}
			System.out.println("----I am outer loop--------"+i);
		}

	}

}
