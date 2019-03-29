package com.class4;

import java.util.Scanner;

public class ScannerCityAndTemperature {

	public static void main(String[] args) {
		/*
		*  Create a Java program that will ask user to enter city and temperature in Fahrenheit
		*  Your program should convert Fahrenheit into celsius and print  
		*  Your program should say "The temperature in the city ___is ___"
		*/
		String cityName;
		int temp;
		
		Scanner myScanner=new Scanner(System.in);
		System.out.println("Please enter your City;");
		cityName = myScanner.nextLine();
		
		System.out.println("Please enter your temprature in Fahrenheit");
		temp = myScanner.nextInt();
		// formula (F-32)x 5/9
		int convertedTemp=(temp-32)*5/9;
		System.out.println("The temperature in the city "+cityName+" is "+convertedTemp+"c");
		
	
		
		


	}

}
