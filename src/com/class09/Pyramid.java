package com.class09;

public class Pyramid {

	public static void main(String[] args) {
		
		 /*I want to print pattern
	       *   * --> rows=4, 
	       *   **
	       *   ***
	       *   *****
	       * 
	       */
	      
	      for (int i=0; i<4; i++) {
	          
	          for (int y=0; y<=i; y++) {
	              System.out.print("*");//
	          }
	          System.out.println();
	      }
	      
	     
	    }
	       
	} 
	
	


