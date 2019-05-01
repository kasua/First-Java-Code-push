package com.class06;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		

			  String number, scenario;

			  Scanner scan=new Scanner(System.in);
			  System.out.println("Enter the age of the Child");
			   number = scan.nextLine();
			   
			   System.out.println("Enter scenario"); 
			   scenario = scan.nextLine();
			 
			   switch (scenario) {

			    case  "Age One":
			    	scenario=" You can Crawl";
			      break;
			     case "Age Two":
			    	 scenario="You can Talk";
			       break;
			     case "Age Three":
			    	 scenario="You can Dance";
			       break;
			     case "Age Four":
			    	 scenario= "You can get  Trouble";
			       break;
			   
			     
			   default:
			   
			      scenario= "I don't know how old you are";
                    break;
	  
	            } System.out.println("The scenario is "+scenario);
	}

}
	


