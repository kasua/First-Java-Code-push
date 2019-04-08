package com.class19;
/*
 * Create a class call Animal have properies like breed, weight, age, name and 
 * methods line canBark,isWildmake the name variable static
 * Create another class called Application from 
 * this application class create 3 different instances/objects of it and print the properties and functions/methods
 */
public class Human {

	static String eyeColour = "Brown";
	int height = 6;
	int weight = 180;
	String gender = "F";
	
	String programmingLanguage = "java";

	void speak() {        
		
		String laguage = "English";       
		System.out.println("Humans can speak "  + laguage);   
	
		}
	

	void print() {
		System.out.println(eyeColour);
	}

	public static void main(String[] args) {       
		Human person = new Human();               
		Human person2 = new Human();       
		
		person.eyeColour = "Blue";        
		System.out.println(eyeColour);        
		System.out.println(person.eyeColour);
		//        System.out.println(person.height);
		//        System.out.println(person.weight);
		//        System.out.println(person.gender);   
		}    
	
	void coding() {       
			System.out.println("Syntax students can code" + programmingLanguage);   
			}
		}


