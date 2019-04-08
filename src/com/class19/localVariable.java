package com.class19;

/*
 * Here, age is a local variable. 
 * This is defined inside pupAge() method and its scope is limited to only this method.
 */

public class localVariable {
	
		   public void pupAge() {
		      int age = 0;//uses age without initializing it,  it would give an error at the time of compilation.
		      age = age + 7;
		      System.out.println("Puppy age is : " + age);
		   }

		   public static void main(String args[]) {
			   localVariable test = new localVariable();
		      test.pupAge();
		   }
		}


