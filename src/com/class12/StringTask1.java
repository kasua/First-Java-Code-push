package com.class12;

import java.util.Scanner;

public class StringTask1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); // User input
		System.out.println("Enter Values :");
		
		int array[]= new int[5]; // Intilized array of size 5
		
		for (int i=0;i<array.length;i++) { // used for loop for user input
		array[i]=input.nextInt(); // Assigned users value to array
		}
		   int mult=1;
		for (int i=1;i<5;i++) { // for loop to display value
			mult= array[i]* mult;
			
			
		System.out.println(mult);
	}
  
		
   }
 }