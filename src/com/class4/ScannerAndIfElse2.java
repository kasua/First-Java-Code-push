package com.class4;

import java.util.Scanner;

public class ScannerAndIfElse2 {
	/*
	 * You are a loan specialist and you need to ask user 
	 * what is the amount of loan is needed. 
	 * If loan is less than 200,000 then you would lend the money 
	 * otherwise you would reject the client.
	 */

	public static void main(String[] args) {
		
		int loanMoney;
		
		Scanner scan= new Scanner(System.in);
		System.out.println("What is the amount of loan needed");
		
		loanMoney =scan.nextInt();
		
		if(loanMoney<200000) {
			System.out.println("You can get the Money");
		}else {
			System.out.println("Sorry. You can not get the Money");
		}
		

	}

}
