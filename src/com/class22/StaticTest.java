 package com.class22;
 
 //3.Write program that have static constructor and observe result. 

   public class StaticTest{
     
     /* See below - It is marked the constructor as static */
   
	   // public static StaticTest() {// static invalid modifier if use it compiler error
	  
	   public  StaticTest() { 
    	 
		   System.out.println("Static Constructor of the class");
      }
     
     public static void main(String args[]){
    	 
     
         /*Below: It is trying to create an object of the class
          *that should invoke the constructor
          */
         StaticTest obj = new StaticTest();// static is not allowed here
     }
   }
 