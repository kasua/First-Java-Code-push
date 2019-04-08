package com.class19;

public class VariableExampleStudent {

	/*
	 * Here is good example of using a static/ don't look at the constructor public
	 */
	
	       int rollno;        //instance variable       
	       String name;       
	       static String college ="ITS";     //static variable       
	 
	       
	 //constructor      
	 VariableExampleStudent(int r, String n){       
		 
		 rollno = r;       
		 name = n;      
		
	  }       
	 
	 //method to display the values      
	
	 void display (){          
		
		 System.out.println(rollno+" "+name+" "+college);           
		 }     
	 
	 public static void main(String args[]){              
		 
		 VariableExampleStudent s1 = new VariableExampleStudent(111,"Karan");     
		 VariableExampleStudent s2 = new VariableExampleStudent(222,"Aryan");  
		 
			 //we can change the college of all objects by the single line of code    
			 //Student.college="BBDIT";         
			 s1.display();     
			 s2.display();    
			 
	 }   
		 
 }
	 
	 