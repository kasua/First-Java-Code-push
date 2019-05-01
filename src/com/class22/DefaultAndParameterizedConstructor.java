package com.class22;

public class DefaultAndParameterizedConstructor {
	
	private int var;
   
	//default constructor
    public DefaultAndParameterizedConstructor()
    {
        
    }
    //parameterized constructor
    public DefaultAndParameterizedConstructor(int num)
    {
           var = num;
    }
    public int getValue()
    {
            return var;
    }
    public static void main(String args[])
    {
    	DefaultAndParameterizedConstructor obj = new DefaultAndParameterizedConstructor();
    	DefaultAndParameterizedConstructor obj2 = new DefaultAndParameterizedConstructor(100);
            System.out.println("var is: "+obj.getValue());
            System.out.println("var is: "+obj2.getValue());
    }
}

