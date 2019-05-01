package com.class21;

public class CarIncrement {

	public String color;
	public static int totalCars;

	public static void main(String[] args) {
		CarIncrement car1 = new CarIncrement();
		car1.color = "white";
		CarIncrement.totalCars++;

		CarIncrement car2 = new CarIncrement();
		car2.color = "black";
		totalCars++;

		System.out.println("Total car we made is" + car2.totalCars);

	}

}
