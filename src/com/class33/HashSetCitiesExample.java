package com.class33;

//3. Create an HashSet of cities and add duplicates into it.
//Retrieve all values from hashset in 2 different ways.    
//Retrieve all values in alphabetical order.

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetCitiesExample {

	public static void main(String[] args) {

		Set<String> popularCities = new HashSet<>();

		// Check if a HashSet is empty
		System.out.println("Is popularCities set empty? : " + popularCities.isEmpty());

		popularCities.add("London");
		popularCities.add("New York");
		popularCities.add("Paris");
		popularCities.add("Berlin");
		popularCities.add("Adis");
		popularCities.add("London");

		// Find the size of a HashSet
		System.out.println("Number of cities in the HashSet " + popularCities.size());

		// Check if the HashSet contains an element

		String cityName = "Paris";

		if (popularCities.contains(cityName)) {
			System.out.println(cityName + " is in the popular cities set.");
		} else {
			System.out.println(cityName + " is not in the popular cities set.");
		}

		System.out.println("== a HashSet using simple for-each loop ===");

		for (String popularCities1 : popularCities) {
			System.out.println(popularCities1);

			System.out.println("=== a HashSet using iterator() ===");

			Iterator<String> popularCities2 = popularCities.iterator(); 

			while (popularCities.hasNext()) {
				System.out.println(popularCities.next);

			}
		}
	}

}
