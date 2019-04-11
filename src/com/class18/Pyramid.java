package com.class18;

public class Pyramid {

	public static void main(String[] args) {
		Pyramid pyra=new Pyramid();
		
		pyra.pyramidPrint();
		
		
		 /*I want to print pattern
	       *   * --> rows=4, 
	       *   **
	       *   ***
	       *   *****
	       * 
	       */
	}       
	
	void pyramidPrint () {
	
	      for (int i=0; i<4; i++) {
	          
	          for (int y=0; y<=i; y++) {
	              System.out.print("*");//
	          }
	          System.out.println();
	      }
	      
	     
	    }
	       
	} 
	
	


