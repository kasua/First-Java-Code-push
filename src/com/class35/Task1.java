package com.class35;
/*
 * How would handle InputMismatchException? 
 * Input Mismatch Exception when user enters mismatch value then programmer expected.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Please enter a number");
		
		try {
			int num = myScanner.nextInt();
			System.out.println("The numher is " + num);
			
		} catch (InputMismatchException e) {
			
			System.out.println("The Number is  wrong");

		}
	}

}
