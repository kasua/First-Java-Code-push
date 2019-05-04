
package com.class33;

    //Create an HashSet of cities and add//duplicates into it. 
	//Retrieve all values from hashset in 2//different ways.
	//Retrieve  all  values  in  alphabetical order
	

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;import java.util.List;

class Cities {  
	
	public static void main(String[] args) {  
		
		HashSet<String> hset=new HashSet<String>();       
		
		hset.add("London");       
		hset.add("DC");       
		hset.add("Paris");        
		hset.add("Toronto");              
		System.out.println("Print cities without order "+hset);       
		
		hset.add("DC");       
		hset.add("London");               
		List<String>tlist= new ArrayList<String>(hset);       
		
		Collections.sort(tlist);        
		System.out.println("Using an Array List with collections.sort() "+tlist);               
		for(String st:tlist) {            
			System.out.println("Using adv. loop with Collections.sort() "+st);  
			}
		}
	}