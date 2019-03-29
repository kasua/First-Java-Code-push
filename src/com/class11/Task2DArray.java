package com.class11;

public class Task2DArray {

	public static void main(String[] args) {
		//Create a 2D array where you will store the following values: 
		//Mr, Mrs, Ms, Miss and  Smith, Jordan, Jackson, Obama.
		//After storing values 
		//print the following:Mrs Smith, Mr Obama, Ms Jackson.
		 
		
		String[][] groups= {
				 
				{"Mr", "Mrs", "Ms", "Miss"},
				
				{"Smith", "Jordan", "Jackson", "Obama" }};
		
				
		 System.out.println(groups[0][1] + " " + groups[1][0]);       
		 System.out.println(groups[0][1] + " " + groups[1][3]);        
		 System.out.println(groups[0][2] + " " + groups[1][2]);       
		 System.out.println(groups[0][3] + " " + groups[1][1]);    
		 }
	
			
	}
	


