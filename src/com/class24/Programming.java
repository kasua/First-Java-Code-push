package com.class24;
/*
 * 1. Create a class named ‘Programming’. While creating an object of the class, 
 * if nothing is passed to it, then the message “I love programming languages” should be printed. 
 * If some String is passed to it, then in place of “programming languages” 
 * value variable should be printed. Example, if we pass “Java”, then “I love Java” should be printe
 
 */

class Programming {

	public Programming() {
		System.out.println("I love proggraming languages");
	}

	public Programming(String str) {
		System.out.println("I love " + str);
	}

	public static void main(String[] args) {
		Programming obj = new Programming();
		Programming obj1 = new Programming("Java");
	}

}

/*
 * 2. Create 1 class with a static method that has 3 overloaded forms. Then call
 * each overloaded method with specific arguments and observe result. 
 *
 */

 class  Syntax {

	static void num() {
		System.out.println(0);
	}

	static void num(int a) {
		System.out.println(a);
	}

  static void num(int b, int a) {       
	System.out.println(a+b);
  }
  
	public static void main(String[] args) {
		Syntax.num();
		Syntax.num(10);
		Syntax.num(5,4);
	}
}
 /*
  * 3. Create 1 class with a private method that has 3 overloaded forms. Then call each
  * overloaded method with specific arguments and observe result.
  * 
  */
    
/* public class Java {

		private  void add(int a, int b) {
			System.out.println(a+b);

		}

		private void add(double a, int b) {
			System.out.println(a+b);

		}

		private void add(int b, int a,int c) {
			System.out.println(a+b+c);

		}

		public static void main(String[] args) {
			Java obj=new Java();
			obj.add(3, 2);
			obj.add(2.2, 3);
			obj.add(3, 4, 5);
			
		}
	}	
  */