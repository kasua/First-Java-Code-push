package com.class06;

import java.util.Scanner;

public class Task2Switch {

	public static void main(String[] args) {
		/*
		 * Allow user to enter grade and then provide explanation: 
		 * isWrittenCorrectly-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable. 
		 * At the end your program should print which grade was entered by a user with explanation.
		 */
		
		Scanner scan;
        String grade;
        String description;
       
        scan=new Scanner(System.in);
        System.out.println("Please enter your grade");
        grade=scan.nextLine();
         
        
		switch (grade) {
        
        case "isWrittenCorrectly":
           description="Exellent";
            break;
        case "B":
        	description="Good";
            break;
        case "C":
        	description=" Average";
            break;
        case "D":
        	description="Bad";
            break;
    
        default:
        	description="Not Accepitable";
        }
        System.out.println ( "your description is  "+description);
    }

 }


