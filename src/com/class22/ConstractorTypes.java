package com.class22;

public class ConstractorTypes {
	
	/*ConstractorTypes(){
		System.out.println("Iam a constractor with no parameters");
	}
 */
	ConstractorTypes(String str){ //str- is local variable to a contractor.
		System.out.println("Iam a constractor with 1 parameters"+str);
	}
	
	ConstractorTypes(int a, String str){
		System.out.println("Iam a constractor with 2 parameters"+a+"and"+str);
	}
	
	public static void main(String[] args) {
		//ConstractorTypes obj1=new ConstractorTypes();
		ConstractorTypes obj2=new ConstractorTypes("String");
		ConstractorTypes obj3=new ConstractorTypes(123,"String");
		
	}
}
