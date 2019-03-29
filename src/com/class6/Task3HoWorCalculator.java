package com.class6;

import java.util.Scanner;

public class Task3HoWorCalculator {

	public static void main(String[] args) {
		/*
		 * HomeWork: Using scanner class create calculator. 
		 * Allow user to enter 2 numbers and operator(+,-,*,/). 
		 * Based on operator provide the result to user.
		 */

		    int num1, num2;
		    int result;
		    char operator;
		    
		    Scanner scan=new Scanner(System.in);
		    System.out.println("please enter the first number");
		    num1=scan.nextInt();
		    System.out.println("please enter the second number");
		    num2=scan.nextInt();
		    System.out.println("please enter operator +,-,*,/");
		    operator=scan.next().charAt(0);
		    
		    switch (operator) {
		    
		    case '+':
		    	result=num1+num2;break;
		    	
		    case '-':
		    	result=num1-num2;break;
		    
		    case '*':
		    	result=num1*num2;break;
		   
		    case '/':
		    	result=num1/num2;break;
		    	
		    default :
		    	result='0';
		    	
		    }
		    
		    System.out.println("Your operator result" +result);
		    
	}

}
