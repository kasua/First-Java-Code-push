package com.class19;

/*   
 * Create a class call creatingClassAnimals have properties like breed, weight, age, name and 
 * methods line canBark,isWild & make the name variable static   
 *  Create another class called Application; from this application class create 3 different instances/objects
 *  of it and print the properties and functions/methods.
 */

 public class creatingClassAnimals {
     //object
	String breed = "Husky";
	int weight = 100;
	int age = 15;
	static String name = "George";

	// method
	boolean canBark() {
		return true;
		
	}

	boolean isWild() {
		return false;
	}


	 
	//public class Application {    
		
    	 public static void main (String[] args) {       
		
    	creatingClassAnimals anim = new creatingClassAnimals(); 
    	
		System.out.println("This is anim" );              
		System.out.println(anim.age);        
		System.out.println(anim.weight);       
		System.out.println(anim.breed);       
		System.out.println(anim.name);                
		
		anim.name = "Joe";        
		anim.age = 40;       
		
		System.out.println(anim.age);       
		
		creatingClassAnimals anim2 = new creatingClassAnimals();       
		System.out.println("This is anim2");
			       
		System.out.println(anim2.age);        
		System.out.println(anim2.weight);        
		System.out.println(anim2.breed);       
		System.out.println(anim2.name);               
		
		
		creatingClassAnimals anim3 = new creatingClassAnimals();              
		System.out.println("This is anim3");               
		
		System.out.println(anim3.age);               
		System.out.println(anim3.weight);               
		System.out.println(anim3.breed);                
		System.out.println(anim3.name);
	  }

   }
 
