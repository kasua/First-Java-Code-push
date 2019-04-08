package com.class7;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		//post increment & post decrement
       // a++;               a--;
		
		int a=299;
		int b =a++;// first assign the variableClassA----> increment the variableClassA
		          //(int b=a -->299;                 a=a+1 299+1 =300).
		
		System.out.println(a);// 300
		System.out.println(b);// b=a--> 299
		
		//post decrement x--;
		
		//int x=10;
		 //int y=x;
		
		//System.out.println(x+""+y);// 
		
		int z=10;
		int c=z--;
		System.out.println(z);//9
		System.out.println(c);// 10 c=z
	
	}
	

}
