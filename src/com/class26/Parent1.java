package com.class26;

class Parent{
	 
	  int a=10;
	  int b=20;
	  
	 void add(int a,int b){  
	   this.a=a;
	   this.b=b;
	  //System.out.println(a+b);  
	 }
   }
	 class Child extends Parent{ 
	    
	   int a=30;
	   int b=40;
        
	  void add(int a,int b){ 
	    System.out.println (a+b);
	    System.out.println (this.a+this.b);  
	    System.out.println (super.a+super.b);  
	  }
	 }

	