package com.class6;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		/*
		 *Prompt user to: "Please enter your birthday month number
		 *if user enters 12, 1, 2 --> season="Winter"
		 *if user enters 3, 4, 5--> season="Spring"
		 *if user enters 6, 7, 8 --> season="Summer"
		 *if user enters 9, 10, 11--> season="Fall"
		 *if any other number--> "Please enter valid month number" and season="Unknown"
		 *The output of the program should be : "You were born in __ " 
		 *  
		 */
	       Scanner scan;
	       int monthNum;
           String season="";
  
  scan=new Scanner(System.in);
  System.out.println("Please enter your birthday month number");
      monthNum =scan.nextInt();
      
      if(monthNum==12 || monthNum== 1 || monthNum== 2) {
            season="Winter";
        
      }else if(monthNum==3 ||monthNum== 4 ||monthNum==5){
            season="Spring";
 
      }else if(monthNum==6 ||monthNum== 7 ||monthNum==8){
            season="Summer";
        
      }else if(monthNum==9 ||monthNum== 10 ||monthNum==11){
            season ="Fall";
      }
      
      else {
    	  System.out.println("Please enter valid month number");
    	  season="unknown";
        
      }
       
      System.out.println("You were born in "+season);
     
}


} 