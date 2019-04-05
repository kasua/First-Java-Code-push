package com.class16;

// Create a Dog Class and create 3 different objects of it: 

// Husky, Bulldog, Labrador with specific attributes and behaviors.

    public class classExampleDog {

	 String breed, color;
	 int year;
	 
	 public static void main(String[] args) {                
		classExampleDog dog1=new classExampleDog();       
		
		dog1.breed="Husky";   
		dog1.color="white";            
		dog1.year=4;
		
		dog1.play();    
		dog1.jump();    
		dog1.run();    
	
		System.out.println("----------2rd object-----------------");
		
		classExampleDog dog2=new classExampleDog();       
		
		dog2.breed="Bulldog";    
		dog2.color="black";           
		dog2.year=3;
		
		dog2.play();    
		dog2.jump();    
		dog2.run();   
		
		System.out.println("----------3rd object-----------------");
		
		classExampleDog dog3=new classExampleDog();       
		
		dog3.breed="Labrador";   
		dog3.color="gray";       
		dog3.year=8;
		
		dog3.play();    
		dog3.jump();    
		dog3.run();               
		
	    }
	
	 void play() {        
		System.out.println("this Dog can play "+breed);   
		}

	void jump() {       
		System.out.println("This Dog can play "+breed);   
		}

	void run() {       
		System.out.println("This Dog can play "+breed);    
		
	}
    
  }