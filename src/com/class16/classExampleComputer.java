package com.class16;

 public class classExampleComputer {

	String os, brand;
	boolean mouse, keyboard;
	int screen, ram;

	public static void main(String[] args) {

		classExampleComputer comp1 = new classExampleComputer();
		comp1.os = "Windows";
		comp1.mouse = true;
		comp1.keyboard = true;
		comp1.screen = 2;
		comp1.ram = 8;
		comp1.brand = "HP";

		comp1.watchMovie();
		comp1.doJavaCoding();
		comp1.playMusic();

		classExampleComputer comp2 = new classExampleComputer();
		comp2.mouse = false;
		comp2.keyboard = false;
		comp2.screen = 4;
		comp2.ram = 6;
		comp2.os = "Mac OS";
		comp2.brand = "Apple";

		comp2.watchMovie();
		comp2.doJavaCoding();
		comp2.playMusic();
	}

	void watchMovie() {
		System.out.println("We can watch movie on a classExampleComputer " + brand);
	}

	void doJavaCoding() {
		System.out.println("We can do Java coding on our classExampleComputer " + brand);
	}

	void playMusic() {
		System.out.println("We can play music on our classExampleComputer " + brand);
	}
}