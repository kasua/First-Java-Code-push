package com.class16;
/*
 * Create a Class main that should be a template for the DogClass. 
 * In this class you should specify the following attributes: 
 * breed, name, color and following behaviors: bark(), run(), play().
 * Create 3 different objects of it: Husky, Bulldog, Labrador  with specific  attributes and behaviors.
 * The output of the program should be as following:
 * 
 * Husky can bark
 * Husky can run
 * Husky can play
 * 
 * Bulldog can bark
 * Bulldog can run
 * Bulldog can play
 * 
 * Labrador can bark
 * Labrador can run
 * Labrador can play
 *  
 */

public class classExampleDog2 {

	String breed,name, color;
     int year;

	public static void main(String[] args) {
		 // dog1=husky.
		classExampleDog2 dog1 = new classExampleDog2();
        
		dog1.breed = "Husky";
		dog1.color = "white";
		dog1.year = 4;

		
		dog1.bark();
		dog1.run();
		dog1.play();
		
		System.out.println("----------2rd object-----------------");
		 // classExampleDog2=Bulldog
		classExampleDog2 dog2 = new classExampleDog2();

		dog2.breed = "Bulldog";
		dog2.color = "black";
		dog2.year = 3;

		dog2.bark();
		dog2.run();
		dog1.play();
		
		System.out.println("----------3rd object-----------------");
		 // dog3=Labrador
		classExampleDog2 dog3 = new classExampleDog2();

		dog3.breed = "Labrador";
		dog3.color = "gray";
		dog3.year = 8;

		dog3.bark();
		dog3.run();
		dog1.play();
	}

	void bark() {
		System.out.println(breed+ " can bark");
	}

	void run() {
		System.out.println(breed + " can run");
	}

	void play() {
		System.out.println(breed+ " can play");

	}

}