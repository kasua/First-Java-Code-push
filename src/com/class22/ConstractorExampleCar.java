package com.class22;

public class ConstractorExampleCar {
	
	public static String make = "Toyota";    
	String color,model;   //declaring instance variable  
	int doors;
	boolean engine;
	
	ConstractorExampleCar(){//constructor       
		System.out.println("I am a constructor");        
		System.out.println("Hello from constructor");   
		}       
	
	public static void main (String[] args) {               
		ConstractorExampleCar obj = new ConstractorExampleCar();
		System.out.println(obj.color);
		System.out.println(obj.doors);
		System.out.println(obj.engine);
		//hello();
		
		}           
	
	public static void hello() { //method
		//before using local variable we have to initialize
		String name;
		//System.out.println(name);compiler will give you an error
		System.out.println("I am a static hello method");
	}
 }