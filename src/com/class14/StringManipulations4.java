package com.class14;

public class StringManipulations4 {

	public static void main(String[] args) {
		String str=" I am good tester # 1 ";
		String newStr=str.replace("a", "e");
		System.out.println(newStr);
		
		String newStr1=str.replace("good", "great");
		System.out.println(newStr1); 
		
		//what we are looking for to replace, new value
		String newStr2=str.replace(" tester", "programmer");
		System.out.println(newStr2);
		
		String newStr3= str.replace("Tester", "programmer");
		System.out.println(newStr3);
		
		str.replace("!", "?");
		System.out.println(str);
		
		str.replace("1", "2");
		System.out.println(str);
		
		// 2 print Hello World.
		String str1="12Hello 3234 World 46%^%";
		     
		String replacedNoNumbers =str1.replaceAll("[0-9]" , "");
		System.out.println (replacedNoNumbers);
		
		String  newString= str1.replaceAll("[^A-Z a-z]" , "");
		System.out.println (newString);
		
		//String replacedNoCharacter = replacedNoNumbers.replaceAll("[A-z a-z]" , " ");
		//System.out.println (replacedNoCharacter);
		
		//3 giteride off words
		
		String str2="1Hello123";
		System.out.println(str2.replaceAll("[^0-9]", ""));
	}

}
