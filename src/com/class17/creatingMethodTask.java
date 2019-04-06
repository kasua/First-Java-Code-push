package com.class17;

public class creatingMethodTask {

	/*
	 * Create a method that will take 2 parameters as a numbers and print 
	 * the larger number.
	 * 
	 */
	public static void main(String[] args) { 
		creatingMethodTask obj=new creatingMethodTask();
		
		
		obj.findLargerNo(15, 25);
		obj.numberIsEvenOrOdd(5);
		obj.StringIsPalindromeOrNot("madams");
	}

	void findLargerNo(int a, int b) {
		if (a > b) {
			System.out.println(a + " is larger that " + b);
		} else {
			System.out.println(b + " is larger than " + a);
		}
	}
 
	// Create a method that will take a number and prints whether the number is even or odd. 
	
	void numberIsEvenOrOdd(int num) {
		
		if (num % 2 == 0) {
			System.out.println(num + " is even");
		} else
			System.out.println(num + " is odd");
	}
   
	//Create a method that will print whether a given  String is palindrome or not.
	
	void StringIsPalindromeOrNot(String word) {
		
		String reverse = "";
		
		for (int i = word.length() - 1; i >= 0; i--) {
			reverse = reverse + word.charAt(i);
		      }
		   if (reverse.contentEquals(word)) {
			System.out.println(word + " is a palindrome");
		
		   } else {
			System.out.println(word + " is not a palindrome");
		}
	 }
  }
