package com.class34;
/*
 *Create a Person class with following private fields: name, lastName, age, salary.
 *Variables should be initialized through constructor.
 *Inside the class also create a method to print user details.
 *In Test Class create a Map to store personId and a Person Object. 
 *Print each object details.Message Input 
 * 
 */

import java.util.HashMap;
import java.util.Map;

public class Person {

		String name;
		String lastName;;
        int age;
        double salary;
      
        Person(String name,String lastName,int age,double salary){
       
        this.name = name;       
        this.lastName = lastName;       
        this.age = age;       
        this.salary = salary;
	}
        public void userDetail() {
        	
        	System.out.println(name+" "+lastName+ " is "+ age+" years old and his salary is:"+salary);
        	
        }
        public static void main(String[] args) {
        	
        	Map<Integer,Person>person=new HashMap();        
        	
        	person.put(101, new Person("John","Smith",33,35000));       
        	person.put(102, new Person("Tim","James",43,135000));        
        	person.put(103, new Person("John","Brown",23,15000));        
        	person.put(104, new Person("Sara","Bill",73,335000));                
        	
        	
        	for(Person detail:person.values()) { 
        		detail.userDetail(); 
        		} 
        	}
        }


