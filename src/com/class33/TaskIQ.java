package com.class33;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * How can you remove all duplicates from ArrayList?
 * 
 * List<String> aList=new ArrayList<String>(); 
 *  
 *  aList.add(“John”);      
 *  aList.add(“Jane”);      
 *  aList.add(“James”);      
 *  aList.add(“Jasmine”);       
 *  aList.add(“Jane”);       
 *  aList.add(“James”);
 * 
 */

public class TaskIQ {
	
	// The easiest way to remove repeated elements is to add the contents to a Set
	// (which will not allow duplicates) and then add the Set back to the ArrayList
	// :
	// Set<String> set = new HashSet<>(yourList); 
	//yourList.clear();
	// yourList.addAll(set)

	public static void main(String[] args) {  
		
		List<String> aList=new ArrayList<>();       
		
		aList.add("John");        
		aList.add("Jane");        
		aList.add("James");       
		aList.add("Jasmine");        
		aList.add("Jane");       
		aList.add("James");       
		
		Set<String> set = new HashSet<>(aList); 
		set.addAll(aList);       
		System.out.println(set); 
		}
	}
