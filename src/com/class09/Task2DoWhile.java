package com.class09;

import java.util.Scanner;

public class Task2DoWhile {

	public static void main(String[] args) {
		/*
		 * 2.Ask user to enter the item they want to buy and the price for the item.
		 * Then ask user to pay for it. Every time user enters money accumulate the
		 * amount and tell user how much is left to pay off the amount. Whenever user
		 * done with payments tell them "Thank you for shopping!"
		 * 
		 */

		Scanner scan;
		String item;
		double price;
		double money;
		double totalPayment = 0;
		double balance;

		scan = new Scanner(System.in);
		System.out.println("Please enter the item you want to buy");
		item = scan.nextLine();

		System.out.println("Please enter the price of the item");
		price = scan.nextDouble();

		do {
			System.out.println("Please pay for your item");
			money = scan.nextDouble();

			totalPayment = totalPayment + money;

			balance = price - totalPayment;
			System.out.println("Please add more $"  +balance);

		} while (totalPayment != price);

		System.out.println("Thank you for shoping " + item);

	}

}
