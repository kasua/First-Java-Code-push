package com.class05Logical;

import java.util.Scanner;

public class LogicalOperator1 {

	public static void main(String[] args) {
		/*
		 * Write a java program to ask a user enter daily sales amount
		 * Based 
		 * 
		 */
        Scanner scan;
		int sales;
		int commission;
		
		scan= new Scanner(System.in);
		System.out.println("Please enter sales amount");
		sales=scan.nextInt();
		 if(sales>0 && sales <100) {
			 commission=2;
		 }else if (sales>=100 && sales < 200) {
			  commission=5;
			  
		 }else if(sales>=200 && sales < 500) {
			 commission=10;
			 
		 }else if ( sales >=500) {
			 commission=20;
			 
		 }else {
			 commission=0;
			 
		 }
		System.out.println("You commisssion is "+ commission);
	}

}
