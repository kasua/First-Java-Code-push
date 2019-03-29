package com.class11;

public class Task32DArray {

	public static void main(String[] args) {
		// Create an array of cars: amerrican,german, korean,Italian.
		// Then retrieve all values from that array.

		  String[][] cars = {

				{ "Ford", "Lincoln", "GMC", "Buick" }, 
				{ "BMW", "MB", "Audi" },
				{ "KIA", "Hyundai", "Daewoo", "SsangYong" },
				{ "Alfa Romeo", "Ferrari", "Lamborghini", "Maserati" }, 
				};

		for (int a = 0; a < cars.length; a++) {
			for (int b = 0; b < cars[a].length; b++) {
				System.out.println(cars[a][b] + "-the cars");
			}
		}
	}
}
