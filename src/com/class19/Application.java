package com.class19;

public class Application {

	public static void main(String[] args) {       
		Human person1 = new Human();                       
		
		person1.print();       
		person1.eyeColour = "pink";       
		
		person1.print();       
		
		System.out.println(person1.eyeColour);       
		System.out.println(person1.height);       
		System.out.println(person1.weight);       
		System.out.println(person1.gender);       
		
		Human person2 = new Human();//        
		person2.eyeColour = "Orange";       
		
		System.out.println(person2.eyeColour);        
		System.out.println(person2.height);        
		System.out.println(person2.weight);        
		System.out.println(person2.gender);        
		person2.print();  
		
		
		 int my_array[] = { -1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };                
		 int[] array = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };               
		
		 System.out.println("Printing the minimum value");                               
		 System.out.println(Minimum.minOfValues(my_array));                
		
		 System.out.println(Minimum.maxOfValues(array));               
		 Minimum min = new Minimum();                
		 min.print();              
		 
		}
	
	}


