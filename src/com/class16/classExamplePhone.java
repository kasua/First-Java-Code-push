package com.class16;

// Create a Class “Phone”. Create 3 Objects of it: iPhone, Android, Nokia with
// specific attributes and behaviors.

public class classExamplePhone { // class

	// attributes/state

	String color, model, brand;
	int size, memory;

	// 3 Objects inside main method: iPhone, Android, Nokia.

	public static void main(String[] args) {

		classExamplePhone ph1 = new classExamplePhone();

		ph1.brand = "iphone";
		ph1.color = " Blak";
		ph1.size = 8;
		ph1.memory = 32;
		// behaviors.
		ph1.call();
		ph1.text();
		ph1.takePictures();

		System.out.println("----------------------2nd classExamplePhone---------------");

		classExamplePhone ph2 = new classExamplePhone();

		ph2.brand = "Android";
		ph2.color = "Gold";
		ph2.size = 10;
		ph2.memory = 64;
		// behaviors.
		ph2.call();
		ph2.text();
		ph2.takePictures();

		System.out.println("------------------------3rd classExamplePhone---------------");

		classExamplePhone ph3 = new classExamplePhone();

		ph3.brand = "Nokia";
		ph3.color = "Sliver";
		ph3.size = 10;
		ph3.memory = 32;
		// behaviors.
		ph3.call();
		ph3.text();
		ph3.takePictures();

	}

	void call() {
		System.out.println("You can call with your " + brand + " classExamplePhone");
	}

	void text() {
		System.out.println("You can text with your " + brand + " classExamplePhone");
	}

	void takePictures() {
		System.out.println("You can take picture with your " + brand + " classExamplePhone");
	}

}
