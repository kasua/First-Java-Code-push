package com.class7;

public class Task {

	public static void main(String[] args) {

		/*
		 * 1. Declare variable and increase by 100 using shorthand operator 2. Declare
		 * variable and decrease by 67 using shorthand operator 3. Declare variable
		 * cakePiece=11 and divide cakePiece between 4 people using shorthand operator
		 * each person should get an equal piece of cake
		 *
		 * 4. Declare variable cakePiece=25 and divide cakePiece between 7 peopuls using
		 * shorthand operator found out how many pieces of cake left after it was
		 * distributed equally among 7 people
		 */
        // int num1,num2,num3,num4.
		
		int i = 10;
		i += 100;
		System.out.println(i);// i=i+100
		  i -= 67;
		System.out.println(i); // a=a+67

		int cakePiece = 11;
		i /= 4;// i=i/11
		System.out.println(i);// 3

		//double cakePiece = 11;
		//cakePiece /= 4;
		
		System.out.println("Every person got "+cakePiece);//2
		
		int cakePieces = 25;
		
		cakePieces%=7;
		System.out.println("The left over "+cakePieces);//4
		
	}

}
