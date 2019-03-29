package com.class12;

public class stringBooleanValue {

	public static void main(String[] args) {
		/*Validate if the string ends with "u" prints the Boolean value accordingly
         *Validate if the string ends with "world" prints the Boolean value accordingly
         *Validate if the string ends with "are" prints the Boolean value accordingly
         *Validate if the string ends with "you" prints the Boolean value accordingly
		 */
		
		/*String s1="hello how are you"; 
		
		System.out.println(s1.endsWith("u")); 
		System.out.println(s1.endsWith("world")); 
		System.out.println(s1.endsWith("are"));
		System.out.println(s1.endsWith("you"));  
		*/
		
		  
		  String str = "abracadabra alakazam";
		  String target1 = "dab";
		  String target2 = "ABRA";
      
		  /*Print out the position of the first occurrence of "c"
		   * Print out the position of the first occurrence of " "
		   * Print out the position of the first occurrence of the variable target1
		   * Print out the position of the first occurrence of the variable target2  
           */
	    
		 
			System.out.println(str.indexOf("c"));
			System.out.println(str.indexOf(" "));
			System.out.println(str.indexOf("dab"));
			System.out.println(str.indexOf("ABRA"));
			
			String st = "laptops out for harambe";
			
			/* Output 1: print str starting at index 5 and going to the end
			 * Output 2:  print str starting at index 7 and ending at index 10
			 * Output 3: print "harambe" this must not be a new string must be from str
			 * Output 4: print "t f" this must not be a new string must be from str on one line
			 *
			 */
			System.out.println(st.substring(5, 19));
			
			System.out.println(st.substring(7, 10));
			
			
			System.out.println(st.substring(13, 19));
			
			
			System.out.print(st.charAt(3) +" ");
			
			System.out.println(st.charAt(10));
			
	}

}
