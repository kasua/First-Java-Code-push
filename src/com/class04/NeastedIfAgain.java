package com.class04;

public class NeastedIfAgain {

	public static void main(String[] args) {
		/*
		*  declare variableClassA for gpa and having a diploma
		*  if user has a diploma-> congratulations --> 
		*  if gpa is higher 3.5--> hire person
		*  else do not hire.
		*/
		
		       double gpa=3.6;
		       double expectedGpa=3.7;
		       boolean hasDiploma=true;
		       
	 if (hasDiploma) {
		   System.out.println("Congratulations");
		    	   
	 if (gpa>expectedGpa) {
		   System.out.println("You are hired");
    }else {
		System.out.println("Unfortunately we cannot hire you");
		    	   
		System.out.println("Please get your degree");
      }
	 
	}
	 
	}
	  
	}
