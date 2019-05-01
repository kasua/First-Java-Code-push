package com.class07;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * create a boolean variableClassA workDay and assign true create int variableClassA day and
		 * assign it to 1 as long as it is workDay print--> "I need a day off" and
		 * increment day once day is 6 --> your condition for your loop should become
		 * false
		 */

		boolean workDay = true;
		int day = 1;

		while (workDay) {
			System.out.println("I don't need a day off");

			if (day == 6) {
				workDay = false;
				System.out.println("I need a day off");
			}
			day++;
		}
	}

}
