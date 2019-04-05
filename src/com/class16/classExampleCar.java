package com.class16;

public class classExampleCar {
	String make,model, color;
	int door, wheels;
	
	public static void main(String[] args) {
		
		//ClassName variable=new ClassName();
		//1 object
		
		classExampleCar car1=new classExampleCar();
		
		car1.make="Honda";
		car1.model="Civic";
		car1.color="Black";
		car1.door= 4;
		car1.wheels=4;
		
		//classExampleCar Honda has 4 wheels
		
	System.out.println( "classExampleCar "+car1.make+" has "+car1.wheels+" wheels");
	 // define behavior
	
	 car1.drive();
	 car1.reverse();
	 car1.stop();
	 
	System.out.println("---------second object-------------------");
	
	// 2 object
	
		classExampleCar car2=new classExampleCar();
		
		car2.make="Tesla";
		car2.model="X";
		car2.color="blue";
		car2.door= 4;
		car2.wheels=4;
		
		// my classExampleCar is blue Tesla
		System.out.println("my classExampleCar is "+car2.color+" "+car2.make);
		 car2.drive();
		 car2.reverse();
		 car2.stop();
	}
	
void drive() {
	 System.out.println(" can drive classExampleCar"); 
     }

void reverse() {
	 System.out.println("classExampleCar can be reverse");
    }
 
void stop() {
	 System.out.println("classExampleCar can stop");
   }

 }


