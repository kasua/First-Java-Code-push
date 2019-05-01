package com.class06;

import java.util.Scanner;

class Instractor {
	// write code below
	public static void main(String[] args) {

		String name;
		String instructor;

		Scanner scan = new Scanner(System.in);
		System.out.println("enter name of the instructor");

		name = scan.nextLine();

		switch (name) {

		case "Shiva":
			// System.out.println(" Will take care of Java Assignment")
			// or u can use a variableClassA(instructor).
			instructor = " Will take care of Java Assignment";
			break;
		case "Sandish":
			instructor = " Will take care of SDLC Assignment";
			break;
		case "Weqas":
			instructor = " Will take care of Selenium Assignment";
			break;
		case "Asel":
			instructor = " Will take care of every Assignment";
			break;

		default:

			instructor = " Invalid instructor selected";
			break;
		}

		System.out.println(instructor);
	}

}
