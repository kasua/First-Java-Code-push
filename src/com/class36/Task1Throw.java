package com.class36;
 /*
 * / create an exception: when user it trying to withdraw larger amount that the balance    
 * //throw an exception saying “You do not have enough money”
 */
 
 public class Task1Throw {
	
	public static void main(String[] args) {
		
		accountBalace(30);
		
	}

	public static void accountBalace(int balance) {
		if(balance>40) {
			System.out.println("You do not have enough money");
		}else {
			
		 throw new ArithmeticException("Your balance is too low");
		
	  }

	}
}
