package com.class6;

public class NotOperator {

	public static void main(String[] args) {
		/*
		 * not operator
		 * 
		 */
       boolean a=!true;
       System.out.println("The value of boolean variableClassA is "+a);
       
       boolean snow=true;
       //it is not snowing--> I will come to the class otherwise I will stay at home
       if(!snow) {
    	   System.out.println("Iwill come to the class");
       }
       
        int x= 10;
        int y=20;
        if (!(x>y)) {
        System.out.println("Hello");	
        }
	}

}
