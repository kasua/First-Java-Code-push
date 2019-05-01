package com.class21;

public class InstanceVariable {
	
	String name="John";// instance variable can have access modifiers public,private,

	public static void main(String[] args) { //local variable
		
        String name =" Anna";
        System.out.println(name);
        name="Olga";
        System.out.println(name);
        
        InstanceVariable obj=new  InstanceVariable();
        System.out.println(obj.name);
        System.out.println("---chaning value of instance variable---");
        obj.name="Jack";
        System.out.println(obj.name);
       
        // creating second object
         InstanceVariable obj1=new InstanceVariable();
        System.out.println(obj1.name);
	}
	
	public void hello(String name) {
		System.out.println("Hello "+name);
	}

}
