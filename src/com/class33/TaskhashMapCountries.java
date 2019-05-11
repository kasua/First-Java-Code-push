package com.class33;
/*
 * Create a map of countries with its capital. 
 * Print all keys and values from a country map using for each loop and iterator.
 * Print all values from a country map using for each loop and iterator.
 */

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class TaskhashMapCountries {

	public static void main(String args[]) {

		// HashMap with Country name as key and capital as value
		// HashMap stores elements in key value pairs

		HashMap<String, String> countryCapitalMap = new HashMap<String, String>();

		countryCapitalMap.put("united States", "Washington Dc");
		countryCapitalMap.put("Ethiopia", "Addis Abeba");
		countryCapitalMap.put("Japan", "Tokyo");
		countryCapitalMap.put("France", "Paris");
		countryCapitalMap.put("Russia", "Moscow");
		countryCapitalMap.put("England", "Londen");
		countryCapitalMap.put("German", "Berlin");

		System.out.println("PRINTING ALL KEYS AND VALUES");

		System.out.println("Using for each loop------");

		Set<String> country = countryCapitalMap.keySet();

		for (String s : country) {

			System.out.println("Country " + s + " has capital city " + countryCapitalMap.get(s));

			/*for (String countryKey : countryCapitalMap.keySet()) {
				System.out.println("Country:" + countryKey + " and Capital:" + countryCapitalMap.get(countryKey));

			}*/

			System.out.println("Using iterator--------------");

			Iterator<String> itCountry = country.iterator();
			while (itCountry.hasNext()) {
				String c = itCountry.next();
				System.out.println("Country " + c + " has capital city " + countryCapitalMap.get(c));
			}
			/*System.out.println("PRINTING ONLY VALUES");

			Collection<String> capitals = countryCapitalMap.values();

			System.out.println("Using for each loop------");

			for (String s1 : country) {
				System.out.println("Capital city " + s1);
			}*/
			
			System.out.println("PRINTING ONLY key");
			
			Collection<String> capitals = countryCapitalMap.keySet();

			System.out.println("Using for each loop------");

			for (String s2 : capitals) {
				System.out.println("Capital city " + s2);
		}

	}
  }
}
	