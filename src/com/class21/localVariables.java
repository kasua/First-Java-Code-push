package com.class21;

public class localVariables {

	public static void main(String[] args) {// can not use modifiers.
		
		String name="John";
		System.out.println(name);
		
		localVariables obj=new localVariables();
		obj.hello(name);//hello

	}
 
	public void hello(String name) {
		name="Jack";
		System.out.println("Hello"+name);
		
	}
}
