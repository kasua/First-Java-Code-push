package com.class14;

public class reverseString {

	public static void main(String[] args) {
		// INTERVIEW Q
		// Reverse a String without using a reverse function

		// 1 using toCharArray();

		String original = "Today is Java Class";
		String reverse = "";
		char[] array = original.toCharArray();
		for (int i = array.length - 1; i >= 0; i--) {
			reverse = reverse + array[i];// ""+"s"

		}
		System.out.println("Reversed String is: " + reverse);

		// 2 charAt()
		String reverse1 = "";
		for (int i = original.length() - 1; i >= 0; i--) {
			reverse1 = reverse1 + original.charAt(i);
		}
		System.out.println("Reversed String is: " + reverse1);

		// 3 using substring

		String reverse3 = "";
		
		for (int i = original.length(); i > 0; i--) {
			//reverse3 += original.substring(i - 1, i);
			reverse3 = reverse3 + original.substring(i-1,i);
		}
		System.out.println("Reversed String is: " + reverse3);
	}
}