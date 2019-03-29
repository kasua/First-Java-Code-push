package com.class5;

public class LogicalOperator {

	public static void main(String[] args) {
		/* logical AND &&
		 * True and True =True
		 * True and False=False
		 * False and True =False
		 * False and False= False
		 * Logical  OR II
		 * 
		 * True and True =True
		 * True and False=True
		 * False and True =True
		 * False and False= False
		 * Logical  
		 * 
		 * if number is between 1-10---> number is small
		 *  if number is between 11-100---> number is mediam
		 *  if number is between 101-1000---> number is large
		 */ 
		 int num =15;
		  //true AND False---> False
		 if (num>=1 && num<=10){
			 System.out.println("number is small");
			 //true AND true --->true
		 }else if(num>=11 && num<=100) {
			 System.out.println("number is medium");
			 // false AND True---->false
		 }else if(num>=101 && num<=1000) {
			 System.out.println("number is large");
		 }else {
			 System.out.println("number is not in our range");
		 }
	}

}
