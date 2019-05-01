package com.class22;

public class InheritanceExampleChild1 extends InheritanceExampleParent{

	String hairType="curly";
	
	public static void main(String[] args) {
		
		InheritanceExampleChild1 childObject=new InheritanceExampleChild1();
		System.out.println("Child 1 eye color "+childObject.eyeColor);
		System.out.println("Child 1 hair color "+childObject.hairColor);
		System.out.println("Child 1 has "+childObject.nose+" nose");
		
		childObject.sing();
		childObject.playTennis();
		
		InheritanceExampleChild2 childObject2=new InheritanceExampleChild2();
		System.out.println("Child 2 eye color "+childObject2.eyeColor);
		System.out.println("Child 2 hair color "+childObject2.hairColor);
		System.out.println("Child 2 has "+childObject2.nose+" nose");
		childObject2.playBascket();
		
		
		InheritanceExampleParent parentObject=new InheritanceExampleParent();
		//parentObject.hairType --> not accessible in Parent Class
		//parentObject.playTennis()--> not accessible in Parent Class
		
	}
	
	public void playTennis() {
		 System.out.println("Child 1 can sing");
		 System.out.println("Child 1 can play tennis"); 
		 System.out.println("Child 2 can playBascket");
		 
	}
}