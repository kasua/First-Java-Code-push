package com.class4;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		  String weqas;
	       String phoneNumber;
	       int age;
	  Scanner scan=new Scanner(System.in);
	  System.out.println("Enter your name");
	    weqas=scan.nextLine();
	  
	    System.out.println("Enter your mobile number");
	    phoneNumber=scan.nextLine();
	    
	    System.out.println("Enter your age");
	    age=scan.nextInt();
	     
	     
	    System.out.println("your Name is "+weqas+" your age is "+age+" and your mobile number is "+ phoneNumber);
	}

}
