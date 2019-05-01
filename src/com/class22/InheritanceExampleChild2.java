package com.class22;

public class InheritanceExampleChild2 extends InheritanceExampleParent{
	
	String hairType="best curly";
	

	void playBascket() {
		System.out.println("Child 2 can play bascket");	
	}
	
	public static void main(String[] args) {
	
	InheritanceExampleChild2 childObject2=new InheritanceExampleChild2();
	System.out.println("Child 2 eye color "+childObject2.eyeColor);
	System.out.println("Child 2 hair color "+childObject2.hairColor);
	System.out.println("Child 2 has "+childObject2.nose+" nose");
  
	}
	
 }