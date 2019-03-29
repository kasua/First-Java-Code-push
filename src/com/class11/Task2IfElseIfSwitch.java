package com.class11;

public class Task2IfElseIfSwitch {

	public static void main(String[] args) {
		/*
		 * Create an array of countries. While retrieving all values from an array print
		 * capital for each country.
		 */

		String[] array = { "USA", "Russia", "Ethiopia", "Spain" };

		for (int i = 0; i < array.length; i++) {

			if (array[i].equals("USA")) {
				System.out.println("Washington DC");
			} else if (array[i].equals("Russia")) {
				System.out.println("Moscow");
			} else if (array[i].equals("Ethiopia")) {
				System.out.println("Addis");
			} else if (array[i].equals("Spain")) {
				System.out.println("Madrid");
			}
		}

		String[] countries = { "USA", "Afghanistan", "Kazakhstan", "Ukraine" };
		
		for (String country : countries) {

			switch (country) {
			
			case "USA":
				System.out.println("Washington DC");
				break;
			case "Afghanistan":
				System.out.println("Kabul");
				break;
			case "Kazakhstan":
				System.out.println("Astana");
				break;
			case "Ukraine":
				System.out.println("Kiev");
				break;
			}
		}
	}
}