package com.class12;

public class StringForReverseOrderTask {

	public static void main(String[] args) {
		
		//Create a String and print it in reverse order (Sunday → yadnuS).
		
		
		 String rev="Sunday";          
		
		for(int i=rev.length()-1;i>=0;i--) {               
			System.out.print(rev.charAt(i));
			
		}

	}

}
