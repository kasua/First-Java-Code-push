package com.class12;

import java.util.Scanner;

public class StringScannerSubstring {

	public static void main(String[] args) {
		/*
		 * Write a program that reads two people’s first names and if they expecting boy
		 * or girl? Based on the input suggests a name for a baby:Example Output:Mom’s
		 * first name? MaryDad’s first name? DanielBoy or Girl? boySuggested baby name:
		 * DANRYExample Output:Mom’s first name? MaryDad’s first name? DanielBoy or
		 * Girl? girlSuggested baby name: MAIEL
		 * 
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter Moms first name?");
		String momsName = input.nextLine();

		System.out.println(" Please enter Dad’s first name?");
		String dadName = input.nextLine();

		System.out.println(" please enter Boy or Girl?");
		String gender = input.nextLine();

		if (gender.equalsIgnoreCase("boy")) {
			System.out.println(dadName.substring(0, dadName.length() / 2) + momsName.substring(momsName.length() / 2));
			//
		} else if (gender.equalsIgnoreCase("girl")) {
			System.out.println(momsName.substring(0, momsName.length() / 2) + dadName.substring(dadName.length() / 2));
		} else {
			System.out.println("No Suggetion");
			;
		}

	}
}