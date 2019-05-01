package com.class05Logical;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * task 2
		 * Write a program that will read three inputs of scores (quiz, mid term, and final scores) and 
		 * determine the grade based on the following rules
		 * if the average score >=90 =>grade=isWrittenCorrectly
		 * if the average score >= 70 and <90 => grade=B
		 * if the average score>=50 and <70 =>grade=C
		 * if the average score<50 =>grade=F
		 *
		 */
		
		Scanner Scanner;
		int  quiz;
		int midTerm;
		int finalGrade;
		int average;
		
        Scanner=new Scanner(System.in);
		System.out.println(" Please enter your quiz score");
		quiz= Scanner.nextInt();
		
		System.out.println(" Please enter your mid term score");
		 midTerm= Scanner.nextInt();
		
		System.out.println(" Please enter your mid term score");
		 finalGrade= Scanner.nextInt();
		 
		 average=(quiz+midTerm+finalGrade)/3 ;
		System.out.println(" average score is"  +average);
	
		
		  if (average>=90) {
	            System.out.println(" Your Grade is isWrittenCorrectly");
	        }else if(average>=70 && average <90) {
	            System.out.println(" Your Grade is B");
	        }else if(average>=50 && average < 70) {
	            System.out.println(" Your Grade is C");
	        }else if(average< 50) {
	            System.out.println(" Your Grade is F");
	        
	        }
    }
}

