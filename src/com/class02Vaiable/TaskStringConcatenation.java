package com.class02Vaiable;

public class TaskStringConcatenation {

	public static void main(String[] args) {
		
		/* 1. write a program to add,subtract,multiply and divide 2 decimal values.
		 your program should say The__of 2 decimal numbers___and___is equal to___*/
		 
		 
		     double a= 30.5;
		     double b= 10.2;
		     //double x=30.5, y=10.2
		     
		    System.out.println(a+b);
		 	System.out.println(a-b); 
		 	System.out.println(a*b); 
		 	System.out.println(a/b); 
		 	
		 	double sum= a+b;
		 	double sub=a-b;
		 	double mult=a*b;
		 	double div=a/b;
		 	
		 	System.out.println(sum);
		 	System.out.println(sub);
		 	System.out.println(mult);
		 	System.out.println(div);
		     
 System.out.println("the sum  of 2 decimal numbers  "+a+" and "+b+" is equal to "+sum);
 System.out.println("the sub of  2 decimal numbers  "+a+" and "+b+" is equal to "+sub);
 System.out.println("the mult of 2 decimal numbers  "+a+" and "+b+" is equal to "+mult);
 System.out.println("the div  of 2 decimal numbers  "+a+" and "+b+" is equal to "+ div);
 
 /*2. write a program to find the square of the number 3.9. 
 Your program should say The square of the __is __ 
 */
 
          double c=3.9;
          double square=c*c;
 
 System.out.println("the sqare of the 3.9 is "+square);
 
 /*3.write a program to print the area and perimeter of a rectangle with width=5 and height=8.
     your program should say.the perimeter of a rectangle with width___and 
     height___is equale to __and the area__  
  */
		
           int x=5;
           int y=8;
           int perimeter = 2*(x+y);
           int area = (x*y);
           
     System.out.println("The perimeter of a rectangle with width "+x+" and height "+y+" is equale to "+perimeter+" and the area "+area);
           
	}

}
