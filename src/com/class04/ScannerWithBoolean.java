package com.class04;

import java.util.Scanner;

public class ScannerWithBoolean {

	public static void main(String[] args) {

	    boolean isTrue;
	  
	   Scanner scan= new Scanner(System.in);
	   System.out.println("Input the boolean value");
	    
	    isTrue=scan.nextBoolean();
	    
	    System.out.println("The value is "+isTrue);

	}

}
