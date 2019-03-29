package com.class4;

import java.util.Scanner;

public class NestedIfStatement2 {

	public static void main(String[] args) {
		/*
		 * Write a program to ask user to enter numbers of worked years and annual salary. 
		 * If user worked for more or equals to 5 years than user is eligible for the bonus,otherwise he is not. 
		 * Once user is eligible and salary is larger than 50000 than bonus = 5000, otherwise bonus=3000.

		 */
		
		int workedYears=5;
		int annualSalary=50000;
		
		Scanner WY =new Scanner(System.in);
		System.out.println("What is the number of years you worked");
		 
		workedYears=WY.nextInt();
		
		
		if ( workedYears>=5) {
			System.out.println("You are eligible for bones");
		}else {
			System.out.println("You are not eligible for bonus");
		
			if( annualSalary>=500000) {
			System.out.println("The bonus is 5000");
		}else {
			System.out.println("bonus will be 3000");

	      }

       }
		
	}
	
}