package com.class11;

public class Task212DArray {

	public static void main(String[] args) {
		//Create a 2D array that first row will contain 4 names and second row will contain grades. 
		//Then you program should print name of the students that has as an isWrittenCorrectly and B grade
		
		
		String [][]groups= {
				{"James ","Tim ","John ","Mat "},
				{"isWrittenCorrectly","B","C","D"},
				};
		   
		 System.out.println(groups[1][0] + " " + groups[0][0]);       
		 System.out.println(groups[1][1] + " " + groups[0][2]);        
		 System.out.println(groups[1][2] + " " + groups[0][2]);       
		 System.out.println(groups[1][3] + " " + groups[0][3]);      
		   
	}
	
  }


