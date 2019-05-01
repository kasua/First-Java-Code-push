package com.class31;

//1.Create an arraylist of cars and retrieve all the values using 4 different ways.

import java.util.ArrayList;

//1.Create an arraylist of cars and retrieve all the values using 4 different ways.

import java.util.ArrayList;
import java.util.Iterator;

public class CarsArrayList {
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Toyota");
		cars.add("Nissan");
		cars.add("BMW");
		cars.add("Honda");
		
		System.out.println("--- for loop ---");
		
		//1.for loop
		for (int i = 0; i < cars.size(); i++) {
			System.out.println(cars.get(i));
		}
		System.out.println("--- advance for loop ---");
		
		//2. Advance loop
		for (String models : cars) {
			System.out.println(models);
		}
		System.out.println("--- using iterator ---");
		
		//3. iterator
		Iterator<String> models = cars.iterator();
		while (models.hasNext()) {
			System.out.println(models.next());
		}
		System.out.println("--- using while loop ---");
		
		 //4. while loop
		int i = 0;
		while (i < cars.size()) {
			System.out.println(cars.get(i));
			i++;
		}
	}
}