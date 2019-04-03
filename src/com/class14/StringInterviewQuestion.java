package com.class14;

import java.util.Arrays;
import java.util.Scanner;

public class StringInterviewQuestion {

	public static void main(String[] args) {
		/*
		 * 1. Write a program to swap 2 numbers without a temporary variable? Swap 2 
		 *    strings without a temporary variable?
		 * 2. Write a java program to find the second largest number in the array?
		 *    Maximum and minimum number in the array?
		 * 3. Find out how many alpha characters present in a string? 
		 * 4. How to find out the part of the string from a string? What is substring? Find number of words in string? 
		 * 5. Write a java program to reverse String? Reverse a string word by word? 
		 * 6. Write a Java Program to find whether a String is palindrome or not? 
		 * 7. Write a java program to check whether a given number is prime or not?
		 * 8. Write a Java Program to print first 10 numbers of Fibonacci series.
		 */
   //1.How to swap two numbers without using temporary variable?
		int x = 10;
        int y = 20;
        System.out.println("Before swap:");
        System.out.println("x value: "+x);
        System.out.println("y value: "+y);
        x = x+y;// get sum =30
        y=x-y;  // 30-20=10
        x=x-y;   //30-10=20
        System.out.println("After swap:");
        System.out.println("x value: "+x);
        System.out.println("y value: "+y);
       //System.out.println()
        
		System.out.println("---------------------  ");
		
     //1. Write a program to swap 2 strings without a temporary variable?
		//using .substring()
		 String s1 ="Java";//4
		 String s2 ="Training";//8
		 s1= s1+s2;//   JavaTraining------>12
		 s2 = s1.substring(0,(s1.length() - s2.length())); //Java
		 s1 = s1.substring(s2.length()); 
		 System.out.println("s1 == "+ s1);
		 System.out.println("s2 == "+ s2);

      System.out.println("------------------------------------");
      // using .replace()
      String a = "Syntax";            
      String b ="School";          
      a=b+a;
      b= a.replace(b,"");
      a= a.replace(b,"");         
      System.out.println("a : "+a); 
      System.out.println("b : "+b);


      System.out.println("-----------------------------------------");
		
      // 2.Write a java program to find the second largest number in the array?
      //Maximum and minimum number in the array?
     
      int [] arr= { 14, 46, 47, 86, 92, 52, 48, 36, 66, 85 };
		int min=arr[0];
		int largest = arr[0];
		int secondLargest = arr[0];
         
		System.out.println("The given array is:");
		for (int k = 0; k < arr.length; k++) {
			
			System.out.print(arr[k] + ",");
		}
		for (int k = 0; k < arr.length; k++) {

			if (arr[k] > largest) {
				secondLargest = largest;
				largest = arr[k];

			} else if (arr[k] > secondLargest) {
				secondLargest = arr[k];

		}
	}

		System.out.println(" Second largest number is:" + secondLargest);


		for (int e : arr) {
			System.out.println(arr + " ");
			
 // 2. Maximum and minimum number in the array?
			Arrays.sort(arr);
			System.out.println("Minimum = " + arr[0]);
			System.out.println("Maximum = " + arr[arr.length-1]);	
			
		}
		System.out.println("------------------------------------------");
	
		//3 Find out how many alpha characters present in a string? 	 
		  
		  String s = "BC+D*E-=";

	    for (int p = 0; p < s.length(); p++) {
	       char charAt2 = s.charAt(p);
	        
	       if (Character.isLetter(charAt2)) {
	            System.out.println(charAt2 + "is a alphabet");

	            
		    }
		System.out.println("---------------------------------------");
		/*        
		 * 6. Write a Java Program to find whether a String is palindrome or not?         
		 *  Palindrome is a word, phrase, or sequence that reads the same backward as        
		 * forward, e.g., madam or nurses run        
		 */
		
		String str1, rev = "";
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string:");
		str1 = sc.nextLine();

		int length = str1.length();

		for (int n = length - 1; n >= 0; n--) {
			rev = rev + str1.charAt(n);

			if (str1.equals(rev)) {
				System.out.println(str1 + " is a palindrome");
			} else {
				System.out.println(str1 + " is not a palindrome");

			}
          
		}
		System.out.println("-------------------------------------");
		
	     /*7. Write a java program to check whether a given number is prime or not?       
	      *   Prime number is a number that is greater than 1 and is only divisible by 1 or itself        
	      *   0 and 1 are not prime numbers  
	      *   2 is the only even prime number.        
	      *   
	      */           
		  
		int num = 0;           
		
		Scanner input = new Scanner(System.in);            
		System.out.println("Please enter a number to check");           
		    num = input.nextInt();                       
		
		    if (num%2!=0 || num>=2) {                
			System.out.println("This is a prime number");                          
			
		    }else {                
				
		    	System.out.println("This is not a prime number");           
		}  
		    
		   System.out.println("-------------------------------"); 
		   
		   /*
		    *  8.Write a Java Program to print first 10 numbers of Fibonacci series. 
		    *  Fibonacci series means :-a series of numbers in which each number ( Fibonacci number ) 
		    *  is the sum of the two preceding numbers.
		    *  The simplest is the series 1, 1, 2, 3, 5, 8, etc.
		    */
		   
		     int n = 10, t1 = 0, t2 = 1;
	       
		     System.out.print("First " + n + " terms: ");

	        for (int m = 1; m <= n; ++m)
	        {
	            System.out.print(t1 + " + ");

	            int sum = t1 + t2;
	           
	            t1 = t2;
	            t2 = sum;
	        }

       }
	
	
	}

}
