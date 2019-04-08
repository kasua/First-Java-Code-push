package com.class3;

public class MultipleConditions {

	public static void main(String[] args) {
		/*
		 * Create a Java program and declare int variableClassA that 
		 * will hold a day.
		 * Based on the value of the variableClassA your program should print
		 * the name of the day.*/
   
         int day =15;
      
       if ( day==1) {
    	
      System.out.println("Monday");
  	
    }else if (day==2) {
    	System.out.println("Tusday");
    	
    }else if (day==3) {
    	System.out.println("wednesday");
    }else if (day==4) {
    	System.out.println("Thursday");
    }else if(day==5){
    	System.out.println(" Friday-Fun day");
    }else if (day==6) {
    	System.out.println("Saturday- code day");
    }else if (day==7) {
    	System.out.println("Sunday");
    }else {
    	System.out.println("I don't know what you mean");
    }
	}

}
