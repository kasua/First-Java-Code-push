package com.class12;

public class TaskForAndForEachLoop {

	public static void main(String[] args) {
		/*
		 * Create a grocery list: fruits{} veggies{} dairy{} Retrive all values using 2
		 * different loops
		 */
		// 1st way
		String[][] grocery = { 
				{ "Orange", "banana", "apple" },
				{ "Potatos", "Tomatoes", "cucumber" },
				{ "Cheese", "Milk", "butter" } 
				};

		for (String[] list : grocery) {
			for (String items : list) {
				System.out.print(items + " ");
			}
			System.out.println();
		}

		// 2nd way
		for (int i = 0; i < grocery.length; i++) {
			for (int j = 0; j < grocery[i].length; j++)
				System.out.print(grocery[i][j] + " ");
		}

		System.out.println();

	}
}