package com.class17_2;

public class SquareOutLine {

	public static void main(String[] args) {
		
		SquareOutLine square=new SquareOutLine();
		square.SquareOutLinePrint();
		
		/*
		 * I want to print pattern only if rows 1 or 4
		 * 
		 * * * * * * * --> rows=4, columns 6 
		 * *         * 
		 * *         *
		 * * * * * * *
		 */
	}
	    void SquareOutLinePrint() {
	
		for (int i = 1; i <= 4; i++) {

			for (int y = 1; y <= 6; y++) {

				if (i == 1 || i == 4 || y == 1 || y == 6) {

					System.out.print("*");

				} else {

					System.out.print(" ");
				}
           	}
			System.out.println();
		}

	}
}