package com.class12;

public class StringForNotEmptyTask {

	public static void main(String[] args) {
		 /*Create a String and if the String is not empty perform the following: 
		  * if the String has an odd number of characters and has 3 or more characters, 
		  *print the character in the middle of the StringAsimgencer4382 
	      */
		
		
		String str="Hello Java";       
		
		for(int i=str.length()-1;i>=0;i--) {           
			System.out.print(str.charAt(i));       
			}      
		System.out.println();                
		
		if(!(str.isEmpty())) {            
			if(str.length()%2!=0 && str.length()>3) {                               
				System.out.println(str.charAt(str.length()/2));                           
				}       
			}   
		}
		
	}

