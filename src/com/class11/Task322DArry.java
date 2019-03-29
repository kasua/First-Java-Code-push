package com.class11;

public class Task322DArry {

	public static void main(String[] args) {
		// Create an array of countries:
		// north america countries,
		// south america countries,
		// europe countries,
		// asian countries,
		// african countries. Then print all values from that array.

		String[][] countries = {
				
				{ "Antigua", " Barbuda", "Barbados", "Costa Rica" },
				
				{ "Argentina", "Brazil", "Ecuador" }, 
				
				{ "German", "Russia", "Grece", "France" },
				
				{ "Ethiopia", "Egypt", "Uganda", "Kenya" }, };
		
		for (int a = 0; a < countries.length; a++) {
			
			for (int b = 0; b < countries[a].length; b++) {
				
				System.out.println(countries[a][b] + "-the countries");
			}
		}
	}
}
