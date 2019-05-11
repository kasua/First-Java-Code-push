package com.class34;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.jar.Attributes.Name;

public class MapOfCitiesFromArray {

	public static void main(String[] args) {
		
		String[] city = { "London", "Washington DC", "Paris", "Berlin", "Addis" }; 
		
		Map<String, Integer> cityMap = new LinkedHashMap();       
		for (String num : city) { 
			if (num.length() < 7) {
				cityMap.put(num, num.length()); 
				}
			}
		for (Map.Entry<String, Integer> entry : cityMap.entrySet()) {
			System.out.println(entry.getKey() + "  " + entry.getValue());
			} 
		Iterator<Map.Entry<String, Integer>> it = cityMap.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry entry = it.next();
			System.out.println(entry.getKey() + "  " + entry.getValue());        }
			}
		}