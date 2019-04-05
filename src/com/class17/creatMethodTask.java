package com.class17;

public class creatMethodTask {

	/*
	 * Create a method that will take 2 parameters as a numbers and prints which
	 * number is larger.
	 * 
	 */
	public static void main(String[] args) { 
		creatMethodTask obj=new creatMethodTask();
		
		
		obj.findLarger(15, 25);
		obj.evenOrOdd(5);
		obj.palindromeOrNot("madams");
	}

	void findLarger(int a, int b) {
		if (a > b) {
			System.out.println(a + " is larger that " + b);
		} else {
			System.out.println(b + " is larger than " + a);
		}
	}
 
	// Create a method that will take a number and prints whether the number is even or odd. 
	
	void evenOrOdd(int num) {
		
		if (num % 2 == 0) {
			System.out.println(num + " is even");
		} else
			System.out.println(num + " is odd");
	}
   
	//Create a method that will print whether a given  String is palindrome or not.
	
	void palindromeOrNot(String word) {
		
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
