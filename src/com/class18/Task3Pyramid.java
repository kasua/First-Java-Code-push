package com.class18;

public class Task3Pyramid {

	public static void main(String[] args) {
		/*
		 * 3. Print the following pattern:----->rows 5
           * 1
           * 12
           * 123
           * 1234
           * 12345   
		   * 
		   */
		
		  for(int a = 1; a <= 5; a++) {
          
              for(int b = 1; b <=a; b++) {
              
                 System.out.print(b);
              }
              System.out.println( );
          }
	      
	}

}
