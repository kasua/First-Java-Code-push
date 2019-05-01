package com.class04;

public class NestedIfStatement {

	public static void main(String[] args) {
		/*
		 * Create a Java program and store variables to 
		 * store mortgage rate and mortgage price. 
		 * First program should check if rate is higher than 4.5 
		 * user will not buy a house, otherwise user will consider buying.
		 *  Once user decides to buy a house, if price of the house is larger 
		 *  than 200000 than user will take a loan, otherwise user will pay cash.
		 */
		
		double mortgageRate=4.5;
		double allowedPrice=200000;
		
		if (mortgageRate>4.5) {
			System.out.println("I will not buying the House");
		}else {
			System.out.println("I will consider buying  the house");
		
			if( allowedPrice>=200000) {
			System.out.println("I will take a loan");
		}else {
			System.out.println("I will pay cash");

	      }

       }
		
	}
	
}