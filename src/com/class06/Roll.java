package com.class06;

import java.util.Scanner; 
	public class Roll {
	 //write code below
	 
	public static void main(String[] args){
	     
	      int roll;
	      String name;
	      
	    Scanner input=new Scanner(System.in);
	    System.out.println("enter the roll number of the Child");
	    roll= input.nextInt();
	    name= input.nextLine();
	    
	    
	switch (roll){
	    
	    case 101: 
	      name="Student name: Ramesh";
	      break;
	     
	     case 102: 
	        name="Student name: Mahesh";
	        break;
	      
	      case 103: 
	         name="Student name: Mukesh";
	         break;
	     
	      default:
	    	name=  "Not found Student name: in Class";
	        break;
	   
	} System.out.println(name); 	
	  
    }
	
  }