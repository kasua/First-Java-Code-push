package com.class07;

public class OddNumbers {

	public static void main(String[] args) {
		// print only odd numbers from1 to 20
		
		int num=1;
		
		while(num<=20) {
			System.out.println("I am inside while loop");
			 //0.5
		
			if(num%2!=0) {
				System.out.println(num);
			}
				num++;
				
		// print only even  numbers from 10 to 100
				
				int num1=10;
				
				while(num1<=100) {
					
				System.out.println("I am inside while loop");
				
					if(num1%2==0) {
						System.out.println(num1);
					}
						num1++;
				}		
			}
		}
}