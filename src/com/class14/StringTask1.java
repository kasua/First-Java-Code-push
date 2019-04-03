package com.class14;

public class StringTask1 {

	public static void main(String[] args) {
		/*
		 * 1 Create a String that will hold a sentence. Write a program to get a new
		 * String without any spaces.
		 * 
		 * 2.Create a String that should be combination of letters, numbers and special
		 * characters. Find out how many alpha characters are there in the String.
		 * 
		 * 3 You have a String a=“Is it Saturday! Is it raining! Do we have a Java Class
		 * today?” How would you find out how many sentences are in that String?
		 * 4
		 */
		String str = " Wellcome to Java Traing";
		String newStr = str.replace("", "");
		System.out.println(newStr);


	     String str2 = " Wellcome2019#4^ to Java Traing";

	      String newString = str2.replaceAll("[^A-Z a-z]", "");
	      System.out.println(newString.length());

 
          String a= "Is it saturday! Is it raining! Do we have a Java Class day?";
          String[] str3 = a.split("[!?]");
          System.out.println(str3.length);
          
          
        		  
	}     		  
        		  
}