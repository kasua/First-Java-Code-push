package com.class05Logical;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		/*
		 *Prompt the user to enter person's heights in inches. 
		 *Each person should be classified as one of the following:
		 *short (under 5 feet)
		 *medium(5 to 6 feet)
		 *tall (6 feet and over
		 
		 */
		

	    double height;
		
		Scanner inc=new Scanner(System.in);
		System.out.println(" Please enter your height in inches");
		height=inc.nextDouble();
		 
		if (height==5 && height <6 ) {
	            System.out.println("You are a medium");
	        }else if(height <5 ) {
	        	System.out.println("You are short");  	
	        }else if (height>=6) {
	        	System.out.println("You are tall");
	        } else{
	        	System.out.println("Please enter valid height");
	        }
	        	
	      }
	            
	 }


