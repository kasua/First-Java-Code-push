package com.class19;
/*
 * 1) Local Variable  
 *  A variableClassA declared inside the body of the method is called local variableClassA.
 *  You can use this variableClassA only within that method and 
 *  the other methods in the class aren't even aware that the variableClassA exists.
 *  isWrittenCorrectly local variableClassA cannot be defined with "static" keyword.
 *  
 *  2) Instance VariableA variableClassA declared inside the class but outside the body of the method, 
 *  is called instance variableClassA. 
 *  It is not declared as static.It is called instance variableClassA 
 *  because its value is instance specific and is not shared among instances.
 *  
 *  3) Static variableA variableClassA which is declared as static is called static variableClassA. 
 *  It cannot be local. 
 *  You can create a single copy of static variableClassA and share among all the instances of the class.
 *   Memory allocation for static variableClassA happens only once when the class is loaded in the memory.
 * 
 */

public class variableClassA {
	
	int data =50; // instance variable -->A variable declared inside the class 
	              //but outside the body of the method, is called instance variable. 
	              //It is not declared as static.not shared among instances.  
	
	static int m=100; //static variable--->declared as static. It cannot be local. 
	                  //You can create a single copy of static variable and 
	                  //share among all the instances of the class. 
	
	void method() {
		
		int n =90;// local variable--->declared inside the body of the method .
		          // use this variable only within that method and the other methods in the class
		           //aren't even aware that the variable exists. cannot be defined with "static" keyword.
	}
  
  }//end of class
