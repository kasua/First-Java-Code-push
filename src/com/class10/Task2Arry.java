package com.class10;

public class Task2Arry {

	public static void main(String[] args) {
	/*
	 * 2.Create an array of names and store all names of your group. 
	 * Then print your name from that array. (use 2 different ways of creating an array). 
	 */

		 String[] names= {"John", "Mike", "Jane", "Talgat", "Olga", "Mehmet", "Siyar"};
	        
	        int a=3;
	        System.out.println(names[a]);//Talgat
	       
	        a+=2;
	       System.out.println(names[a]);//Mehmet
	       
	        a-=4;
	        System.out.println(names[a]);//Mike
	        
	        int size=names.length;
	        System.out.println(size);
	        
//	        System.out.println(names[0]);
//	        System.out.println(names[1]);
//	        System.out.println(names[2]);
	        
	        for (int i=0; i<size; i++) {
	            System.out.println(names[i]);
	    }
	}        
	    
}


