package com.class03Operator;

public class Relationaloperations {

	public static void main(String[] args) {
		
		int a=19;
		int b=5; // replace 19 & 5; by 198 & 50
		boolean result =a>b;
		boolean result1 =a==b;
		System.out.println(result);
		System.out.println(result1);
		
		//compare 2 numbers and if a is larger than b-->print
		
		if (a>b) {
			System.out.println("a is larger than b"); //print only if it is true
		}else {
			System.out.println("b is larger than a"); // print only the first statement is if it is false
		}
		
		//declare price and if price is higher than expected price-->i will not 
		
		     double shoesPrice =29.99;
		     double allowedPrice =31.99;
		
		 if (shoesPrice<= allowedPrice) {
	        System.out.println("I am buying the shoes");
		
		 }else {
	        System.out.println("I am buying NOT those shoes");	
			
		}
		
		System.out.println(" I am conitnues code"); // is not belong to regular state..continue printing
		System.out.println(" I am conitnues code");
		System.out.println(" I am conitnues code");
	}

}

       
