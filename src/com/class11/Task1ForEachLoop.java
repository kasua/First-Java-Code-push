package com.class11;

public class Task1ForEachLoop {

	public static void main(String[] args) {
		/*
		 * Create an array of cars and store 6 elements into it. 
		 * Using 2 different loops & print all values from the array.
		 *
		 */

		String[] cars = { "Audi", "BMW", "TOYOTA", "COROLLA", "Opel", "NISSAN" };

		for (String models : cars) {
			System.out.println(models);

			for (int i = 0; i < cars.length; i++) {

				System.out.println(cars[i]);
			}
		}
	}
}