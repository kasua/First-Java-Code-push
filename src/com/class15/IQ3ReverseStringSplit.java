package com.class15;

public class IQ3ReverseStringSplit {
	/*
	 * Write a java program to reverse String? Reverse a string word by word?
	 */
	public static void main(String[] args) {
		
		   /*  String sentence = "The master is speaking ";
		     String reverse = "";
		
		for (int i = sentence.length() - 1; i >= 0; i--) {
			reverse = reverse + sentence.charAt(i);
		}
		      String[] words = reverse.split(" ");
		
		      for (int i = words.length - 1; i >= 0; i--) {
			      
		    	  System.out.print(words[i] + " ");
		      } 
		      */
		    	  System.out.println("-----------------------------------");
		    	
		    	 
		    	  
		    	String sentence="The master is speaking ";
				String reverse="";
				
				for (int i=sentence.length()-1;i>=0;i--) {
					reverse=reverse+sentence.charAt(i);
				}
				
				String[] words=reverse.split(" ");
				
				for(int i=words.length-1; i>=0;i--) {
					System.out.print(words[i]+" ");
		   }
		}
	}


