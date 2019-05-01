package com.class30;

import java.util.ArrayList;

class TaskArryList {
	 /*
	  * create a generic ArryList that will store 5 names into it.
	  * Find out whether the given ArryList is empty or not?
	  * Ckeck whether the specific name is present in an ArryList or not?
	  *Find the size of the ArryList and print all value from that. 
	  * 
	  */

public static void main(String[] args) {               
	
	ArrayList <String> names=new ArrayList <String>();      
	
	
	names.add("kasu");        
	names.add("John");        
	names.add("kirub");        
	names.add("Nolawi");        
	names.add("Gelila");               
	
	
	System.out.println(names.isEmpty());       
	System.out.println(names.contains("kasu"));       
	System.out.println(names.size());               
	
	
	for (String a:names) {       
		System.out.println(a);    
		}   
	}
}