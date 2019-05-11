package com.class34;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TaskCity {

	public static void main(String[] args) {
		Map<String,Integer> cityMap=new TreeMap<>();
		cityMap.put("Paris",5);
		cityMap.put("Istanbul",8);
		cityMap.put("Amsterdam",9);
		cityMap.put("London",6);
		cityMap.put("Moscow",6);
		cityMap.put("Rio",3);
		
		
		
		Iterator<Map.Entry<String,Integer>> cityIt=cityMap.entrySet().iterator();
		
		while(cityIt.hasNext()) {
			Map.Entry<String, Integer> cc=cityIt.next();
			
			if(cc.getKey().length()>7) {
				cityIt.remove();
			}
			
		}
		System.out.println(cityMap);
			}
		
	}