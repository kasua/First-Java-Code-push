package com.class4;

import java.util.Scanner;

public class ScannerAndIfElse {

	public static void main(String[] args) {
		/*
		 * You are DMV representative and you need to ask customer their age. 
		 * If they are 18 and older you will issue a driver license to them,
         *otherwise you will offer them to get a learners permit.
		 */
		
		     int age;
		Scanner scan=new Scanner(System.in);
		System.out.println("What is you age");
		
		age=scan.nextInt();
		
		if(age>18) {
			System.out.println("You will issue a Driver Lissence");
		}if (age>=16){
			System.out.println("You can only apply a learner permit");
		}else {
			System.out.println("You are not allowed to appy either DL or LP");
		}

	}

}
