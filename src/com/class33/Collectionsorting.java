package com.class33;

// 1. Create an ArrayList of Strings and using Collections class sort the values of that ArrayList.
//using Collections class sort the values of that ArrayList.

/*import java.util.ArrayList;
import java.util.Collections;

public class SortingArrayList {

	public static void main(String[] args)  {
        ArrayList<String> elements = new ArrayList<String>();
        elements.add(10);
        elements.add(20);
        elements.add(25);
        elements.add(5);
         System.out.println("ArrayList before sort --" + elements);
        // Sort ArrayList using sort() method
         Collections.sort(elements); 
        System.out.println("ArrayList after ascending Sort --" + elements);
    }
	
 }
*/

 //Java program to demonstrate working of Collections.sort() 
   import java.util.*;

  public class Collectionsorting {
	public static void main(String[] args) {
		
		// Create a list of strings
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Geeks");
		al.add("Friends");
		al.add("Dear");
		al.add("Is");
		al.add("Super");

		/*
		 * Collections.sort method is sorting the elements of ArrayList in ascending
		 * order. print the sorted list
		 */
		  Collections.sort(al);

		System.out.println("List after the use of " + " Collection.sort() : " + al);
		
		 /* Collections.sort method is sorting the 
        elements of ArrayList in ascending order. */
        Collections.sort(al, Collections.reverseOrder()); 
  
        // Let us print the sorted list 
        System.out.println("List after the use of" +  " Collection.sort() :" + al); 
	}
}